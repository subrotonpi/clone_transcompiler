static final int [ ] getans ( int [ ] a , int [ ] b , int [ ] k ) {
  int T = Integer . parseInt ( readLine ( ) ) ;
  {
    int [ ] ret = new int [ T ] ;
    while ( x > 0 ) {
      ret [ x ] = x % 2 ;
      x /= 2 ;
    }
    if ( ret . length == 0 ) {
      return new int [ ] {
        0 }
        ;
      }
      return ret ;
    }
    {
      int [ ] ret = new int [ T ] ;
      int i = 0 ;
      for ( int x : xrange ( T ) ) {
        System . out . printf ( "Case #%d: " , i + 1 ) ;
        int A = Integer . parseInt ( readLine ( ) ) ;
        int B = Integer . parseInt ( readLine ( ) ) ;
        int K = A ;
        if ( K > B ) K = B ;
        a = toBinary ( A ) ;
        b = toBinary ( B ) ;
        int maxlen = Math . max ( a . length , b . length ) ;
        while ( a . length < maxlen ) a [ a . length ++ ] = 0 ;
        while ( b . length < maxlen ) b [ b . length ++ ] = 0 ;
        while ( k . length < maxlen ) k [ b . length ++ ] = 0 ;
        int ans = getans ( a , b , k ) ;
        System . out . println ( ans ) ;
      }
    }
    {
      int ans [ ] = new int [ T ] ;
      for ( int i = 0 ;
      i < T ;
      i ++ ) {
        System . out . printf ( "Case #%d: " , i + 1 ) ;
        int A = Integer . parseInt ( readLine ( ) ) ;
        int B = Integer . parseInt ( readLine ( ) ) ;
        if ( K > A ) K = A ;
        if ( K > B ) K = B ;
        a = toBinary ( A ) ;
        b = toBinary ( B ) ;
        int k = Math . max ( a . length , b . length ) ;
        while ( a . length < b . length ) a [ a . length ++ ] = 0 ;
        while ( b . length < b . length ) b [ b . length ++ ] = 0 ;
        ans = one * toNum ( b , a , b ) ;
        ans += toNum ( a , b , b ) ;
      }
    }
    {
      int ans [ ] = new int [ T ] ;
      for ( int i = 0 ;
      i < T ;
      i ++ ) ans [