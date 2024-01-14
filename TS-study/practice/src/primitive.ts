/*
원시타입 primitive
string
number
boolean
BigInt
null
undefined
symbol
*/

const width1 = 5;
const width2 = 8;
const height: number = 3;
const area = ((width1 + width2) * height) / 2;
console.log(area); // 19.5
console.log(3.5 * 2); // 7.0이 아닌 7
// number 타입에는 정수와 실수의 구분이 없다.
// 타입스크립트에서 number는 실제로 다른언어의 double 타입과 같은 53비트의 정밀도를 가진다.

// 숫자 리터럴
// 숫자를 그대로 표기한것
const binary = 0b1010; // 2진수 리터럴 0b
const octal = 0o755; // 8진수 리터럴 0o
const hexadecimal = 0xff; // 16진수 리터럴 ox
console.log(binary, octal, hexadecimal); // 10 493 255

// 지수 표기법
const big = 1e8; // 1 x 10^8
const small = 4e-5; // 4 x 10^-5
console.log(big, small); // 100000000 0.00004

// _ 사용
const million = 1_000_000;
console.log(million); // 1000000

// BigInt
// number 타입보다 큰 정밀도를 가진다. 따라서 계산속도는 BigInt 보다 number 타입이 더 빠르다.
const bignum: bigint = (123n + 456n) * 2n;
console.log(bignum); // 1158n
const result = 5n / 2n;
console.log(result);
