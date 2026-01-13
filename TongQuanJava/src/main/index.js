let a = 10;
a = "Hello";

let b = "C04";
let c = 'c04';
let d = `C04`;

console.log(e); // undefined
var e;
console.log(e);
const PI = 3.13;
if(PI) { // tự động chuyển thành boolean, các giá trị chuyển thành false: 0, null, undefined, '', false, NaN còn lại tất cả sẽ thành true
    console.log(PI);
}

console.log(`Linh có số tuủi là ${PI}`);

let a = 10;
let b = 20;
let c = a;
a = 11;
console.log(c); // 10