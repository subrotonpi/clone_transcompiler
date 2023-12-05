static final double R_PI ( ) {
  double total = 0 ;
  double r = 0.001 ;
  double x , y , x0 , y0 , y1 , x1 , y0 , a , a , b , j ;
  double sum = 0 ;
  for ( int k = 0 ;
  k < N ;
  k ++ ) {
    y = r + d * k ;
    if ( x * x + y * y > ll ) break ;
    if ( x + g ) {
      s = a0 ( g , l , x , y ) * 8 ;
    }
    else if ( x * x + y < ll ) {
      s = a1 ( g , l , x , y ) * 8 ;
    }
    else {
      s = a2 ( g , l , x , y ) * 8 ;
    }
    total += s ;
  }
  System . out . format ( "Case #%d: %.6f" , i + 1 , A / A0 ) ;
  if ( __name__ == "__main__" ) {
    f = System . in ;
    main ( f ) ;
  }
  else {
    f = System . in ;
    main ( f ) ;
  }
  long A = ( R * R * a - ( x0 - x1 ) * y0 - ( y1 - y0 ) * x1 ) / 2 ;
  long Ao = ( x0 - x1 ) * ( y1 - y0 ) - A ;
  return d * d - Ao ;
}
