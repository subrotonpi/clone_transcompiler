public static double atcoderExpress ( @ Nonnegative int N , @ Nonnegative int [ ] T , @ Nonnegative int [ ] V ) {
  int MAXT = Integer . parseInt ( T [ 0 ] ) ;
  int [ ] graph = new int [ 2 * MAXT + 1 ] ;
  Arrays . fill ( graph , 0 ) ;
  T = Arrays . copyOf ( T , N + 2 ) ;
  for ( int i = 0 ;
  i < N + 2 ;
  i ++ ) {
    T [ i + 1 ] += T [ i ] ;
  }
  V = Arrays . copyOf ( V , N + 2 ) ;
  Arrays . fill ( graph , 0 ) ;
  for ( int i = 0 ;
  i < N + 2 ;
  i ++ ) {
    int v = V [ i ] ;
    int l = T [ i ] ;
    int r = T [ i + 1 ] ;
    conditions [ i ] = new int [ N + 2 ] ;
    for ( int i = 0 ;
    i < N + 2 ;
    i ++ ) {
      int v = V [ i ] ;
      int l = T [ i ] ;
      int r = T [ i + 1 ] ;
      conditions [ i ] [ 0 ] = new int [ ] {
        l , r , v }
        ;
      }
      double total = 0.0 ;
      double prevV = 0.0 ;
      for ( int t = 0 ;
      t < MAXT * 2 + 1 ;
      t ++ ) {
        double minV = Double . MAX_VALUE ;
        int x = t / 2 ;
        for ( int i = 0 ;
        i < conditions . length ;
        i ++ ) {
          int l = conditions [ i ] ;
          int r = conditions [ i ] ;
          if ( x < l ) {
            minV = Math . min ( minV , v + ( l - x ) ) ;
          }
          else if ( r < x ) {
            minV = Math . min ( minV , v + ( x - r ) ) ;
          }
          else {
            minV = Math . min ( minV , v ) ;
          }
        }
        total += ( prevV + minV ) * 0.5 / 2 ;
        prevV = minV ;
      }
      return total ;
    }
    if ( getClass ( ) . equals ( String . class ) ) {
      N = Integer . parseInt ( input ( ) ) ;
      T = Arrays . copyOf ( graph , N ) ;
      V = Arrays . copyOf ( graph , N ) ;
    }
    double ans = atcoderExpress ( N , T , V ) ;
    System . out . println ( ans ) ;
    return ans ;
  }
  