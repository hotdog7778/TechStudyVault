package nice.nicespring.repository;

import nice.nicespring.domain.Member;

import java.util.*;

public class MemoryMemberRepository implements MemberRepository{

    // HashMap을 DB로 사용
    private static Map<Long, Member> store = new HashMap<>();
    // id로 사용할 시퀀스
    private static long sequence = 0L;

    @Override
    public Member save(Member member) {
        // id 를 등록 , name은 외부에서 입력받는 시나리오
        member.setId(++sequence);
        // DB 에 저장
        store.put(member.getId(), member);
        //
        return member;
    }

    @Override
    public Optional<Member> findById(Long id) {
        //
        return Optional.ofNullable(store.get(id));
    }

    @Override
    // DB 에서 name 을 찾는 메서드
    public Optional<Member> findByName(String name) {
        return store.values().stream()
                .filter(member -> member.getName().equals(name))
                .findAny();
    }

    public List<Member> findAll() {
        return new ArrayList<>(store.values());
    }

    public void clearStore() {
        store.clear();
    }
}
