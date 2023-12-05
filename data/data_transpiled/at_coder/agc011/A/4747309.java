public static int N = Integer . parseInt ( input ) {
  int C = Integer . parseInt ( input . readLine ( ) ) ;
  int K = Integer . parseInt ( input . readLine ( ) ) ;
  int [ ] T = new int [ N ] ;
  for ( int i = 0 ;
  i < N ;
  i ++ ) {
    T [ i ] = Integer . parseInt ( input . readLine ( ) ) ;
  }
  Arrays . sort ( T ) ;
  int time = T [ 0 ] ;
  int count = 1 ;
  int ans = 0 ;
  for ( int i = 1 ;
  i < N ;
  i ++ ) {
    if ( T [ i ] - time > K || count == C ) {
      time = T [ i ] ;
      count = 1 ;
      ans ++ ;
    }
    else {
      count ++ ;
    }
  }
  if ( count > 0 ) {
    ans ++ ;
  }
  return ans ;
}
