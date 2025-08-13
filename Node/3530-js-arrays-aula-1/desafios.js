function executaOperacaoEmArray(array, callback) {
    array.forEach((elemento, indice) => {
        const resultado = callback(elemento);
        console.log(`Elemento ${indice}: ${elemento} × ? = ${resultado}`);
    });
}

// Funções de multiplicação
function multiplicarPor2(numero) {
    return numero * 2;
}

function multiplicarPor3(numero) {
    return numero * 3;
}

function multiplicarPor5(numero) {
    return numero * 5;
}

// Testando com diferentes multiplicações:
const numeros = [4, 3, 2, 1, 0];

console.log("=== Multiplicando por 2 ===");
executaOperacaoEmArray(numeros, multiplicarPor2);

console.log("\n=== Multiplicando por 3 ===");
executaOperacaoEmArray(numeros, multiplicarPor3);

console.log("\n=== Multiplicando por 5 ===");
executaOperacaoEmArray(numeros, multiplicarPor5);

// Usando arrow function para multiplicar por 10:
console.log("\n=== Multiplicando por 10 ===");
executaOperacaoEmArray(numeros, (num) => num * 10);