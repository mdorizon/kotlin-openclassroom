fun main() {
    
    // en kotlin pour déclarer une variable on ne fait pas String question = "la question"; mais soit
    
    // 1
    val question = "1"
    
    // 2
    val question2: String = "2"
    
    // 3
    var question3: String = "3"

    println(question + question2 + question3)

    // val: imuable (non modifiable) var: muable (modifiable) ((  l'imuable est conseillé afin de rendre le code le plus proche possible du style de la programmation fonctionnelle ))


    // kotlin == langage intelligent donc

    val name: String = "maxou"
    val age: Int = 17
    val isDeveloper: Boolean = true

    println("sans utilisation langage intelligent:" + name + age + isDeveloper)

    //équivaut à

    val name1 = "maxou"
    val age1 = 17
    val isDeveloper1 = true

    println("utilisation langage intelligent" + name1 + age1 + isDeveloper1)

    // la cerise sur le gateau: le ; n'est pas nécessaire 

    

    
    
}