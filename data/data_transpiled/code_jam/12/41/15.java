static final String solve ( String [ ] vines , int D ) {
  final int numVines = vines . length ;
  final String [ ] initialState = new String [ numVines ] ;
  for ( int i = 0 ;
  i < numVines ;
  i ++ ) {
    final String s = vines [ i ] ;
    if ( s . contains ( "-t" ) || s . contains ( "--test" ) ) {
      System . err . println ( "Test option " + s ) ;
      return s ;
    }
    else if ( s . contains ( "-h" ) || s . contains ( "--help" ) ) {
      System . err . println ( ) ;
    }
    else {
      assert false : "unhandled option" ;
    }
  }
  if ( className . equals ( "org.apache.river.Driver" ) ) {
    Main . main ( ) ;
  }
  else {
    System . err . println ( "No driver found" ) ;
  }
  final int numProblems = vines . length ;
  final BitSet toSearch = new BitSet ( numProblems ) ;
  final BitSet best = new BitSet ( numVines ) ;
  best . set ( 0 ) ;
  toSearch . set ( 0 ) ;
  while ( toSearch . nextBoolean ( ) ) {
    final BitSet l = toSearch . get ( ) ;
    l . nextSetBit ( 0 ) ;
    final int i = l . nextSetBit ( 0 ) ;
    -- i ;
    final int x = vines [ i ] ;
    final int b = best . get ( i ) ;
    if ( ( b + x ) >= D ) return "YES" ;
    for ( int j : xrange ( numVines ) ) {
      if ( i == j ) continue ;
      if ( vines [ j ] . length ( ) <= x ) continue ;
      final int delta = vines [ j ] . length ( ) - x ;
      if ( delta > b ) continue ;
      int y = delta ;
      y = Math . min ( delta , vines [ j ] . length ( ) ) ;
      if ( y > best . get ( j ) ) {
        best . set ( j , y ) ;
        toSearch . set ( j ) ;
      }
    }
  }
  return "Maybe" ;
}
