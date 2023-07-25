module a.module {
    exports pack1;
    requires transitive b.module; // b 모듈을 전이시켜준다.
//    exports pack2;
}