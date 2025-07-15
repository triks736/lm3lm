function minandMax(arr) {
  return [Math.min(...arr), Math.max(...arr)];
}
function sumOfCubes(nums) {
  return nums.reduce((sum, n) => sum + Math.pow(n, 3), 0);
}
function filterArray(arr) {
  return arr.filter(item => typeof item === 'number');
}
function isSymmetrical(num) {
  return num.toString() === num.toString().split('').reverse().join('');
}
function isSpecialArray(arr) {
  return arr.every((val, idx) => val % 2 === idx % 2);
}
function countTrue(arr) {
  return arr.filter(Boolean).length;
}
function objectToArray(obj) {
  return Object.entries(obj);
}
function arrayOfMultiples(num, length) {
  return Array.from({ length }, (_, i) => num * (i + 1));
}
function marathonDistance(distances) {
  return distances.map(Math.abs).reduce((a, b) => a + b, 0) === 25;
}
function squareDigits(num) {
  return +num.toString().split('').map(n => n ** 2).join('');
}
