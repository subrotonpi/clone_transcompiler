public static int T = Integer . parseInt ( Scanner in ) {
  int [ ] rooms = new int [ N ] ;
  for ( int i = 0 ;
  i < rooms . length ;
  i ++ ) {
    if ( rooms [ i ] != null && rooms [ i ] != - 1 ) {
      mm [ i ] = true ;
    }
  }
  int colors = Math . min ( rooms . length , 2 ) ;
  for ( int c = xrange ( colors , 2 , - 1 ) ;
  c <= xrange ( colors , 2 , - 1 ) ;
  c ++ ) {
    int [ ] tmp = solve ( new HashMap < > ( ) , rooms , new ArrayList < > ( ) , new ArrayList < > ( ) , new ArrayList < > ( ) , c , 0 ) ;
    if ( tmp != null ) {
      System . out . println ( "Case #" + nCase + ": " + c ) ;
      System . out . println ( Arrays . toString ( tmp ) ) ;
      break ;
    }
  }
  return 0 ;
}
