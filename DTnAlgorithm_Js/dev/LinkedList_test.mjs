// Node 클래스를 사용하기 위해 import 해준다.
import { Node } from './LinkedList.mjs';

// Node 클래스를 이용해서 간단한 테스트코드를 작성한다.

// 정수 1이 저장된 node 1을 만들어 준다.
// 정수 2이 저장된 node 2을 만들어 준다.
// 정수 3이 저장된 node 3을 만들어 준다.
let node1 = new Node(1); // next 는 null이겠지
let node2 = new Node(2);
let node3 = new Node(3);

// next를 설정해서 node 1 2 3 을 연결해준다.
node1.next = node2;
node2.next = node3;

// 연결이 되었는지 노드의 next를 이용해서 데이터를 출력해본다.
console.log(node1.data); // node1의 데이터
console.log(node1.next.data); // node2의 데이터
console.log(node1.next.next.data); // node3의 데이터
