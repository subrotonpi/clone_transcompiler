public static void print ( int n ) {
  int [ ] a = Integer . parseInt ( input ( ) ) ;
  int s = 0 ;
  int j = 0 ;
  int ans = 0 ;
  for ( int i = 0 ;
  i < n ;
  i ++ ) {
    while ( s + a [ i ] != s ^ a [ i ] ) {
      s -= a [ j ] ;
      j ++ ;
    }
    else {
      s += a [ i ] ;
      ans += i - j + 1 ;
    }
  }
  System . out . println ( ans ) ;
}
