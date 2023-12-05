@ GwtIncompatible ( "collections.Iterable" ) public static < C , F , X > Iterable < Double > readCases ( final String argv [ ] ) {
  final Case Case < C , F , X > Case = new FluentIterable < > ( ) {
    @ Override public Case . Builder < C , F , X > readCase ( final BufferedReader in ) throws IOException {
      return Case . builder ( readDoubles ( in ) ) ;
    }
    @ Override public double solvecase ( final Iterable < Double > testCase ) {
      final Iterable < Double > it = farmCost ( testCase ) ;
      double best = ( Double ) it . iterator ( ) . next ( ) ;
      int farms = 0 ;
      for ( final Double time : it ) {
        if ( time < best ) {
          best = time ;
          farms ++ ;
        }
        else {
          return best ;
        }
      }
      return farms ;
    }
  }
  ;
  return new Iterable < Double > ( ) {
    @ Override public Iterator < Double > iterator ( ) {
      return testCase ;
    }
  }
  ;
}
