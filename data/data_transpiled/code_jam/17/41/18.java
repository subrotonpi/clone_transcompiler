public static void IN ( Scanner in ) throws FileNotFoundException {
  PrintStream out = new PrintStream ( new File ( "input.txt" ) ) ;
  int NUM_TESTS = in . nextInt ( ) ;
  for ( int test : xrange ( NUM_TESTS ) ) {
    int N = Integer . parseInt ( in . nextLine ( ) ) ;
    int P = Integer . parseInt ( in . nextLine ( ) ) ;
    int [ ] G = new int [ P ] ;
    for ( int g = 0 ;
    g < G . length ;
    g ++ ) {
      G [ g % P ] ++ ;
    }
    int answer ;
    if ( P == 2 ) {
      answer = N - G [ 1 ] / 2 ;
    }
    else if ( P == 3 ) {
      if ( G [ 1 ] >= G [ 2 ] ) {
        answer = G [ 0 ] + G [ 2 ] + ( G [ 1 ] - G [ 2 ] + 2 ) / 3 ;
      }
      else {
        answer = G [ 0 ] + G [ 1 ] + ( G [ 2 ] - G [ 1 ] + 2 ) / 3 ;
      }
    }
    else if ( P == 4 ) {
      if ( G [ 3 ] > G [ 1 ] ) {
        G [ 1 ] = G [ 3 ] ;
        G [ 3 ] = G [ 1 ] ;
      }
      answer = G [ 0 ] + G [ 2 ] / 2 + G [ 3 ] ;
      G [ 2 ] -= ( G [ 2 ] / 2 ) * 2 ;
      G [ 1 ] -= G [ 3 ] ;
      while ( G [ 1 ] >= 2 && G [ 2 ] >= 1 ) {
        answer ++ ;
        G [ 1 ] -= 2 ;
        G [ 2 ] -= 1 ;
      }
      answer += G [ 1 ] / 4 ;
      G [ 1 ] -= ( G [ 1 ] / 4 ) * 4 ;
      if ( G [ 1 ] + G [ 2 ] > 0 ) {
        answer ++ ;
      }
    }
    out . println ( "Case #" + ( test + 1 ) + ": " + answer ) ;
    System . out . println ( test + 1 + " " + answer ) ;
  }
  in . close ( ) ;
  out . close ( ) ;
}
