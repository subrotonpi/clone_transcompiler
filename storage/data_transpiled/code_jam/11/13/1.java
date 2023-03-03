static final void dprint ( String s ) {
  PrintStream t = System . out ;
  System . setOut ( System . out ) ;
  print ( s ) ;
  System . setOut ( t ) ;
  class State {
    int [ ] [ ] cards ;
    int deckStart = 0 ;
    int deckEnd = 0 ;
    int score = 0 ;
    int turns = 0 ;
    int bestscore = 0 ;
    int [ ] [ ] cards = new int [ cardsbyc . length ] [ cardsbyc [ 0 ] . length ] ;
    int i = 0 ;
    for ( List < Integer > l : cardsbyc ) {
      l . forEach ( ( card ) -> {
        if ( cardsbyc [ 0 ] . length >= card . length ) {
          score = card [ 0 ] [ 1 ] + card [ 1 ] [ 0 ] ;
          if ( score > bestscore ) {
            bestscore = card [ 1 ] [ 1 ] ;
          }
        }
      }
      ) ;
    }
  }
  final String inputFile = s ;
  final File outputFile = new File ( inputFile ) ;
  if ( outputFile == null ) {
    outputFile = new File ( inputFile ) . getName ( ) + ".out" ;
  }
  try {
    final BufferedReader in = new BufferedReader ( new FileReader ( outputFile ) ) ;
    final String line = in . readLine ( ) ;
    int numCases = Integer . parseInt ( line ) ;
    System . out . println ( "Case #{!s}:" + ( numCases + 1 ) + " " + line ) ;
    for ( int i = 0 ;
    i < numCases ;
    i ++ ) {
      System . out . println ( " " + i + " " + cardsbyc [ i ] [ 0 ] ) ;
    }
    in . close ( ) ;
    int drawCards = Math . min ( card [ 0 ] , card [ 2 ] - card [ 1 ] ) ;
    if ( drawCards > 0 ) {
      hand [ 0 ] = new int [ cardsbyc [ 1 ] . length ] ;
      for ( i = 0 ;
      i < drawCards ;
      i ++ ) {
        hand [ i ] [ 1 ] = Integer . parseInt ( line ) ;
      }
    }
    int deckSize = Integer . parseInt ( inputFile . getName ( ) ) ;
    for ( int i = 0 ;
    i < deckSize ;
    i ++ ) {
      hand [ i ] = new int [ cardsbyc [ 1 ] . length ] ;
    }
  }
  catch ( Exception e ) {
    e . printStackTrace ( ) ;
  }
}
