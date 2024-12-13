package com.braiso_22.web.main_page

import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import kotlinx.coroutines.flow.MutableSharedFlow
import kotlinx.coroutines.flow.asSharedFlow
import kotlinx.coroutines.launch

class MainPageViewModel : ViewModel() {
    private val _eventFlow = MutableSharedFlow<Action>()
    val eventFlow = _eventFlow.asSharedFlow()

    fun onEvent(event: Event) {
        when (event) {
            Event.ClickCv -> {
                viewModelScope.launch {
                    // TODO: change
                    _eventFlow.emit(
                        Action.OpenUrl(
                            "cv.pdf"
                        )
                    )
                }
            }

            Event.ClickEmail -> {
                viewModelScope.launch {
                    _eventFlow.emit(Action.ShowCopiedEmail)
                }
            }

            Event.ClickGithub -> {
                viewModelScope.launch {
                    _eventFlow.emit(Action.OpenUrl("https://github.com/braiso-22"))
                }
            }

            Event.ClickLinkedin -> {
                viewModelScope.launch {
                    _eventFlow.emit(
                        Action.OpenUrl(
                            "https://www.linkedin.com/in/brais-fern%C3%A1ndez-v%C3%A1zquez-93490a211/"
                        )
                    )
                }
            }
        }
    }
}

sealed interface Event {
    data object ClickEmail : Event
    data object ClickCv : Event
    data object ClickLinkedin : Event
    data object ClickGithub : Event
}

sealed interface Action {
    data object ShowCopiedEmail : Action
    data class OpenUrl(val url: String) : Action
}