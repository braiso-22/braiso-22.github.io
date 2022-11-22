import { app } from "./firebase-imports.js";
import {
  getAuth,
  signInWithPopup,
  signInWithRedirect,
  GoogleAuthProvider,
  onAuthStateChanged,
  signOut,
} from "https://www.gstatic.com/firebasejs/9.14.0/firebase-auth.js";

const auth = getAuth(app);
const provider = new GoogleAuthProvider();

export function signInWithGoogle() {
  //signInWithRedirect(auth, provider);

  signInWithPopup(auth, provider)
    .then((result) => {
      // This gives you a Google Access Token. You can use it to access the Google API.
      const credential = GoogleAuthProvider.credentialFromResult(result);
      const token = credential.accessToken;
      // The signed-in user info.
      const user = result.user.auth.currentUser;
      console.log({ user });
    })
    .catch((error) => {
      // Handle Errors here.
      const errorCode = error.code;
      const errorMessage = error.message;
      // The email of the user's account used.
      const email = error.email;
      // The AuthCredential type that was used.
      const credential = GoogleAuthProvider.credentialFromError(error);
      console.log({ errorCode, errorMessage, email, credential });
    });
}

export function signOutUser() {
  signOut(auth)
    .then(() => {
      console.log("User signed out");
    })
    .catch((error) => {
      console.log({ "Error signing out": error });
    });
}

//const estados = { unknow: 0, authenticated: 1, notAuth: 2 };


export function onAuthStateChangedImp(updateUI) {
  onAuthStateChanged(auth, (user) => {
    if (user) {
        // User is signed in, see docs for a list of available properties
        updateUI("#button-login", "#button-signout");
    } else {
        // User is signed out
        updateUI("#button-signout", "#button-login");
    }
  });
}
