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


//en kotlin comme en java if est une expression et non pas une instruction

//différence expression // instruction:

//expression est une combinaison d'un ou plusieurs valeurs, constantes, variables, opérateurs et fonctions exemple

//une expression est toute partie du code qui peut retourner une valeur Ainsi, 1+1 est une expression, maxOf(5, 7) est une expression, etc.


//une instruction a l'inverse est la plus petite partie d'un élément indépendant de votre code qui attend qu'une action soit effectuée 

//une instruction est un bloc de code qui ne retourne aucune valeur. par exemple, var username = "Maxou"

//la plupart des structures de contrôles sont considérés comme des expressions par exemple println("hello world") retourne en réalité une valeur de type Unit, le type par défaut créé par kotlin. il correspond au void en Java

//nous pouvons donc faire cela:

fun test(args: Array<String>) {
    println("Hello, world!")
}

var hello: Unit = test(arrayOf(""))


//comme if est considéré comme une expression nous pouvons faire cela avec minOf()

//private fun minOf(a: Int, b: Int): Int = if (a < b) a else b

//dont on peut encore optimiser la lisibilité grâce à l'inférence type: 

//private fun minOf(a: Int, b: Int) = if (a < b) a else b


//nous venons de créer une fonction qui n'a pas de corp c'est à dire qu'elle n'a pas de { }  mais une expression à la place, mais cette syntaxe ne se limite pas seulement aux fonctions:

fun sayHello() = println("Hello !")

//équivaut à:

//fun sayHello(): Unit = println("Hello !")

//équivaut à:

//fun sayHello(): Unit { println("Hello !") }

//le but de kotlin étant de rendre le code le plus lisible possible afin d'améliorer la productivité


//si la fonction possède un corps et que l'on souhaite retourner une valeur l'inférence de type ne fonctionneras pas dans ce csa-là. kotlin a fait ce choix afin d'optimiser les performances de son compilateur.



//exercice exemple:

// Corrigez cette fonction
//fun sayMyName(name: String) { println(name) }

// Simplifiez cette fonction
//fun sayHello() =  "Hello"

// Simplifiez cette fonction
//fun isStudent(isLearning: Boolean) = if (isLearning) true else false


//fun main(args: Array<String>) {
//    println( sayHello() )
//    sayMyName("Name") 
//    println( "Is Student : ${isStudent(true)} " ) 
//}





//public class User {
    
    // PROPERTIES
//    private String email;
//    private String password;
//    private int age;
    
    // CONSTRUCTOR
//    public User(String email, String password, int age){
//        this.email = email;
//        this.password = password;
//        this.age = age;
//    }
    
    // GETTERS
//    public String getEmail() { return email; }
//    public String getPassword() { return password; }
//    public int getAge() { return age; }
    
    // SETTERS
//    public void setEmail(String email) { this.email = email; } 
//    public void setPassword(String password) { this.password = password; }
//    public void setAge(int age) { this.age = age; }
    
//}

//voici une classe user en java


//class User(var email: String, var password: String, var age: Int)

//et voici la même classe en kotlin

//il y a le mot clé class pour déclarer la classe suivi du nom de celle-ci: User , de plus les propriétés sont directement renseignées dans des parenthèses, ces parenthèses définissent le constructeur de la classe

//mais ou est le public ??

//en kotlin la visibilité par défaut de n'importe quel élement est public, on retrouve en kotlin 4 principaux modificateurs de visibilité pour les membres que voici:



//private  : Un membre déclaré comme  private  sera visible uniquement dans la classe où il est déclaré.

//protected  : Un membre déclaré comme  protected  sera visible uniquement dans la classe où il est déclaré ET dans ses sous-classes (via l’héritage).

//internal : Un membre déclaré comme  internal  sera visible par tous ceux du même module. Un module est un ensemble de fichiers compilés ensemble (comme une librairie Gradle ou Maven, par exemple).

//public  : Un membre déclaré comme  public  sera visible partout et par tout le monde.


//class User(var email: String, var password: String, var age: Int)

//val user = User("Hello@gmail.com", "azerty", 27)
//println(user.email) // Getter
//user.email = "new_email@gmail.com" // Setter


//si je ne veux pas qu'une valeur soit modifiée j'utilise val à la place de var voici la nouvelle classe:

//class User(val email: String, var password: String, var age: Int)