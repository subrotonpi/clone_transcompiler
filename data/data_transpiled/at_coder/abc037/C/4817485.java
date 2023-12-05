public static int N ( ) {
  int N = Integer . parseInt ( input . nextLine ( ) ) ;
  int K = Integer . parseInt ( input . nextLine ( ) ) ;
  int [ ] a = new int [ N ] ;
  for ( int i = 0 ;
  i < N ;
  i ++ ) a [ i ] = i ;
  int [ ] s = new int [ N ] ;
  s [ N ] = 0 ;
  s [ N ] = 0 ;
  int total = 0 ;
  for ( int i = 0 ;
  i < N ;
  i ++ ) {
    total += a [ i ] ;
    s [ N ] = total ;
  }
  int ans = 0 ;
  for ( int i = 0 ;
  i < N ;
  i ++ ) {
    ans += a [ i ] - s [ i ] ;
  }
  return ans ;
}
