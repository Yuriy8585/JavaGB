

System.out.println("Программа решает квадратное уравнение вида:");
System.out.println("ax^2 + bx + c = 0");
System.out.println("Введите a, b и c:");


function quadraticEquation(a, b, c) {
    

let a = Number(prompt("a = "));
let b = Number(prompt("b = "));
let c = Number(prompt("c = ")); 
let d = b * b - 4 * a * c;
if (d > 0) {
   // Double.parseDouble(x1, x2);

    x1 = (-b - Math.sqrt(d)) / (2 * a);
    x2 = (-b + Math.sqrt(d)) / (2 * a);
    System.out.println("Корни уравнения: x1 = " + x1 + ", x2 = " + x2);
}
else if (d == 0) {
    //Double.parseDouble x;
    x = -b / (2 * a);
    System.out.println("Уравнение имеет единственный корень: x = " + x);
}
else {
    System.out.println("Уравнение не имеет действительных корней!");
}}
var x = quadraticEquation(a, b, c);
alert("x = " + x);

