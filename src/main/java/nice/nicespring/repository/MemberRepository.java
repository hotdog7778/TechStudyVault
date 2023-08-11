package nice.nicespring.repository;

import nice.nicespring.domain.Member;

import java.util.List;
import java.util.Optional;

public interface MemberRepository {
    // Member 객체를 반환하는 save 메서드.. Member 객체를 매개변수로 받아 리포지토리에 저장
    Member save(Member member);

    // id 를 찾는 메서드
    Optional<Member> findById(Long id);

    // name 을 찾는 메서드
    Optional<Member> findByName(String name);

    // 모든 회원을 조회하는 메서드
    List<Member> findAll();
}
