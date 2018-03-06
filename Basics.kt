fun main(args: Array<String>) {
	
    
    val sample1 = 0x3A
    var sample2 = 58
    var heartRate: Int = 85
    var desposits = 135002796
    val acceleration = 9.800f
    var mass = 14.6f
    var distance = 129.763001
    var lost = true
    var expensive = true
    var choice = 2
    val integral = "\\u{222B}"
    val greeting = "Hello"
    var name = "Karen"
    
    if (sample1 == sample2){
        println("The Samples are equal.")
        
    } else {
        println("The Samples are not equal")
    }

    if (heartRate >= 40 && heartRate <= 80){
        println("Heart rate is normal.")
    } else {
        println("Heart rate is not normal")
    }
    
    if (desposits >= 100000000){
        println("You are exceedingly wealthy")
    } else {
        println("Sorry you are so poort")
    }
    
    var force = mass * acceleration
    
    println("force = " + force)
    println("$distance is the distance")
    
    if (lost == true && expensive == true){
        println("I am really sorry! I will get the manager.")
    } else if (lost == true && expensive == false){
        println("Here is the coupon for 10% off.")
    }
    
    when (choice) {
        1	-> println("You chose 1")
        2	-> println("You chose 2")
        3	-> println("You chose 3")
        else	-> println("You made an unknown choice")
    }
    
    println("$integral is an integral")
    
    for (x in 5..10){
        println("i is $x")
    }
    
    var age = 0
    while (age < 6){
        println("age = $age")
        age++
    }
    
    println("$greeting $name")
    
}
