static final String getSolutionName ( ) {
  final String problemName = "B" ;
  final int testCase = "large" ;
  int attempt = 0 ;
  {
    final int X = combination . length ( ) / 2 ;
    final double [ ] probabilities = new double [ X ] ;
    for ( int i = 0 ;
    i < X ;
    ++ i ) {
      probabilities [ i ] = 1.0 ;
    }
    for ( int i = 0 ;
    i < probability . length ;
    ++ i ) {
      probabilities [ i ] = 0.0 ;
    }
    for ( int i = 0 ;
    i < probability . length ;
    ++ i ) {
      probabilities [ i ] = 1.0 ;
    }
    for ( int i = 0 ;
    i < probability . length ;
    ++ i ) {
      if ( probability [ i ] - 1 >= 0 ) {
        probabilities [ i ] += probabilities [ i - 1 ] * probability [ i ] ;
      }
      probabilities [ i ] += probabilities [ i ] * ( 1 - probability [ i ] ) ;
    }
    probabilities = newProbabilities ;
  }
  return "" ;
}
