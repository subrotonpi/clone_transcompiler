public static int N ( ) {
  int M = Integer . parseInt ( input . nextLine ( ) ) ;
  List < List < Integer >> L = new ArrayList < > ( ) ;
  for ( int i = 0 ;
  i < M ;
  i ++ ) {
    L . add ( Collections . singletonList ( Integer . parseInt ( input . nextLine ( ) ) ) ) ;
  }
  int [ ] K = new int [ 10 * 5 ] ;
  for ( int i = 0 ;
  i < M ;
  i ++ ) {
    for ( int j = 0 ;
    j < 2 ;
    j ++ ) {
      K [ L . get ( i ) . get ( j ) - 1 ] ++ ;
    }
  }
  boolean flag = true ;
  for ( int i = 0 ;
  i < 10 * 5 ;
  i ++ ) {
    if ( K [ i ] % 2 != 0 ) {
      flag = false ;
      break ;
    }
  }
  if ( flag ) {
    System . out . println ( "YES" ) ;
  }
  else {
    System . out . println ( "NO" ) ;
  }
  return N ;
}
