function revese() {
  let num = parseInt(prompt("eneter a number"));
  let rev = 0;
  let dup = num;

  while (num > 0) {
    let ld = num % 10;
    rev = rev * 10 + ld;
    num = Math.floor(num / 10);
  }

  if (rev === dup) {
    console.log("palindrome");
  } else {
    console.log("not palindrome");
  }
}

revese();
