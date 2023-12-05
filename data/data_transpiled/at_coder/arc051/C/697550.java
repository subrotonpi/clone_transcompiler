public static int N = Integer . parseInt ( input ) {
  int A = Integer . parseInt ( input . nextLine ( ) ) ;
  int B = Integer . parseInt ( input . nextLine ( ) ) ;
  int [ ] a = new int [ N ] ;
  for ( int i = 0 ;
  i < N ;
  i ++ ) {
    a [ i ] = Integer . parseInt ( input . nextLine ( ) ) ;
  }
  Arrays . sort ( a ) ;
  int mo = 10 * 9 + 7 ;
  int loop = 0 ;
  if ( A == 1 ) {
    for ( int i = 0 ;
    i < N ;
    i ++ ) {
      System . out . println ( a [ i ] % mo ) ;
    }
    exit ( ) ;
  }
  int aMax = a [ N - 1 ] ;
  while ( B > 0 ) {
    if ( a [ 0 ] * A >= aMax ) {
      loop = B / N ;
      B %= N ;
      break ;
    }
    a [ 0 ] *= A ;
    B -- ;
    Arrays . sort ( a ) ;
  }
  int i = 0 ;
  while ( B > 0 ) {
    a [ i ] *= A ;
    B -- ;
    i ++ ;
  }
  for ( ;
  i < N ;
  i ++ ) {
    a [ i ] *= Math . pow ( A , loop , mo ) ;
  }
  Arrays . sort ( a ) ;
  for ( ;
  i < N ;
  i ++ ) {
    a [ i ] %= mo ;
    System . out . println ( a [ i ] ) ;
  }
  return N ;
}
