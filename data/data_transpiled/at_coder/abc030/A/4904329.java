public static void main ( String [ ] args ) {
  int a = Integer . parseInt ( args [ 0 ] ) ;
  int b = Integer . parseInt ( args [ 1 ] ) ;
  int c = Integer . parseInt ( args [ 2 ] ) ;
  int d = Integer . parseInt ( args [ 3 ] ) ;
  if ( a / b == c / d ) {
    System . out . println ( "DRAW" ) ;
  }
  else if ( a / b < c / d ) {
    System . out . println ( "TAKAHASHI" ) ;
  }
  else {
    System . out . println ( "AOKI" ) ;
  }
}
