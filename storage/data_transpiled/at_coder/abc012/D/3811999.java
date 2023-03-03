public static double [ ] [ ] readDistance ( String input ) {
  int N = Integer . parseInt ( input ) ;
  int M = Integer . parseInt ( input ) ;
  List < List < Integer >> BUS = new ArrayList < > ( ) ;
  for ( int i = 0 ;
  i < M ;
  i ++ ) {
    BUS . add ( Collections . singletonList ( Integer . parseInt ( input ) ) ) ;
  }
  double [ ] [ ] Distance = new double [ N + 1 ] [ N + 1 ] ;
  for ( int i = 0 ;
  i < N ;
  i ++ ) {
    Distance [ i ] [ 0 ] = Double . MAX_VALUE ;
  }
  for ( int j = 0 ;
  j < N + 1 ;
  j ++ ) {
    Distance [ 0 ] [ j ] = Distance [ j ] [ i ] = t ;
  }
  for ( int k = 1 ;
  k <= N ;
  k ++ ) {
    for ( int i = 1 ;
    i <= N ;
    i ++ ) {
      for ( int j = i ;
      j <= N ;
      j ++ ) {
        double length = Distance [ i ] [ k ] + Distance [ j ] [ k ] ;
        if ( Distance [ i ] [ j ] > length ) {
          Distance [ i ] [ j ] = Distance [ j ] [ i ] = length ;
        }
      }
    }
  }
  double ANS = Double . MAX_VALUE ;
  for ( int i = 1 ;
  i <= N ;
  i ++ ) {
    double D = 0 ;
    for ( int j = 1 ;
    j <= N ;
    j ++ ) {
      if ( i == j ) continue ;
      if ( D < Distance [ i ] [ j ] ) {
        D = Distance [ i ] [ j ] ;
      }
    }
    if ( ANS > D ) {
      ANS = D ;
    }
  }
  System . out . println ( ANS ) ;
  return Distance ;
}
