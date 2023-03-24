var amount = 99.99;

amount = amount * 2;

console.log( amount );        // 199.98

// преобразует `amount` в строку и
// добавляет "$" в начало
amount = "$" + String( amount );

console.log( amount );        // "$199.98"