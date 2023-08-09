package hello.hellospring.repository;

import hello.hellospring.domain.Member;
import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.Test;
import org.assertj.core.api.Assertions.*;

import java.lang.reflect.Array;
import java.util.List;

import static org.assertj.core.api.Assertions.*;

class MemoryMemberRepositoryTest {

    MemoryMemberRepository repository = new MemoryMemberRepository();

    // 클래스 전체를 테스트 돌렸을때 아래 메서드들의 실행순서는 위에서 아래로가 보장되지 않는다.
    // 그러므로 메서드 실행후 클리어를 해주는게 필요하다.
    // 각각 메서드가 끝나고 이 메서드가 실행됨
    @AfterEach
    public void afterEach() {
        repository.clearStore();
    }

    @Test
    public void save(){
        Member member = new Member();
        member.setName("tgkim");
        
        repository.save(member);

        Member result = repository.findById(member.getId()).get();

        // 검증
        // case 1)
        // System.out.println("result = " + (result == member));

        // case 2)
        // Assertions.assertEquals(member, null); // 오류
        // Assertions.assertEquals(member, result); // 뭔가뜨진 않지만 초록불

        // case 3)
        assertThat(member).isEqualTo(result);
    }

    @Test
    public void findByName(){
        Member member1 = new Member();
        member1.setName("spring1");
        repository.save(member1);

        Member member2 = new Member();
        member2.setName("spring2");
        repository.save(member2);

        Member result = repository.findByName("spring1").get();
        // Member result = repository.findByName("spring2").get(); 에러

        assertThat(member1).isEqualTo(result);
    }

    @Test
    public void findAll(){
        Member member1 = new Member();
        member1.setName("spring1");
        repository.save(member1);

        Member member2 = new Member();
        member2.setName("spring2");
        repository.save(member2);

        Member member3 = new Member();
        member3.setName("spring3");
        repository.save(member3);

        List<Member> result = repository.findAll();

        // assertThat(result.size()).isEqualTo(2); // 에러
        assertThat(result.size()).isEqualTo(3);
    }
}
