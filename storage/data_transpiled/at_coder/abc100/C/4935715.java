public static int N ( ) {
  int N = Integer . parseInt ( input . nextLine ( ) ) ;
  int [ ] a = new int [ N ] ;
  for ( int i = 0 ;
  i < N ;
  i ++ ) {
    a [ i ] = Integer . parseInt ( input . nextLine ( ) ) ;
  }
  int ans = 0 ;
  for ( int i = 0 ;
  i < N ;
  i ++ ) {
    int count = 0 ;
    while ( a [ i ] % 2 == 0 ) {
      count ++ ;
      a [ i ] /= 2 ;
    }
    ans += count ;
  }
  return ans ;
}
