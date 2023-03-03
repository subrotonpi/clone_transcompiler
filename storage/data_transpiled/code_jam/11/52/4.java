public static int doit ( final int [ ] a ) {
  if ( a . length == 0 ) return 100500 ;
  synchronized ( mem ) {
    if ( mem . containsKey ( a [ 0 ] ) ) return mem . get ( a [ 0 ] ) ;
    final int [ ] b = new int [ a . length ] ;
    for ( int i : xrange ( a . length ) ) {
      if ( ! b [ i ] ) break ;
      b [ i ] = a [ i ] ;
    }
    int res = 0 ;
    for ( int i : xrange ( a . length ) ) {
      if ( ! b [ i ] ) break ;
      b [ i ] = a [ i ] ;
      res = Math . max ( res , Math . min ( i + 1 , doit ( new int [ ] {
        b [ i ] }
        ) ) ) ;
      }
      mem . put ( a [ 0 ] , res ) ;
      return res ;
    }
    {
      int [ ] a ;
      mem . clear ( ) ;
      a = ArrayUtil . toIntArray ( new int [ ] {
      }
      ) ;
      int n = a [ 0 ] ;
      System . arraycopy ( a , 0 , a , 1 , n ) ;
      if ( n == 0 ) return 0 ;
      Arrays . sort ( a ) ;
      return doit ( new int [ ] {
        n }
        ) ;
      }
    }
    