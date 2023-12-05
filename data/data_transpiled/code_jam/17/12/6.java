static final int [ ] [ ] resize ( int tt ) {
  int tt = Integer . parseInt ( readLine ( ) ) ;
  for ( int t : xrange ( 1 , tt + 1 ) ) {
    int [ ] r = new int [ n ] ;
    List < Integer > x = new ArrayList < Integer > ( ) ;
    List < Integer [ ] > packs = new ArrayList < Integer [ ] > ( ) ;
    int ans = 0 ;
    int n = Integer . parseInt ( readLine ( ) . trim ( ) ) ;
    int m = Integer . parseInt ( readLine ( ) . trim ( ) ) ;
    r = Integer . parseInt ( readLine ( ) . trim ( ) ) ;
    for ( int i : xrange ( n ) ) {
      int [ ] qq = Integer . parseInt ( readLine ( ) . trim ( ) ) ;
      for ( int q : qq ) {
        int blo = ( 10 * q + ( 11 * r [ i ] - 1 ) ) / ( 11 * r [ i ] ) ;
        int bhi = ( 10 * q ) / ( 9 * r [ i ] ) ;
        if ( blo <= bhi ) x . add ( new Integer [ ] {
          blo , bhi , i }
          ) ;
        }
        Integer [ ] h = new Integer [ n ] ;
        HeapSort . sort ( h ) ;
        packs . add ( h ) ;
      }
      Collections . sort ( x ) ;
      Iterator < Integer [ ] > it = x . iterator ( ) ;
      while ( it . hasNext ( ) ) {
        Integer [ ] tlo = it . next ( ) ;
        int thi = tlo . intValue ( ) ;
        int item = thi [ 0 ] ;
        int tnow = tlo . intValue ( ) ;
        heappush ( packs . get ( item ) , thi ) ;
        boolean foul = false ;
        for ( int i : xrange ( n ) ) {
          while ( packs . get ( i ) . intValue ( ) > 0 && packs . get ( i ) . intValue ( ) < tnow ) heappush ( packs . get ( i ) ) ;
          if ( packs . get ( i ) . intValue ( ) <= 0 ) foul = true ;
        }
        if ( ! foul ) {
          for ( int i : xrange ( n ) ) heappush ( packs . get ( i ) ) ;
          ans ++ ;
        }
      }
      System . out . println ( "Case #" + t + ": " + ans ) ;
    }
    return x . toArray (