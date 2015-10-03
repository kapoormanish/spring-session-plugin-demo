package test.with.plugin

class UtilsController {
    
    def addToSession() { 
        session.name = "SOme name"
        render"Session: ${session.name}"
    }

    def viewFromSession(){
        render"Session: ${session.name}"
    }

}
