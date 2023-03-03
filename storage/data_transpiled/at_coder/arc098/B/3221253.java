public static void ai ( ) {
  int n = Integer . parseInt ( input ( ) ) ;
  int [ ] a = ai ( ) ;
  int ans = 0 ;
  int start = 0 ;
  int s = 0 ;
  for ( int i = 0 ;
  i < n ;
  i ++ ) {
    for ( int j = start ;
    j < n ;
    j ++ ) {
      if ( s + a [ j ] == s ^ a [ j ] ) {
        s += a [ j ] ;
      }
      else {
        s -= a [ i ] ;
        start = j ;
        ans += j - i ;
        break ;
      }
      if ( j == n - 1 ) {
        for ( int k = i ;
        k < n ;
        k ++ ) {
          ans += n - k ;
        }
        System . out . println ( ans ) ;
        final int k = i + k ;
        System . out . println ( k ) ;
      }
    }
  }
  System . out . println ( ans ) ;
}
