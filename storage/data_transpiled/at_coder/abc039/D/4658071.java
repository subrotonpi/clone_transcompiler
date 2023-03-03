@ Nonnull public static Iterable < String > combinations ( @ Nonnull final int h , @ Nonnull final int w ) {
  final List < List < String >> aft = new ArrayList < > ( ) ;
  for ( int i = 0 ;
  i < h ;
  i ++ ) {
    aft . add ( Collections . singletonList ( input . next ( ) ) ) ;
  }
  final String [ ] [ ] bef = new String [ h ] [ w ] ;
  for ( int i = 0 ;
  i < h ;
  i ++ ) {
    bef [ i ] [ 0 ] = "#" ;
  }
  final int [ ] d = new int [ ] {
    - 1 , 0 , 1 }
    ;
    for ( int y = 0 ;
    y < h ;
    y ++ ) {
      for ( int x = 0 ;
      x < w ;
      x ++ ) {
        if ( aft . get ( y ) . get ( x ) . equals ( "." ) ) {
          for ( int dx = 0 ;
          dx < d . length ;
          dx ++ ) {
            final int dy = d [ x ] ;
            final int nx = x + dx ;
            final int ny = y + dy ;
            if ( 0 <= nx && nx < w && 0 <= ny && ny < h ) {
              bef [ ny ] [ nx ] = "." ;
            }
          }
        }
      }
    }
    final String [ ] [ ] aft2 = new String [ h ] [ w ] ;
    for ( int y = 0 ;
    y < h ;
    y ++ ) {
      for ( int x = 0 ;
      x < w ;
      x ++ ) {
        for ( int dx = 0 ;
        dx < d . length ;
        dx ++ ) {
          final int ny = d [ x ] ;
          final int nx = x + dx ;
          final int ny = y + dy ;
          if ( 0 <= nx && nx < w && 0 <= ny && ny < h && bef [ ny ] [ nx ] . equals ( "#" ) ) {
            aft2 [ y ] [ x ] = "#" ;
            break ;
          }
        }
      }
    }
    if ( aft . equals ( aft2 ) ) {
      System . out . println ( "possible" ) ;
      for ( int i = 0 ;
      i < h ;
      i ++ ) {
        System . out . println ( Arrays . toString ( bef [ i ] ) ) ;
      }
    }
    else {
      System . out . println ( "impossible" ) ;
    }
    return aft ;
  }
  