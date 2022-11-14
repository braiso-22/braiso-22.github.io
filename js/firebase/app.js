import { logPageView } from "./analytics.js";

$(document).ready(function () {
  var pageName = $("main").attr('id');
  logPageView("page_view from: " + pageName);
});