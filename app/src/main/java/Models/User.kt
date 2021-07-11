package Models

import java.io.Serializable

class User : Serializable {
    var name:String? = null
    constructor(name:String? = null){
        this.name = name
    }
    constructor()
}