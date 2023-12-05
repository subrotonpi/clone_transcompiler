public static int H = Integer . parseInt ( input ) {
  int H = Integer . parseInt ( input . nextLine ( ) ) ;
  int W = Integer . parseInt ( input . nextLine ( ) ) ;
  int res = 10 * 100 ;
  Iterator < Integer > it = new Iterator < Integer > ( ) {
    int h = H ;
    int w = W ;
    for ( int i = 1 ;
    i < h ;
    i ++ ) {
      int [ ] k = new int [ 2 ] , l = new int [ 2 ] ;
      k [ 0 ] = w * i ;
      k [ 1 ] = w * ( ( h - i ) / 2 ) ;
      k [ 2 ] = w * ( ( h - i ) - ( h - i ) / 2 ) ;
      l [ 0 ] = w * i ;
      l [ 1 ] = ( h - i ) * ( w - i ) ;
      l [ 2 ] = ( h - i ) * ( w - i ) ;
      res = Math . min ( res , Math . max ( k , l ) - Math . min ( l , k ) ) ;
    }
  }
  ;
  return res ;
}
