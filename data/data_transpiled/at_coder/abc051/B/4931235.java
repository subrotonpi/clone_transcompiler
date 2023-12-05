public static void main ( String input ) {
  int k = Integer . parseInt ( input ) ;
  int s = Integer . parseInt ( input ) ;
  int count = 0 ;
  for ( int i = 0 ;
  i <= k ;
  i ++ ) {
    for ( int j = 0 ;
    j <= k ;
    j ++ ) {
      if ( 0 <= ( s - i - j ) && s - j <= k ) {
        count ++ ;
      }
    }
  }
  System . out . println ( count ) ;
}
