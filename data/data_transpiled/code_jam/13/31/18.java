public static int solve ( String s , int n ) {
  int lastPos = 0 ;
  int j = 0 ;
  int count = 0 ;
  for ( int i = 0 ;
  i < s . length ( ) ;
  i ++ ) {
    if ( ! ( s . charAt ( i ) == 'a' || s . charAt ( i ) == 'e' || s . charAt ( i ) == 'i' || s . charAt ( i ) == 'o' || s . charAt ( i ) == 'u' ) ) {
      j ++ ;
    }
    else {
      j = 0 ;
    }
    if ( j >= n ) {
      count += ( i - ( n - 1 ) - lastPos + 1 ) * ( s . length ( ) - i ) ;
      lastPos = i - ( n - 1 ) + 1 ;
    }
  }
  for ( int T = 0 ;
  T < Integer . parseInt ( readLine ( ) ) ;
  T ++ ) {
    String [ ] data = readLine ( ) . split ( " " ) ;
    s = data [ 0 ] ;
    n = Integer . parseInt ( data [ 1 ] ) ;
    int res = 0 ;
    res = solve ( s , n ) ;
    System . out . println ( "Case #" + ( T + 1 ) + ": " + res ) ;
  }
  return count ;
}
