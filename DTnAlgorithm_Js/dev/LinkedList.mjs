class Node {
  constructor(data, next = null) {
    this.data = data;
    this.next = next;
  }
}

class LinkedList {
  constructor() {
    this.head = null; // 연결리스트의 시작노드를 가리키는 헤드
    this.count = 0; // 총 저장된 노드의 수 count
  }

  printAll() {
    let currentNode = this.head;
    let text = '[';

    while (currentNode != null) {
      text += currentNode.data;
      currentNode = currentNode.next;

      if (currentNode != null) {
        text += ', ';
      }
    }

    text += ']';
    console.log(text);
  }

  clear() {
    this.head = null;
    this.count = 0;
  }

  /**
   * insertAt을 구현하면서 헷갈렸던건
   * 1) LinkedList의 head 필드가 계속 유지되는 것
   * 2) Node 의 next 필드가 어디서 계속 변경되는 지
   * 결국, 매개변수로 받은 인덱스가 0,1 일때 동작하는걸 먼저 이해해야 했다.
   * 그러면 그이후의 동작은 자연스레 이해됨.
   * 첫노드는 필드에 선언해놓고 currentNode 라는 첫노드를 참조하는 변수를 계속해서 사용한다는 점이 중요하다.
   */
  insertAt(index, data) {
    if (index > this.count || index < 0) {
      // 연결리스트의 크기보다 큰 인덱스 이거나 음수 인덱스 일경우 예외처리
      throw new Error('범위를 넘어갔습니다.');
    }

    let newNode = new Node(data);
    // 1. 새로삽입하는 노드가 헤드가 되어야 하는 경우
    // 2. 헤드 노드에서 next로 목표 인덱스를 찾아가는 경우
    if (index === 0) {
      newNode.next = this.head; // newNode.next 는 다음 노드의 주소. 다음노드의 주소에 헤드값을 대입한다. newNode --> head 상태
      this.head = newNode;
    } else {
      // 복제본 currentNode 를 헤더에 위치시키고 한칸씩 이동
      let currentNode = this.head;
      for (let i = 0; i < index - 1; i++) {
        currentNode = currentNode.next;
      }

      // 이제 currentNode는 목표 인덱스 바로 전에 위치한다.
      newNode.next = currentNode.next;
      currentNode.next = newNode;
    }
    this.count++;
  }

  insertLast(data) {
    this.insertAt(this.count, data);
  }

  deleteAt(index) {
    if (index >= this.count || index < 0) {
      // 연결리스트의 크기보다 큰 인덱스 이거나 음수 인덱스 일경우 예외처리
      throw new Error('제거할 수 있는 범위를 넘어갔습니다.');
    }

    // 1) head 노드를 제거하는 경우
    // 2) head 노드 외의 노드를 제거하는 경우
    let currentNode = this.head;

    if (index == 0) {
      // 1) head 노드를 제거하는 경우
      let deletedNode = this.head;
      this.head = this.head.next;
      this.count--;

      return deletedNode;
    } else {
      for (let i = 0; i < index - 1; i++) {
        currentNode = currentNode.next;
      }
      let deletedNode = currentNode.next;
      currentNode.next = currentNode.next.next;
      this.count--;
      return deletedNode;
    }
  }

  deleteLast() {
    return this.deleteAt(this.count - 1);
  }

  getNodeAt(index) {
    if (index < 0 || index >= this.count) {
      throw new Error('범위를 넘어갔습니다.');
    }

    let currentNode = this.head;

    for (let i = 0; i < index; i++) {
      currentNode = currentNode.next;
    }

    return currentNode;
  }
}

export { Node, LinkedList };
