import { logView } from "./analytics.js";
import { signInWithGoogle, signOutUser} from "./auth.js";

$(document).ready(function () {
  var pageName = $(this).attr("id");
  logView("page_view from: " + pageName);

  $("#githubLink").click(function () {
    logEvent("Open Github Link");
  });

  $("#button-login").click(function () {
    logEvent("Login Button Clicked");
    signInWithGoogle();
  });

  $("#button-signout").click(function () {
    logEvent("Signout Button Clicked");
    signOutUser();
  });

});

function logEvent(eventName) {
  logView("Event: " + eventName);
}
