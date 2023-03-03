public static void main ( String input ) {
  int n = Integer . parseInt ( input ) ;
  int k = Integer . parseInt ( input ) ;
  int [ ] s = new int [ n ] ;
  for ( int i = 0 ;
  i < s . length ;
  i ++ ) {
    s [ i ] = Integer . parseInt ( input ) ;
  }
  if ( 0 == s [ n ] ) {
    System . out . println ( n ) ;
    exit ( ) ;
  }
  if ( k == 0 ) {
    System . out . println ( 0 ) ;
    exit ( ) ;
  }
  s [ k + 1 ] = 1 ;
  int a = 0 ;
  int b = - 1 ;
  int ans = 0 ;
  int temp = 1 ;
  for ( int i = 0 ;
  i < n + 1 ;
  i ++ ) {
    if ( s [ i ] > k ) {
      ans = Math . max ( ans , i - a ) ;
      temp = 1 ;
      a = i + 1 ;
      continue ;
    }
    temp *= s [ i ] ;
    if ( temp > k ) {
      ans = Math . max ( ans , i - a ) ;
      while ( ++ b > b ) {
        temp /= s [ a ] ;
        a ++ ;
        if ( temp <= k ) {
          break ;
        }
      }
    }
  }
  System . out . println ( ans ) ;
}
