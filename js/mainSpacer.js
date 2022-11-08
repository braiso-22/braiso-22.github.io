$(document).ready(function () {
  resizeMainSpace();
  $(window).resize(function () {
    resizeMainSpace();
  });
});

function resizeMainSpace() {
  var main = $("main");
  main.css("margin-top", $("header").outerHeight() + "px");
}
