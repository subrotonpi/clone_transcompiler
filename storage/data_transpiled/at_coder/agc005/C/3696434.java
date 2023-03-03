@ VisibleForTesting static < C extends Collection < Integer >> C < C > of ( ) {
  int N = Integer . parseInt ( input . nextLine ( ) ) ;
  int [ ] A = new int [ N ] ;
  for ( int a : input . nextLine ( ) . split ( " " ) ) {
    A [ a ] = Integer . parseInt ( input . nextLine ( ) ) ;
  }
  int [ ] B = new int [ N ] ;
  for ( int i = 0 ;
  i < N ;
  i ++ ) {
    B [ i ] = A [ i ] ;
  }
  int ma = max ( B ) ;
  int mi = min ( B ) ;
  if ( ( ma == mi * 2 && B [ ma ] >= 2 && B [ mi ] == 1 ) || ( ma == mi * 2 - 1 && B [ ma ] >= 2 && B [ mi ] == 2 ) ) {
    for ( int i = mi + 1 ;
    i < ma ;
    i ++ ) {
      if ( B [ i ] < 2 ) {
        System . out . println ( "Impossible" ) ;
        break ;
      }
    }
    else {
      System . out . println ( "Possible" ) ;
    }
  }
  else {
    System . out . println ( "Impossible" ) ;
  }
  return new C < > ( A ) ;
}
