@ GwtIncompatible ( "java.lang.String" ) public static int [ ] [ ] growth ( ) {
  final int [ ] [ ] board = new int [ 2 ] [ 2 ] ;
  final boolean didAliceWin = doMinimax ( board , king ) ;
  System . out . println ( "Case #" + ( case + 1 ) + ": " + ( didAliceWin ? 'A' : 'B' ) ) ;
  final boolean [ ] [ ] memoize = new boolean [ 2 ] [ 2 ] ;
  final boolean didAliceWin = doMinimax ( board , king ) ;
  System . out . println ( "Case #" + ( case + 1 ) + ": " + ( didAliceWin ? 'A' : 'B' ) ) ;
  final int [ ] [ ] copy = new int [ 2 ] [ 2 ] ;
  System . out . println ( "Case #" + ( case + 1 ) + ": " + ( didAliceWin ? 'A' : 'B' ) ) ;
  System . out . println ( "Case #" + ( case + 1 ) + ": " + ( didAliceWin ? 'B' : 'A' ) ) ;
  System . out . println ( "Case #" + ( case + 1 ) + ": " + ( didAliceWin ? 'A' : 'B' ) ) ;
  System . out . println ( "Case #" + ( case + 1 ) + ": " + ( didAliceWin ? 'A' : 'B' ) ) ;
  System . out . println ( "Case #" + ( case + 1 ) + ": " + ( didAliceWin ? 'B' : 'A' ) ) ;
  System . out . println ( "Case #" + ( case + 1 ) + ": " + ( didAliceWin ? 'A' : 'B' ) ) ;
  System . out . println ( "Case #" + ( case + 1 ) + ": " + ( didAliceWin ? 'B' : 'B' ) ) ;
  System . out . println ( "Case #" + ( case + 1 ) + ": " + ( didAliceWin ? 'A' : 'B' ) ) ;
  return copy ;
}
