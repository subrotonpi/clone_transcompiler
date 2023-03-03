static final int testCount = scanner . nextInt ( ) {
  int testCount = scanner . nextInt ( ) ;
  int r = scanner . nextInt ( ) ;
  int n = scanner . nextInt ( ) ;
  int m = scanner . nextInt ( ) ;
  int k = scanner . nextInt ( ) ;
  System . out . println ( "Case #1:" ) ;
  for ( final int i = xrange ( r ) ;
  i < testCount ;
  i ++ ) {
    final int [ ] products = new int [ k ] ;
    for ( final int [ ] sequence : new int [ ] {
      2 , m + 1 }
      ) {
        final Set < Integer > ps = new HashSet < Integer > ( ) ;
        for ( final int mask : xrange ( 1 << n ) ) {
          int p = 1 ;
          for ( final int i : xrange ( n ) ) {
            if ( ( mask >> i & 1 ) != 0 ) {
              p *= sequence [ i ] ;
            }
          }
          ps . add ( p ) ;
        }
        boolean valid = true ;
        for ( final int p : products ) {
          valid &= ps . contains ( p ) ;
        }
        if ( valid ) {
          scanner . close ( ) ;
          break ;
        }
      }
    }
    return testCount ;
  }
  