public static int N = Integer . parseInt ( input ) {
  int C = Integer . parseInt ( input . nextLine ( ) ) ;
  int K = Integer . parseInt ( input . nextLine ( ) ) ;
  int T [ ] = new int [ N ] ;
  for ( int i = 0 ;
  i < N ;
  i ++ ) {
    T [ i ] = Integer . parseInt ( input . nextLine ( ) ) ;
  }
  Arrays . sort ( T ) ;
  int i = 0 ;
  int ans = 0 ;
  while ( i < N ) {
    int Ti = T [ i ] ;
    int cnt = 0 ;
    while ( i < N && T [ i ] <= Ti + K && cnt < C ) {
      i ++ ;
      cnt ++ ;
    }
    ans ++ ;
  }
  System . out . println ( ans ) ;
  return ans ;
}
