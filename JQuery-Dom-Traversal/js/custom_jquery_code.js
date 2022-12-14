
$(function(){
  $("#books_div div.book").children("button").on("click", function(){
      $(this).parent().css("background-color", "yellow");
      $(this).hide();
      let dataPrice =  $(this).parent().attr('data-price');
      let dataAuthor =  $(this).parent().attr('data-author');
      let info =  '<p>Author: ' + dataAuthor + '<br>Price: ' + dataPrice + '</p>';
      $(this).parent().append(info).css("font-weight","bold");
    })
});
