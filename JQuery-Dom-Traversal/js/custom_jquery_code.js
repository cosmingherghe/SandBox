
$(function(){
  // $("#books_div div.book").children("button").on("click", function(){
  //   $(this).parent().css("background-color", "yellow");
  //   $(this).hide();
  //   let dataPrice =  $(this).parent().attr('data-price');
  //   let dataAuthor =  $(this).parent().attr('data-author');
  //   let info =  '<p>Author: ' + dataAuthor + '<br>Price: ' + dataPrice + '</p>';
  //   $(this).parent().append(info).css("font-weight","bold");
  // });

  $("#books_div button").on("click", function(action){
    $(this).closest(".book").css("background-color", "yellow");
    $(this).hide();
    let dataPrice =  $(this).closest(".book").data('price');
    let dataAuthor =  $(this).closest(".book").data('author');
    let info =  '<p>Author: ' + dataAuthor + '<br>Price: ' + dataPrice + '</p>';
    $(this).parent().append(info).css("font-weight","bold");
    action.stopPropagation();
  });

  $("div.book").on("click", function(){
    alert("To see info please click the button.");
  });

  $("#books_completed > .book").on("click", "button", function(action){
    $(this).closest(".book").css("background-color", "yellow");
    $(this).hide();
    let dataPurchased =  $(this).closest(".book").data('purchased');
    let dataAuthor =  $(this).closest(".book").data('author');
    let dataMyRating =  $(this).closest(".book").data('myrating');
    let info =  '<p>Author: ' + dataAuthor + '<br>Purchased: ' + dataPurchased + '<br>Rating: ' + dataMyRating + '</p>';
    $(this).parent().append(info).css("font-weight","bold");
    action.stopPropagation();
  });

    //$("span.child").prev().css({"color": "chocolate", "border": "2px solid chocolate"});

    // $("span.child").parents().css({"color": "chocolate", "border": "2px solid chocolate"});

    //$("span.child").parent().css({"color": "chocolate", "border": "2px solid chocolate"});

    //$("span").css({"color": "chocolate", "border": "2px solid chocolate"});
    
    //$("span").css({"color": "chocolate", "border": "2px solid chocolate"});

    //$("ul").find("li").first().next().css({"color": "chocolate", "border": "2px solid chocolate"});
    
    //$("p").parent().css({"color": "chocolate", "border": "2px solid chocolate"});

    //$("li").children().css({"color": "chocolate", "border": "2px solid chocolate"});

});
