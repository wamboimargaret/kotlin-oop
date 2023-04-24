fun main() {
    var introduces = Person("Mary",20,"female")
    introduces.introduce()
    var student= Student("Lynn",7,"male",7)
    student.study()
    var vehicle= Vehicle("Mitsubishi","Eclipse cross",2015)
    vehicle.start()


}
//Create a class called Person that has the properties name, age, and gender.
//Create a constructor that sets these properties, and a method called introduce that
//prints out a message introducing the person.
open class Person(var name:String,var age:Int, var gender:String){
    fun introduce(){
        println("Hi my name is $name, I am $age old and I am a $gender")
    }
}
//Create a class called Student that inherits from the Person class.
//Add a property called grade and a method called study that
//prints out a message indicating that the student is studying.
class Student(name:String,age:Int, gender:String,val grade:Int):Person(name,age,gender) {
    fun study(){
        println("Hi my name is $name ,I am in grade $grade and I am studying")
    }
}
//Create a class called Vehicle that has the properties make, model, and year.
//Create a constructor that sets these properties, and a method called start that
//prints out a message indicating that the vehicle has started.
open class Vehicle(var make:String,var model:String, var year:Int){
    open fun start(){
        println("The $make $model has started")
    }
}
