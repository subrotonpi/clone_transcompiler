public static boolean diamond ( int i , int [ ] parents ) {
  Set < Integer > ancestors = new HashSet < Integer > ( ) ;
  Queue < Integer > q = new LinkedList < Integer > ( ) ;
  q . add ( i ) ;
  while ( q . size ( ) > 0 ) {
    i = q . poll ( ) ;
    if ( ancestors . contains ( i ) ) {
      return true ;
    }
    ancestors . add ( i ) ;
    q . addAll ( Arrays . asList ( parents ) ) ;
  }
  return false ;
  int T = Integer . parseInt ( readLine ( ) ) ;
  for ( int testCase : xrange ( 1 , T + 1 ) ) {
    int N = Integer . parseInt ( readLine ( ) ) ;
    parents = Arrays . stream ( Integer . parseInt ( readLine ( ) . split ( " " ) [ 1 ] ) ) . map ( Integer :: parseInt ) . collect ( Collectors . toList ( ) ) ;
    System . out . println ( "Case #" + testCase + ":" + " " + parents ) ;
    if ( ArrayUtil . find ( parents , i ) != - 1 ) {
      System . out . println ( "Yes" ) ;
    }
    else {
      System . out . println ( "No" ) ;
    }
  }
  return false ;
}
