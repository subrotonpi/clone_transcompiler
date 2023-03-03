public static void inFile ( Scanner in ) throws FileNotFoundException {
  int T = in . nextInt ( ) ;
  for ( int t = 0 ;
  t < T ;
  t ++ ) {
    int C = in . nextInt ( ) ;
    Map < Integer , Integer > corners = new HashMap < Integer , Integer > ( ) ;
    boolean needsMoves = false ;
    for ( int c = 0 ;
    c < C ;
    c ++ ) {
      String line = in . next ( ) ;
      int P = Integer . parseInt ( line . split ( "\\s+" ) [ 0 ] ) ;
      int V = Integer . parseInt ( line . split ( "\\s+" ) [ 1 ] ) ;
      corners . put ( P , V ) ;
      if ( ( V > 1 ) && ( ! needsMoves ) ) {
        needsMoves = true ;
      }
    }
    int totalMoves = 0 ;
    while ( needsMoves ) {
      Map < Integer , Integer > newcorners = new HashMap < Integer , Integer > ( ) ;
      needsMoves = false ;
      for ( Map . Entry < Integer , Integer > entry : corners . entrySet ( ) ) {
        int key = entry . getKey ( ) ;
        int value = entry . getValue ( ) ;
        if ( value == 1 ) {
          if ( ! newcorners . containsKey ( key ) ) {
            newcorners . put ( key , 0 ) ;
          }
          newcorners . put ( key , 1 ) ;
        }
        else if ( value > 1 ) {
          needsMoves = true ;
          int moves = ( int ) ( value / 2 ) ;
          totalMoves += moves ;
          if ( ! newcorners . containsKey ( key - 1 ) ) {
            newcorners . put ( key - 1 , 0 ) ;
          }
          if ( newcorners . containsKey ( key + 1 ) ) {
            assert false ;
          }
          newcorners . put ( key - 1 , moves ) ;
          newcorners . put ( key + 1 , moves ) ;
          if ( value > moves * 2 ) {
            if ( ! newcorners . containsKey ( key ) ) {
              newcorners . put ( key , 0 ) ;
            }
            newcorners . put ( key , 1 ) ;
          }
        }
      }
      corners = newcorners ;
    }
    System . out . println ( "Case #" + ( t + 1 ) + ": " + totalMoves ) ;
  }
}
