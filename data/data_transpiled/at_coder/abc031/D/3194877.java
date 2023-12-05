@ VisibleForTesting static Iterable < Integer > combinations ( ) {
  int K = Integer . parseInt ( input . nextLine ( ) ) ;
  int N = Integer . parseInt ( input . nextLine ( ) ) ;
  int [ ] V = new int [ N ] , W = new int [ N ] ;
  for ( int i = 0 ;
  i < N ;
  i ++ ) V [ i ] = input . nextInt ( ) ;
  for ( int [ ] ptn : new int [ ] {
    1 , 4 }
    ) {
      List < Integer > s = new ArrayList < > ( K ) ;
      for ( int i = 0 ;
      i < N ;
      i ++ ) {
        int [ ] v = Lists . newArrayList ( V ) ;
        int [ ] w = W [ i ] ;
        if ( Arrays . equals ( ptn , v ) ) {
          break ;
        }
        for ( int vi : v ) {
          int l = ptn [ vi - 1 ] ;
          s . add ( w [ 0 ] ) ;
          w [ 0 ] = w [ l ] ;
        }
      }
      if ( Arrays . equals ( s . toArray ( ) , 1 ) ) {
        continue ;
      }
      boolean flag = true ;
      for ( int i = 0 ;
      i < N ;
      i ++ ) {
        int [ ] v = Lists . newArrayList ( V ) ;
        int [ ] w = W [ i ] ;
        for ( int vi : v ) {
          int l = ptn [ vi - 1 ] ;
          if ( s . get ( vi - 1 ) != w [ 0 ] ) {
            flag = false ;
            break ;
          }
          w [ 0 ] = w [ l ] ;
        }
        if ( ! flag ) {
          break ;
        }
      }
      if ( flag ) {
        for ( Integer si : s ) {
          System . out . println ( si ) ;
        }
        break ;
      }
    }
    return s ;
  }
  