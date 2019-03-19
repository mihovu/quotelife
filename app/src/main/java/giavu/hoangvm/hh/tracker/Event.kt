package giavu.hoangvm.hh.tracker

sealed class Event(val eventName: String) {
    object FirstOpen : Event("HOI_first_open")
    object LoginSuccess: Event("login_success")
}
