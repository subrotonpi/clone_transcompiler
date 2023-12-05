public static int [ ] parse ( int ln , int kn , int ... ki ) throws IOException {
  int [ ] pa = new int [ ki . length ] ;
  int [ ] ky = new int [ ki . length ] ;
  ky [ 0 ] = pa ;
  int kigu = 1 ;
  for ( int ys = 2 ;
  ys <= kn ;
  ys ++ ) {
    if ( kigu == 1 ) pa += ki [ kn - ys ] * 2 + ln - ki [ ki . length - ( ys / 2 ) ] * 2 ;
    else pa += ki [ kn - ys ] * 2 - ki [ ki . length - ( ys / 2 ) - 1 ] + ln - ki [ ki . length - ( ys / 2 ) ] ;
    ky [ ys ] = pa ;
    kigu *= - 1 ;
  }
  pa = ln - ki [ 0 ] ;
  ky [ 0 ] = pa ;
  kigu = 1 ;
  for ( int ys = 2 ;
  ys <= kn ;
  ys ++ ) {
    if ( kigu == 1 ) pa += ( ln - ki [ ys - 1 ] ) * 2 - ln + ki [ ys / 2 - 1 ] * 2 ;
    else pa += ( ln - ki [ ys - 1 ] ) * 2 + ki [ ys / 2 ] - ln + ki [ ys / 2 - 1 ] ;
    ky [ ys ] = pa ;
    kigu *= - 1 ;
  }
  System . out . println ( max ( ky ) ) ;
  return ky ;
}
