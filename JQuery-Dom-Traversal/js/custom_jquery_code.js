
$(function(){
  $("#books_div div.book").children("button").on("click", function(){
      $(this).parent().css("background-color", "yellow");
      $(this).hide();
      let dataPrice =  $(this).parent().attr('data-price');
      let dataAuthor =  $(this).parent().attr('data-author');
      let info =  '<p>Author: ' + dataAuthor + '<br>Price: ' + dataPrice + '</p>';
      $(this).parent().append(info).css("font-weight","bold");
    })

    //$("span.child").prev().css({"color": "chocolate", "border": "2px solid chocolate"});

    // $("span.child").parents().css({"color": "chocolate", "border": "2px solid chocolate"});

    //$("span.child").parent().css({"color": "chocolate", "border": "2px solid chocolate"});

    //$("span").css({"color": "chocolate", "border": "2px solid chocolate"});
    
    //$("span").css({"color": "chocolate", "border": "2px solid chocolate"});

    //$("ul").find("li").first().next().css({"color": "chocolate", "border": "2px solid chocolate"});
    
    //$("p").parent().css({"color": "chocolate", "border": "2px solid chocolate"});

    //$("li").children().css({"color": "chocolate", "border": "2px solid chocolate"});

});
