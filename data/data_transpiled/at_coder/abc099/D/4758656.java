public static int n ( Scanner input ) {
  int c = input . nextInt ( ) ;
  int [ ] [ ] dmap = new int [ c ] [ c ] ;
  for ( int i = 0 ;
  i < c ;
  i ++ ) dmap [ i ] = Lists . newArrayList ( ) ;
  for ( int i = 0 ;
  i < n ;
  i ++ ) cmap [ i ] = Lists . newArrayList ( ) ;
  for ( int i = 0 ;
  i < cmap . length ;
  i ++ ) cmap [ i ] = Lists . newArrayList ( ) ;
  for ( int i = 0 ;
  i < cmap . length ;
  i ++ ) {
    int [ ] clist = cmap [ i ] . toArray ( ) ;
    for ( int j = 0 ;
    j < clist . length ;
    j ++ ) {
      int _c = clist [ j ] ;
      if ( ( i + j + 2 ) % 3 == 2 ) {
        if ( d1 [ _c - 1 ] != 0 ) d1 [ _c - 1 ] ++ ;
        else d1 [ _c - 1 ] = 1 ;
      }
      else if ( ( i + j + 2 ) % 3 == 0 ) {
        if ( d2 [ _c - 1 ] != 0 ) d2 [ _c - 1 ] ++ ;
        else d2 [ _c - 1 ] = 1 ;
      }
      else {
        if ( d3 [ _c - 1 ] != 0 ) d3 [ _c - 1 ] ++ ;
        else d3 [ _c - 1 ] = 1 ;
      }
    }
  }
  int minc = 0 ;
  for ( int c1 = 0 ;
  c1 < c ;
  c1 ++ ) {
    for ( int c2 = 0 ;
    c2 < c ;
    c2 ++ ) {
      for ( int c3 = 0 ;
      c3 < c ;
      c3 ++ ) {
        int tmp = 0 ;
        if ( c1 == c2 || c2 == c3 || c3 == c1 ) continue ;
        for ( Map . Entry < Integer , Integer > _c : d1 . entrySet ( ) ) {
          int cn = _c . getValue ( ) ;
          tmp += dmap [ _c . getKey ( ) ] [ c1 ] * cn ;
        }
        for ( Map . Entry < Integer , Integer > _c : d2 . entrySet ( ) ) {
          tmp += dmap [ _c . getKey ( ) ] [ c2 ] * cn ;
        }
        for ( Map . Entry < Integer , Integer > _c : d3 . entrySet ( ) ) {
          tmp += dmap [ _c . getKey ( ) ] [ c3 ] * cn ;
        }
        if ( minc == 0 ) minc = tmp ;
        else if ( minc > tmp ) min @ @