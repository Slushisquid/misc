//number 1-100
//multiples of 3 print fizz
//multiples of 5 print buzz
//multiples of 15 print fizzbuzz

for (i=1; i<101; i++){
    if (i%15 == 0){
        console.log("fizzbuzz");
    } else if (i%5 == 0){
        console.log("buzz");
    } else if (i%3 == 0){
        console.log("fizz");
    } else {
        console.log(i);
    }
}
//this stupid language prints to the debug console.
//but it works!