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

    //val message: String
    
    //if (isUserHappy()){
    //    message = "cool tu est heureux ! :D"
    //} else {
    //    message = "qu'est-ce qui ne va pas ? :("
    //}


    // en Kotlin une variable peut être null grace a l'indice ? ici dans String ?
    var message: String? = "Ce message peut etre null !"
    //message.toUpperCase()
    //la variable peut possiblement être null donc le toUpperCase ne fonctionne pas 

    //En indiquant une variable comme pouvant "possiblement" contenir une valeur nulle, vous indiquez aux autres développeurs que cette variable pourra sûrement contenir une valeur nulle : ils devront donc absolument prendre leurs précautions en la manipulant.

    //A la place nous pouvons faire:

    //message?.toUpperCase()

    //ou encore

    //if (message != null) message.toUpperCase()

    println(message)



    //il est possible de faire référence à une variable locale grace au symbole $ exemple:

    val name4 = "Maxou"
    println("Hello $name4")

    // Sortie: Hello Maxou
    //Cela peut servir pour afficher des messages de débogages directement dans la console


    //création d'une constante en JAVA: 
    //public static final String SERVER_URL = "https://vanezia.fr/";

    //en Kotlin le mot clé static n'existe plus !! 
    //équivalence sous Kotlin:
    
    //const val SERVER_URL: String = "https://vanezia.fr/"
    //le mot clé const suivi de val permet de définir une constante dont la valeur sera connue au moment de la compilation. celle-ci ne pourra pas être modifiée lors de l'exécution de votre programme !





    //si je ne veux pas initialiser la var immédiatement après sa déclaration, mais le faire un peu plus tard, si l'on écrit la ligne suivante kotlin refuse de compiler:

    //var username: String

    //nous allons tout simplement utiliser le mot-clé lateinit 

    //private lateinit var submitButton: Button

    //override fun onCreate(savedInstanceState: Bundle?) {
    //    super.onCreate(savedInstanceState)
    //    submitButton = this.getSubmitButton()
    //}
}

//bon passons à autre chose et décortiquons une fonction toute simple:


//fun main(args: Array<String>) {
//    println("Hello, world!")
//}

//le mot clé fun suivi de son nom permet de définir une fonction et de la nommer

//le type du paramètre ( Array<String> ) est indiqué après son nom args / les : indiquent la déclaration d'un type 

//nous affichons du texte dans la console en utilisant ( println() )  c'est léquivalent de System.out.println en Java la encore pas besoin de point virgule 



//ajout d'un peu de complexité

private fun minOf(a: Int, b: Int): Int {
    return if (a < b) a else b
}
//les paramètres de la fonction sont séparés par une virgulle, comme en Java en revanche pour return une valeur de type Int nous allons utiliser les :  à la fin de la fonction