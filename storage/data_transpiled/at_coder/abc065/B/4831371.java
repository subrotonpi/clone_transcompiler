public static void main ( String input ) {
  N = Integer . parseInt ( input ) ;
  int [ ] a = new int [ N ] ;
  for ( int i = 0 ;
  i < N ;
  i ++ ) {
    a [ i ] = Integer . parseInt ( input ) ;
  }
  int nextLight = 1 ;
  int [ ] li = new int [ N ] ;
  for ( int i = 0 ;
  i < N ;
  i ++ ) {
    li [ i ] = 0 ;
  }
  int count = 0 ;
  for ( int i = 0 ;
  i < N ;
  i ++ ) {
    nextLight = a [ nextLight - 1 ] ;
    count ++ ;
    if ( 2 == nextLight ) {
      break ;
    }
  }
  if ( N == count ) {
    System . out . println ( - 1 ) ;
  }
  else {
    System . out . println ( count ) ;
  }
}
