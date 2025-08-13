const numeros = [3, 8, 12, 5, 6, 10, 7, 2, 9, 14];

function pares(array) {
    const numerosPares = [];
    for (let i = 0; i < array.length; i++) {
        if (array[i] % 2 === 0) {
            numerosPares.push(array[i]);
        }
    }
    return numerosPares;
}

console.log(pares(numeros));