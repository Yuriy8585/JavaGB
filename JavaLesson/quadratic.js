function quadraticEquation(a, b, c) {
    if (a == 0) {
        return "Уравнение не имеет корней!";
    }
    let d = b * b - 4 * a * c;
    if (d > 0) {
        let x1 = (-b - Math.sqrt(d)) / (2 * a);
        let x2 = (-b + Math.sqrt(d)) / (2 * a);
        return "Корни уравнения: x1 = " + x1 + ", x2 = " + x2;
    }
    else if (d == 0) {
        let x = -b / (2 * a);
        return "Уравнение имеет единственный корень: x = " + x;
    }
    else {
        return "Уравнение не имеет действительных корней!";
    }
}
var x = quadraticEquation(a, b, c);
alert("x = " + x);
