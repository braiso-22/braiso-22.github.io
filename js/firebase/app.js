import { logView } from "./analytics.js";
import {
  signInWithGoogle,
  signOutUser,
  onAuthStateChangedImp,
} from "./auth.js";

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
  onAuthStateChangedImp(change);
});

function logEvent(eventName) {
  logView("Event: " + eventName);
}

function change(toHide, toShow) {
  $(toHide).addClass("hidden");
  $(toShow).removeClass("hidden");
}
