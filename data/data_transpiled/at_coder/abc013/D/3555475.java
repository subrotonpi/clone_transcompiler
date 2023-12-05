public static int [ ] getStdOut ( ) {
  int N = Integer . parseInt ( input . readLine ( ) ) ;
  int M = Integer . parseInt ( input . readLine ( ) ) ;
  int D = Integer . parseInt ( input . readLine ( ) ) ;
  int [ ] A = new int [ N ] ;
  for ( int i = 0 ;
  i < N ;
  i ++ ) {
    A [ i ] = i ;
  }
  int [ ] a = new int [ M ] ;
  for ( int i = 0 ;
  i < M ;
  i ++ ) {
    int swap = A [ i ] - 1 ;
    a [ swap ] = a [ swap + 1 ] ;
  }
  int [ ] f = new int [ N ] ;
  for ( int i = 0 ;
  i < N ;
  i ++ ) {
    f [ a [ i ] ] = i ;
  }
  int [ ] ans = new int [ N ] ;
  for ( int i = 0 ;
  i < N ;
  i ++ ) {
    ans [ i ] = i ;
  }
  while ( D > 0 ) {
    if ( D % 2 == 1 ) {
      ans = new int [ N ] ;
      for ( int i = 0 ;
      i < N ;
      i ++ ) {
        ans [ i ] = f [ ans [ i ] ] ;
      }
    }
    f = new int [ N ] ;
    for ( int i = 0 ;
    i < N ;
    i ++ ) {
      ans [ i ] = f [ f [ i ] ] ;
    }
    D >>= 1 ;
  }
  for ( int i = 0 ;
  i < N ;
  i ++ ) {
    System . out . println ( ans [ i ] + 1 ) ;
  }
  return ans ;
}
