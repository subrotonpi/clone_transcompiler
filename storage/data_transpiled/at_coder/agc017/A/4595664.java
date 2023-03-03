public static int N ( int P ) {
  int N = Integer . parseInt ( input . nextLine ( ) ) ;
  int [ ] a = new int [ N ] ;
  for ( int i = 0 ;
  i < N ;
  i ++ ) {
    a [ i ] = Integer . parseInt ( input . nextLine ( ) ) ;
  }
  a = Arrays . copyOf ( a , a . length ) ;
  if ( a [ 1 ] == 1 ) {
    System . out . println ( 2 * ( N - 1 ) ) ;
  }
  else {
    if ( P % 2 == 0 ) {
      System . out . println ( 2 * N ) ;
    }
    else {
      System . out . println ( 0 ) ;
    }
  }
  return N ;
}
