@ Sys public static int score ( int t , int [ ] ih , int [ ] id , int s , Memory mem ) throws IOException {
  if ( t == 0 ) {
    return s ;
  }
  int [ ] h = ih , d = id ;
  int x = 0 ;
  while ( x < h . length ) {
    int hc = h [ x ] ;
    int hs = id [ x ] ;
    int ht = id [ x ] ;
    if ( ht >= 1 ) {
      s += hs ;
      t += ht - 1 ;
      h [ x ] = h [ x + 1 ] ;
      h [ x + 1 ] = d [ x ] ;
      d = id [ x + 1 ] ;
    }
    else {
      x ++ ;
    }
  }
  int ms = s ;
  Arrays . sort ( h , new Comparator < Integer > ( ) {
    public int compare ( Integer o1 , Integer o2 ) {
      boolean [ ] ch = new boolean [ h . length ] ;
      for ( int i = 1 ;
      i < h . length ;
      i ++ ) {
        for ( int j = 0 ;
        j < h [ i ] - 1 ;
        j ++ ) {
          if ( h [ i ] . intValue ( ) <= h [ j ] . intValue ( ) ) {
            ch [ j ] = true ;
            break ;
          }
        }
      }
      return ms ;
    }
  }
  ) ;
  for ( x = xrange ( h . length ) ;
  ! ch [ x ] ;
  ) {
    int hc = h [ x ] ;
    int hs = id [ x ] ;
    int ht = id [ x ] ;
    ms = Math . max ( ms , score ( t - 1 + ht , h , h , h , h , h , h , h , h , h , h , h , h , h , h , d , h , h , h , h ) ) ;
  }
  return ms ;
}
