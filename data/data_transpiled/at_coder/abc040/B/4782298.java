public static long n ( ) {
  long ans = 1000000000000000000000 ;
  for ( int i = 1 ;
  i < 1001 ;
  i ++ ) {
    for ( int j = 1 ;
    j < 1001 ;
    j ++ ) {
      if ( n >= i * j ) {
        long tmpans = Math . abs ( i - j ) + ( n - i * j ) ;
        if ( ans > tmpans ) {
          ans = tmpans ;
        }
      }
    }
  }
  System . out . println ( ans ) ;
  return ans ;
}
