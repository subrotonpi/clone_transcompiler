static int N = Integer . parseInt ( input ) {
  int [ ] DISK = new int [ M ] ;
  for ( int i = 0 ;
  i < DISK . length ;
  i ++ ) {
    DISK [ i ] = Integer . parseInt ( input . nextLine ( ) ) ;
  }
  List < Integer > cases = new LinkedList < > ( ) ;
  for ( int i = 0 ;
  i < DISK . length ;
  i ++ ) {
    cases . add ( N + 1 ) ;
  }
  for ( int i = 0 ;
  i < DISK . length ;
  i ++ ) {
    int x = cases . indexOf ( DISK [ i ] ) ;
    cases . set ( 0 , x ) ;
  }
  for ( int i = 1 ;
  i < cases . size ( ) ;
  i ++ ) {
    System . out . println ( cases . get ( i ) ) ;
  }
  return 0 ;
}
