const nomes = ['Ana', 'Bruno', 'Carla', 'Diego', 'Ana', 'Felipe', 'Bruno'];


// Set é um array like. pop, push, shift, unshift e etc nao funcionarao nele porque ele nao é array
// const nomesAtualizados = new Set(nomes);

// Criado para utilizar os metodos de array porque o set nao é um array
const listaNomeAtualizados = [...new Set(nomes)];

// console.log(nomesAtualizados);
console.log(listaNomeAtualizados);