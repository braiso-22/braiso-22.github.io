$(document).ready(function () {
  resizeAnchorSpace();
  $(window).resize(function () {
    resizeAnchorSpace();
  });
});

function resizeAnchorSpace() {
  $(".anchor").each(function () {
    $(this).css("height", $("header").outerHeight() + "px");
    $(this).css("margin-top", "-" + $("header").outerHeight() + "px");
  });
}
