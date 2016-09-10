
function ErrorHandler(){
    this.alertError = function(message){
        switch(message){
            case 404: createErrorBubble(message);
                break;
            default: createErrorBubble(message);
        }
    };
};

function createErrorBubble(message){
    var body = $("body");
    var bubble = $("<div class=\"bubble\"></div>");
    bubble.append(message);
    body.append(bubble);
    setTimeout(disableErrorBubble, 2000);
}

function disableErrorBubble(){
    $(".bubble").remove();
}

var errorHandler = new ErrorHandler();