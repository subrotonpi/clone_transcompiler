static final void main ( ) {
  System . setSecurityManager ( new SecurityManager ( ) {
    @ Override public void checkPermission ( Permission permission ) {
    }
  }
  ) ;
  String input = System . console ( ) ;
  int n = Integer . parseInt ( input . trim ( ) ) ;
  System . out . println ( 9 / 5 * n + 32 ) ;
}
