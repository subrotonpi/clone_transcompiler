@ VisibleForTesting static int solve ( List < int [ ] > data ) {
  final int [ ] [ ] start = new int [ data . size ( ) ] [ 2 ] ;
  final int [ ] circle = new int [ data . size ( ) ] [ 2 ] ;
  for ( int [ ] d : data ) {
    for ( int i = 0 ;
    i < d [ 1 ] ;
    i ++ ) {
      start [ i ] [ 0 ] = d [ 0 ] ;
      circle [ i ] [ 0 ] = d [ 2 ] + i ;
    }
  }
  final int N = start . length ;
  {
    int counter = 0 ;
    for ( int i = 0 ;
    i < N ;
    i ++ ) {
      int s = start [ i ] [ 0 ] ;
      int c = circle [ i ] [ 1 ] ;
      int gap = ( z - Fraction . valueOf ( 360 - s ) . multiply ( c ) ) / c ;
      int counterPlus = ( int ) ( gap + 1 ) - 1 ;
      counter += Math . abs ( counterPlus ) ;
    }
  }
  int minEncounter = N ;
  for ( int i = 0 ;
  i < N ;
  i ++ ) {
    int s = start [ i ] [ 0 ] ;
    int c = circle [ i ] [ 1 ] ;
    int z = Fraction . valueOf ( 360 - s ) . multiply ( c ) ;
    minEncounter = Math . min ( minEncounter , encounters ( z ) ) ;
  }
  if ( Class . isEnum ( ) ) {
    final int T = Integer . parseInt ( System . console ( ) . readLine ( ) ) ;
    for ( int t = 0 ;
    t < T ;
    t ++ ) {
      final int N = Integer . parseInt ( System . console ( ) . readLine ( ) ) ;
      final List < Integer > list = Arrays . asList ( Integer . parseInt ( System . console ( ) . readLine ( ) ) ) ;
      for ( int i = 0 ;
      i < N ;
      i ++ ) {
        list . add ( Integer . parseInt ( System . console ( ) . readLine ( ) ) ) ;
      }
      System . out . println ( "Case #" + ( t + 1 ) + ": " + solve ( list ) ) ;
    }
  }
  return minEncounter ;
}
