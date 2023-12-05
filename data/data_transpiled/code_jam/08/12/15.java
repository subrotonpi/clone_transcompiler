public static void main ( String [ ] args ) {
  final Scanner cin = new Scanner ( System . in ) ;
  for ( ;
  ;
  ) {
    final int milk = cin . nextInt ( ) ;
    final int cust = cin . nextInt ( ) ;
    final int [ ] [ ] fav = new int [ milk ] [ ] ;
    for ( int c = 0 ;
    c < Math . min ( cust , milk ) ;
    c ++ ) {
      final int [ ] l = new int [ milk ] ;
      for ( int x = cin . nextInt ( ) ;
      x < l . length ;
      x ++ ) l [ x ] = Integer . parseInt ( cin . next ( ) . trim ( ) ) ;
      final int [ ] m = new int [ l . length ] ;
      final int [ ] u = new int [ l . length ] ;
      for ( int i = 0 ;
      i < Math . min ( l [ 0 ] , milk ) ;
      i ++ ) {
        final int x = l [ 2 * i + 1 ] - 1 , y = l [ 2 * i + 2 ] ;
        if ( y == 1 ) m [ i ] = x ;
        else u [ i ] = x ;
      }
      fav [ c ] = new int [ m . length ] ;
      fav [ c ] = new int [ u . length ] ;
      for ( int i = 0 ;
      i < u . length ;
      i ++ ) {
        final int x = l [ 2 * i + 1 ] - 1 , y = l [ 2 * i + 2 ] - 1 ;
        if ( y == 1 ) u [ x ] = x ;
        else u [ y ] = x ;
      }
      fav [ c ] [ c ] = new int [ ] {
        m [ 0 ] , u [ 0 ] }
        ;
        final boolean [ ] done = new boolean [ cust ] ;
        Arrays . fill ( done , false ) ;
        final int [ ] malt = new int [ milk ] ;
        boolean impossible = false ;
        while ( true ) {
          boolean change = false ;
          for ( int i = 0 ;
          i < Math . min ( milk , milk ) ;
          i ++ ) {
            if ( ! done [ i ] ) {
              final int m = fav [ i ] ;
              final int u [ ] = fav [ i ] ;
              if ( m != null && malt [ m [ 0 ] ] != 0 ) {
                done [ i ] = true ;
                continue ;
              }
              if ( ( u == null ) ||