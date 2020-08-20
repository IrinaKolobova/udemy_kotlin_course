package basics

fun main() {
    val props = System.getProperties()

    with(props) {
        list(System.out) //props.list(System.out)
        println(propertyNames().toList()) // props.propertyNames().toList()
        println(getProperty("user.home"))
    }
}