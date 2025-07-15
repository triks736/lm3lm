function reverseString(str) {
  return str.split('').reverse().join('');
}
function countCharacters(str) {
  return str.length;
}
function capitalizeWords(sentence) {
  return sentence
    .split(' ')
    .map(word => word.charAt(0).toUpperCase() + word.slice(1))
    .join(' ');
}
function findMax(arr) {
  return Math.max(...arr);
}

function findMin(arr) {
  return Math.min(...arr);
}
function sumArray(arr) {
  return arr.reduce((sum, num) => sum + num, 0);
}
function filterArray(arr, conditionFn) {
  return arr.filter(conditionFn);
}

function factorial(n) {
  if (n < 0) return undefined;
  if (n === 0 || n === 1) return 1;
  return n * factorial(n - 1);
}
function isPrime(n) {
  if (n <= 1) return false;
  for (let i = 2; i <= Math.sqrt(n); i++) {
    if (n % i === 0) return false;
  }
  return true;
}
function fibonacci(n) {
  if (n <= 0) return [];
  if (n === 1) return [0];
  const seq = [0, 1];
  while (seq.length < n) {
    seq.push(seq[seq.length - 1] + seq[seq.length - 2]);
  }
  return seq;
}
