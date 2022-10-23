class Student(var name:String, var age:Int) {
    def printInfo(): Unit = {
        println(name + ", " + age + ", " + Student.school)
    }
}

object Student {
    val school:String = "SMK Tinggi Port Dickson"
}   
