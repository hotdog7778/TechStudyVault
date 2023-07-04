class Node{
    // 생성자 생성, 일반적으로 생성자에서 초기화를 진행한다.
    constructor(data, next = null){
    // Node 클래스를 생성할때 생성자가 무조건 실행되니까,
    // 매개변수로 data를 받고, 다음 노드를 지정하는 next 도 받는다.
    // next = null 이란건 기본값으로 null 을 설정한 것이다.
    // 따라서, next는 입력하지 않는다면 null이 할당된다.

    // 프로퍼티(클래스 내의 변수) 생성
    this.data = data;
    this.next = next;
    }
}

// 다른 자바스크립트 파일에서 참조할 수 있도록 export 해준다.
export { Node };