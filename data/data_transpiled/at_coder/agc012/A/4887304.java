public static int N ( ) {
  int [ ] a = new int [ N ] ;
  for ( int i = 0 ;
  i < N ;
  i ++ ) {
    a [ i ] = Integer . parseInt ( input . nextLine ( ) ) ;
  }
  Arrays . sort ( a ) ;
  int total = 0 ;
  for ( int i = 0 ;
  i < 2 * N ;
  i ++ ) {
    if ( i % 2 == 1 ) {
      total += a [ i ] ;
    }
    else {
      continue ;
    }
  }
  System . out . println ( total ) ;
  return total ;
}
