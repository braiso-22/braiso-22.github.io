import {app} from "./firebase-imports.js";
import { getAnalytics, logEvent } from "https://www.gstatic.com/firebasejs/9.14.0/firebase-analytics.js";

const analytics = getAnalytics(app);

export function logView(pageName) {
    logEvent(analytics, pageName);
}
