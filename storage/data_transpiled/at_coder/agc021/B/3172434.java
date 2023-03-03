@ VisibleForTesting static double [ ] [ ] cos ( double [ ] [ ] p1 ) {
  int n = Integer . parseInt ( input ) ;
  int [ ] [ ] p1 = new int [ n ] [ ] ;
  for ( int i = 0 ;
  i < p1 . length ;
  i ++ ) p1 [ i ] = new int [ ] ;
  for ( int i = 0 ;
  i < p1 [ i ] . length ;
  i ++ ) p1 [ i ] [ 0 ] = Integer . parseInt ( input [ i ] [ 0 ] ) ;
  Arrays . sort ( p1 ) ;
  int [ ] [ ] p = new int [ p1 [ 0 ] . length ] [ ] , q = new int [ p1 [ 0 ] . length ] , ans = new int [ ] [ ] ;
  double x1 = p [ 0 ] [ 0 ] , x2 = p [ 0 ] [ 1 ] + 1 , y1 = p [ 0 ] [ 0 ] , y2 = p [ 0 ] [ 1 ] , z1 = p [ 0 ] [ 1 ] , z2 = 10 * 6 + 1 , 0 ;
  /* cos */
  double a = a - c , b = b - d , e = c , f = d - c , d = d - c , c = d - c , e = c , f = d - c , c = c , d = d - c , c = d , e = c , f = d , c = c , d = d , c = d , d = c , d = d , c = d , d = c , d = d , c = d , d = c , e = d , c = d , d = c , d = d , c = d , d = d , c = d , d = c , d = d , c = d , d = d , c = d , d = c , d = d , c = d , d = d , e = c , d = d , c = d , d = d , c = d , d = d , d = d , c = d , d = d , d = d , c = d , d = d , e = c , d = d , c = d , d = d , d = d , c = d , d = d , d = d , c = d , d = d , c = d , d = d , d = d , c = d , d = d , d = d , c