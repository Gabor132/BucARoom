/* 
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/* global errorHandler */

$(document).ready(function(){
    getAllRooms();
});

function getRoomById(){
    var id = $("#id").val();
    $("#id").val("");
    if(id === '') return;
    if(id){
        $.ajax({
            type:"GET",
            url: "room/getById/"+id,
            success: function(room){
                if(room !== ""){
                    var table = $("#tableBody");
                    $(".room").remove();
                    var roomRow = roomToTableRow(room);
                    table.append(roomRow);
                }else{
                    errorHandler.alertError("No room with that id!");
                }
            },
            complete: function(x){
                console.log(x.status);
            }
        });
    }
}

function getRoomById(id){
    ajaxGET("room/getById"+id, preGetById, succesGetById, completeGetById, failGetById);
}

function preGetById(){
    
}

function getRoomByRoomNumber(number){
    ajaxGET("room/getByNumber/"+number,preGetByRoomNumber, succesGetByRoomNumber, completeGetByRoomNumber, failGetByRoomNumber);
}

function preGetByRoomNumber(number){
    if(number === '') return;
}

function succesGetByRoomNumber(room){
    return room;
}

function completeGetByRoomNumber(x){
    console.log(x.status);
}

function failGetByRoomNumber(x){
    return null;
}

function roomToTableRow(room){
    var tr = $("<tr class=\"room\"></tr>");
    var tdId = $("<td></td>").append(room.id);
    var tdRoomNumber = $("<td></td>").append(room.roomNumber);
    var tdRoomFloor = $("<td></td>").append(room.roomFloor);
    var tdCanBeReserved = $("<td></td>").append(room.canBeReserved);
    tr.append(tdId);
    tr.append(tdRoomNumber);
    tr.append(tdRoomFloor);
    tr.append(tdCanBeReserved);
    return tr;
}

function getAllRooms(){
    ajaxGET("room/all",preGETAllRooms,succesGETAllRooms);
}

function preGETAllRooms(){
    $(".room").remove();
}

function succesGETAllRooms(listRooms){
    var table = $("#tableBody");
    if(listRooms){
        for(var i = 0; i< listRooms.length;i++){
            var elem = roomToTableRow(listRooms[i]);
            table.append(elem);
        }
    }else{
        alert("There is no user submited");
    }
}

$(function(){
    $('.formRoom').on('submit', function(e){
        addRoom();
        e.preventDefault();
        getAllRooms();
    });
});

function addRoom(){
    var roomNumber = $("#roomNumber").val();
    $("#roomNumber").val('');
    var roomFloor = $("#roomFloor").val();
    $("#roomFloor").val('');
    var canBeReserved = $("#canBeReserved").val();
    $("#canBeReserved").val('');
    if(roomNumber==='' || roomFloor==='' || canBeReserved==='') return;
    var sendInfo = {
        roomNumber: roomNumber,
        roomFloor: roomFloor,
        canBeReserved: canBeReserved
    };
    $.ajax({
        type: "POST",
        url: "room/addRoom",
        dataType: "json",
        success: function (room) {
            if(room === ''){
                errorHandler.alertError('Room '+roomNumber+' already exists');
            }else{
                errorHandler.alertError('Added room '+room.roomNumber);
            }
        },
        complete: function(x){
            console.log(x.status);
            if(x.status >= 500){
                alert("SERVER FAILED!");
            }else if(x.status >= 400){
                alert("CLIENT FAILED!");
            }
        },
        data: sendInfo
    });
    
}
