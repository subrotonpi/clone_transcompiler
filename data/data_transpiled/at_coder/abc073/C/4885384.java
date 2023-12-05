@ VisibleForTesting static void from ( ) {
  int n = Integer . parseInt ( input ) ;
  Map < Integer , Integer > map = new HashMap < > ( ) ;
  for ( int i = 0 ;
  i < n ;
  i ++ ) {
    map . put ( Integer . valueOf ( i ) , i ) ;
  }
  int count = 0 ;
  for ( int v : map . values ( ) ) {
    if ( v % 2 != 0 ) {
      count ++ ;
    }
  }
  System . out . println ( count ) ;
}
