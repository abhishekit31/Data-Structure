function largest(arr) {
  let largest = arr[0];
  for (let i = 1; i < arr.length; i++) {
    if (arr[i] > largest) {
      largest = arr[i];
    }
  }
  return largest;
}

const arr = [2, 8, 9, 2, 3, 14];
let result = largest(arr);
console.log(`The largest element is ${result}`);
