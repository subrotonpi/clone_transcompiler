static final String solve ( String [ ] keys , List < Chest > chests , List < String > order ) throws IOException {
  File file = new File ( "D-large.in" ) ;
  FILE = new File ( file ) ;
  int T = Integer . parseInt ( FILE . readLine ( ) ) ;
  List < Chest > chests = new ArrayList < Chest > ( ) ;
  for ( int i = 0 ;
  i <= T ;
  i ++ ) {
    chests . add ( new Chest ( raw [ 0 ] , new Integer ( raw [ 2 ] ) , i + 1 ) ) ;
  }
  if ( solvable ( keys , chests , new ArrayList < Chest > ( ) ) ) {
    String sol = solve ( keys , chests , new ArrayList < Chest > ( ) ) ;
    if ( sol . contains ( chest . req ) ) {
      String [ ] newKeys = new String [ keys . length ] ;
      System . arraycopy ( keys , 0 , newKeys , 0 , chest . req ) ;
      newKeys [ chest . req ] -- ;
      for ( int i = 0 ;
      i < chest . con ;
      i ++ ) newKeys [ chest . req ] ++ ;
      List < Chest > newChests = chests . subList ( 0 , i ) . subList ( i , chest . req + 1 ) ;
      List < String > newOrder = new ArrayList < String > ( ) ;
      newOrder . add ( chest . ix ) ;
      if ( newChests . size ( ) == 0 ) return newOrder . toString ( ) ;
      if ( solvable ( newKeys , newChests ) ) {
        String temp = solve ( newKeys , newChests , newOrder ) ;
        if ( ( temp != null ) && ( temp . equals ( chest . req ) ) ) return temp ;
      }
    }
  }
  return "IMPOSSIBLE" ;
}
