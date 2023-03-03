public static void print ( int n ) {
  int [ ] a = Integer . parseInt ( input ( ) ) ;
  int s = 0 ;
  int c = 0 ;
  int j = 0 ;
  int ans = 0 ;
  for ( int i = 0 ;
  i < n ;
  i ++ ) {
    if ( s + a [ i ] == s ^ a [ i ] ) {
      s += a [ i ] ;
      c ++ ;
      ans += c ;
    }
    else {
      while ( s + a [ i ] != s ^ a [ i ] ) {
        s -= a [ j ] ;
        c -- ;
        j ++ ;
      }
      else {
        s += a [ i ] ;
        c ++ ;
        ans += c ;
      }
    }
  }
  System . out . println ( ans ) ;
}
