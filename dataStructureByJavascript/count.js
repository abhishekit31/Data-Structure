function count(num) {
  let counter = 0;
  let rev = 0;
  while (num > 0) {
    let lastdigit = num % 10;
    counter++;
    num = Math.floor(num / 10);
    rev = rev * 10 + lastdigit;
  }
  console.log("Total digits:", rev);
  console.log(`total number of digit ${counter}`);
}
count(7789);
