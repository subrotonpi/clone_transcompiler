public static void main ( String [ ] args ) {
  int d = Integer . parseInt ( args [ 0 ] ) ;
  int n = Integer . parseInt ( args [ 1 ] ) ;
  if ( n == 100 ) {
    System . out . println ( Math . pow ( 100 , d ) * 101 ) ;
  }
  else {
    System . out . println ( Math . pow ( 100 , d ) * n ) ;
  }
}
