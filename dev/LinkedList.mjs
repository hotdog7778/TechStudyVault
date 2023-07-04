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

// 본격적으로 연결리스트를 만들기.
class LinkedList{
    constructor(){ // 매개변수가 없는 생성자 만들기
        this.head = null; // 연결리스트의 시작노드를 가리키는 head
        this.count = 0; // 총 저장된 노드의 수인 count
    }

    // 원하는 데이터를 삽입해주는 insertAt 함수를 만든다.
    insertAt(index, data){ // 매개변수로 삽입할 위치인 index와, 삽입할 데이터인 data를 받는다.
        // 가장먼저 예외처리를 해준다.
        // 연결리스트의 크기를 넘어가거나, 음수위치에 삽입할 경우 에러를 발생시키자.
        if(index > this.count || index < 0){
            console.log("범위를 넘어갔습니다.")
        }
        
        // 이제 삽입할 노드를 생성해준다.
        // 매개변수로 받은 data를 노드로 넘겨주면서 노드를 생성해 준다.
        let newNode = new Node(data);

        // 이제 노드를 배치해준다.
        // 첫번째 경우로, 새로 삽입하는 노드가 가장 앞쪽에 배치되는 상황.(head가 되는 상황)
        // 두번째 경우로, 새로 삽입하는 노드가 중간에 배치되기 때문에 경로를 찾아가야 하는 상황.
        // 이 두가지 경우를 if문으로 나누자.
        if (index == 0){
            // 먼저 기존의 head를 새로 생성한 노드의 next에 대입한다.
            newNode.next = this.head;
            // 이제 새로 생성한 노드를 head로 설정한다.
            this.head = newNode;
        } else {
            // 원하는 index 까지 타고 들어가서 노드를 삽입.
            // 1. 삽입해야하는 index의 위치를 알기위해 index-1 노드까지 가야함.
            // 새로운 변수로 위 목적을 수행한다.
            // 시작 노드 값을 currentNode 라는 변수를 만들어 대입해놓음.
            let currentNode = this.head // head 에는 데이터와 next가 있다. -->> 객체 참조를 이해하고 이코드를 이해해야 한다.
            // currentNode를 삽입위치 전까지 이동시켜서, 삽입위치값을 알아내자.
            // 시작위치에 있는 노드가 index-1 까지 이동하려면 한칸씩 index-1 번 움직여야한다. 
            for(let i=0; i<(index-1); i++){ 
                currentNode = currentNode.next // 한번 수행할때 마다 currentNode는 한노드씩 앞으로 이동된것과 같다.
            }
            // 이동이 완료된 currentNode의 다음 노드자리가 삽입할 노드의 자리다.
            // currentNode가 바라보던 노드가 newNode 바라봐야하는 노드다.
            newNode.next = currentNode.next
            // currentNode는 이제 newNode를 바라봐야한다.
            currentNode.next = newNode;
            // 이제 currentNode -> newNode -> 원래있던노드 가된다.

            // 2. 삽입위치의 
        }



    }
}

// 다른 자바스크립트 파일에서 참조할 수 있도록 export 해준다.
export { Node };