@ GwtIncompatible ( "java.util.Vector" ) private static int [ ] [ ] generateFeatures ( ) {
  /* Generate some features */
  final int [ ] [ ] features = new int [ features . length ] [ ] ;
  {
    gen ( ) ;
  }
  final int n = features . length ;
  {
    final boolean bad = nextInt ( 2 ) % 2 == 1 ;
    final int [ ] p = new int [ n ] ;
    for ( int i = 0 ;
    i < n ;
    i ++ ) {
      final int j ;
      if ( bad ) {
        j = nextInt ( ) ;
      }
      else {
        j = nextInt ( n - i ) + i ;
      }
      final int t = features [ i ] ;
      features [ i ] = features [ j ] ;
      features [ j ] = t ;
    }
    return features ;
  }
  {
    final int k = 5 ;
    final int l = features [ 0 ] . length ;
    for ( int i = 0 ;
    i < k ;
    i ++ ) {
      for ( int j = 0 ;
      j < k ;
      j ++ ) {
        int s = 0 ;
        for ( int t = 0 ;
        t < l ;
        t ++ ) {
          if ( ( j + 1 ) * l > features [ i * l + t ] [ j ] ) {
            s ++ ;
          }
        }
        features [ i ] [ j ] = t ;
      }
    }
    {
      final int n = 1000 ;
      final int m = 2000 ;
      final Predicate < Integer > anovaFilter = new Predicate < Integer > ( ) {
        public boolean apply ( Integer ... in ) {
          return true ;
        }
      }
      ;
      final FeatureVector < Integer > featureVector = FeatureVector . create ( n , m , features [ i ] ) ;
      final FeatureVector < Integer > featureVector = featureVector . filter ( anovaFilter ) ;
      featureVector . add ( featureVector ) ;
      return featureVector . toArray ( new FeatureVector < Integer > ( featureVector ) ) ;
    }
  }
  {
    final int [ ] [ ] train = new int [ m ] ;
    for ( int i = 0 ;
    i < m ;
    i ++ ) {
      train [ i ] = gen ( ) ;
    }
    final int [ ] X = new int [ n ] ;
    for ( int i = 0 ;
    i < n ;
    i ++ ) {
      X [ i ] = features [ i ] . get ( 0 ) ;
    }
    final int [ ] Y = new int [ n ] ;
    for ( int i = 0 ;
    i < n ;
    i ++ ) {
      Y [ i ] = features [