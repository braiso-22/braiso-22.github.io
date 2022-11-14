// Import the functions you need from the SDKs you need
import { initializeApp } from "https://www.gstatic.com/firebasejs/9.14.0/firebase-app.js";
import {
  getAuth,
  GoogleAuthProvider,
  signInWithPopup,
} from "https://www.gstatic.com/firebasejs/9.14.0/firebase-auth.js";
import { getFirestore } from "https://www.gstatic.com/firebasejs/9.14.0/firebase-firestore.js";
// TODO: Add SDKs for Firebase products that you want to use
// https://firebase.google.com/docs/web/setup#available-libraries

// Your web app's Firebase configuration
// For Firebase JS SDK v7.20.0 and later, measurementId is optional
const firebaseConfig = {
  apiKey: "AIzaSyAPfCNlTFYZLiTqzrJg_ydHGS4rkmW7jbM",
  authDomain: "braiso-22.firebaseapp.com",
  projectId: "braiso-22",
  storageBucket: "braiso-22.appspot.com",
  messagingSenderId: "936542931828",
  appId: "1:936542931828:web:1f75ae0e3d34f94e223a21",
  measurementId: "G-VWXYMGQB13",
};

// Initialize Firebase
export const app = initializeApp(firebaseConfig);
