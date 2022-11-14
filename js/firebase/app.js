import { logPageView } from "./analytics.js";

$(document).ready(function () {
  var pageName = $(this).attr("id");
  logPageView("page_view from: " + pageName);

  $("#githubLink").click(function () {
    logEvent("Open Github Link");
  });
});

function logEvent(eventName) {
  logPageView("Event: " + eventName);
}
