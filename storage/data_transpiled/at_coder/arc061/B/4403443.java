@ VisibleForTesting static LinkedHashMap < Point , Integer > map ( String input ) {
  int h = Integer . parseInt ( input ) ;
  int w = Integer . parseInt ( input ) ;
  int n = Integer . parseInt ( input ) ;
  LinkedHashMap < Point , Integer > map = new LinkedHashMap < > ( ) ;
  for ( int i = 0 ;
  i < n ;
  i ++ ) {
    int a = Integer . parseInt ( input ) ;
    int b = Integer . parseInt ( input ) ;
    for ( int i = 0 ;
    i < 3 ;
    i ++ ) {
      for ( int j = 0 ;
      j < 3 ;
      j ++ ) {
        if ( w > b + j - 1 > 1 < a + i - 1 < h ) {
          map . put ( new Point ( a + i , b + j ) , i ) ;
        }
      }
    }
  }
  LinkedHashMap < Point , Integer > ans = new LinkedHashMap < > ( ) ;
  for ( int i : map . values ( ) ) {
    ans . put ( i , i ) ;
  }
  System . out . println ( ( h - 2 ) * ( w - 2 ) - sum ( ans . values ( ) ) ) ;
  for ( int i = 1 ;
  i <= 10 ;
  i ++ ) {
    System . out . println ( ans . get ( i ) ) ;
  }
  return ans ;
}
