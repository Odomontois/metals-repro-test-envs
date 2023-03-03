class Test  extends munit.FunSuite{
    test("env varible should not be set"){
        assertEquals(System.getenv("FOO"), null)
    }
}
