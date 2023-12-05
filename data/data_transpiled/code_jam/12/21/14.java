public static String solve ( int N , int ... votes ) {
  int X = Integer . valueOf ( votes [ 0 ] ) ;
  Comparator < Integer > comparator = new Comparator < Integer > ( ) {
    @ Override public int compare ( Integer i , Integer w ) {
      return votes [ i ] + X * w ;
    }
  }
  ;
  Comparator < Integer > rebalance = new Comparator < Integer > ( ) {
    @ Override public int compare ( Integer i , Integer w ) {
      if ( w <= EPSILON ) {
        return i ;
      }
      List < Pair < Integer , Integer >> sortedPairs = new ArrayList < Pair < Integer , Integer >> ( ) ;
      Collections . sort ( sortedPairs , comparator ) ;
      int [ ] scores = CollectionUtils . comparePairs ( sortedPairs , 1 ) ;
      double t = Double . MAX_VALUE ;
      int imax = N ;
      for ( int i = 0 ;
      i < N - 1 ;
      i ++ ) {
        if ( scores [ i + 1 ] - scores [ i ] > EPSILON ) {
          t = scores [ i + 1 ] ;
          imax = i + 1 ;
          break ;
        }
      }
      if ( imax * ( t - scores [ 0 ] ) > ( rem * X ) ) {
        int [ ] ret = weights . clone ( ) ;
        for ( int i = 0 ;
        i < N ;
        i ++ ) {
          if ( i < imax ) {
            ret [ sortedPairs . get ( i ) . first ] += rem / ( double ) imax ;
          }
        }
        return ret ;
      }
    }
  }
  ;
  int [ ] newWeights = weights . clone ( ) ;
  int newRem = rem ;
  double w = ( t - scores [ 0 ] ) / ( double ) X ;
  for ( int i = 0 ;
  i < imax ;
  i ++ ) {
    newWeights [ sortedPairs . get ( i ) . first ] += w ;
    newRem -= w ;
  }
  return rebalance . compare ( newWeights , newRem ) ;
}
