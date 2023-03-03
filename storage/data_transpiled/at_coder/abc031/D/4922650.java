public static @ Nullable Map < Integer , String > goroAWase ( int K , int N , @ NonNull List < Map . Entry < Integer , String >> goro ) throws Exception {
  for ( int i = 0 ;
  i < 3 * K ;
  i ++ ) {
    HashMap < Integer , Integer > map = new HashMap < > ( ) ;
    for ( int k = 0 ;
    k < K ;
    k ++ ) {
      map . put ( k + 1 , ( i % 3 ) + 1 ) ;
      i /= 3 ;
    }
    for ( Map . Entry < Integer , String > entry : goro ) {
      int n , w ;
      int assumpLen = 0 ;
      while ( n > 0 ) {
        assumpLen += map . get ( n % 10 ) ;
        n /= 10 ;
      }
      if ( assumpLen != entry . getValue ( ) . length ( ) ) {
        break ;
      }
    }
    else {
      Map < Integer , String > res = new HashMap < > ( ) ;
      for ( Map . Entry < Integer , String > entry : goro ) {
        int n = entry . getKey ( ) ;
        int idx = 0 ;
        List < Integer > digits = new ArrayList < > ( ) ;
        while ( n > 0 ) {
          int k = n % 10 ;
          n /= 10 ;
          digits . add ( k ) ;
        }
        for ( int k : new ArrayList < > ( digits ) ) {
          String sk = entry . getValue ( ) . substring ( idx , idx + map . get ( k ) ) ;
          idx = idx + map . get ( k ) ;
          if ( res . containsKey ( k ) && res . get ( k ) != sk ) {
            break ;
          }
          res . put ( k , sk ) ;
        }
        else {
          continue ;
        }
        break ;
      }
      else {
        return res ;
      }
    }
  }
  return null ;
}
