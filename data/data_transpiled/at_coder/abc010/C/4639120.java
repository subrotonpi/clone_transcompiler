public static double sx = Double . parseDouble ( input ) {
  double x = Double . parseDouble ( input ) ;
  double y = Double . parseDouble ( input ) ;
  double t = Double . parseDouble ( input ) ;
  double v = Double . parseDouble ( input ) ;
  int n = Integer . parseInt ( input ) ;
  for ( int i = 0 ;
  i < n ;
  i ++ ) {
    x = Integer . parseInt ( input ) ;
    y = Integer . parseInt ( input ) ;
    if ( ( ( x - sx ) * x + ( y - sy ) * y ) <= 0.5 ) {
      x = Integer . parseInt ( input ) ;
      y = Integer . parseInt ( input ) ;
    }
  }
  return x ;
}
