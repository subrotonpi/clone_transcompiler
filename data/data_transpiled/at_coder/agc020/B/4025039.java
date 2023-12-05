@ VisibleForTesting static int from ( Scanner input ) {
  int N = input . nextInt ( ) ;
  int [ ] A = Arrays . stream ( input . nextLine ( ) . split ( " " ) ) . mapToInt ( Integer :: parseInt ) . toArray ( ) ;
  if ( A [ A . length - 1 ] != 2 ) System . out . println ( - 1 ) ;
  else {
    int PossibleMin = A [ A . length - 1 ] , PossibleMax = A [ A . length - 1 ] + 1 ;
    for ( int i = 0 ;
    i < N - 1 ;
    i ++ ) {
      PossibleMin = Math . ceil ( PossibleMin / A [ i ] ) * A [ i ] ;
      PossibleMax = ( PossibleMax / A [ i ] ) * A [ i ] + A [ i ] - 1 ;
    }
    if ( PossibleMax >= PossibleMin ) System . out . println ( PossibleMin + " " + PossibleMax ) ;
    else System . out . println ( - 1 ) ;
  }
  return A [ N - 1 ] ;
}
