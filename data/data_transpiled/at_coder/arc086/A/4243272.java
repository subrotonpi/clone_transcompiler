static final int [ ] getMatchingPatterns ( ) {
  int n = Integer . parseInt ( input . nextLine ( ) ) ;
  int k = Integer . parseInt ( input . nextLine ( ) ) ;
  List < Integer > c = Lists . newArrayList ( ) ;
  for ( int i = 0 ;
  i < n ;
  i ++ ) c . add ( Integer . parseInt ( input . nextLine ( ) ) ) ;
  Collections . sort ( c ) ;
  Set < Integer > s = l . stream ( ) . collect ( Collectors . toSet ( ) ) ;
  List < Integer > p = new ArrayList < > ( ) ;
  if ( s . size ( ) <= k ) {
    System . out . println ( 0 ) ;
  }
  else {
    int d = 0 ;
    for ( int a = 0 ;
    a < s . size ( ) ;
    a ++ ) {
      int b = s . get ( a ) ;
      d += b ;
    }
    System . out . println ( n - d ) ;
  }
  return p . toArray ( new Integer [ 0 ] ) ;
}
