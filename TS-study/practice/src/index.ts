const msg: string = 'Hello, world';
// const msg: number = 'Hello, world'; // 타입에러 발생
console.log(msg);

const greeting: string = 'Hello, ';
const target: string = 'world!';
console.log(greeting + target);

let first: string, second: string;
first = 'hello, ';
second = 'world@';
console.log(first + second);

let first2: string, second2: string;
first2 = 'hello, ';
// console.log(first2 + second2); // 타입 선언 후 값을 할당하지 않고 사용하여 컴파일 에러 발생
