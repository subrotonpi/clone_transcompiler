@ VisibleForTesting static double [ ] [ ] solve ( ) {
  int cases = Integer . parseInt ( readLine ( ) ) ;
  for ( int c : xrange ( 1 , cases + 1 ) ) {
    int ns = Integer . parseInt ( readLine ( ) ) ;
    int [ ] x = new int [ ns ] ;
    int [ ] y = new int [ ns ] ;
    int [ ] z = new int [ ns ] ;
    int [ ] p = new int [ ns ] ;
    double minValue = 0 ;
    int ship1 = - 1 ;
    int ship2 = - 1 ;
    if ( ns == 1 ) {
      System . out . println ( "Case #" + c + ": 0.000000" ) ;
      continue ;
    }
    for ( int i = 0 ;
    i < xrange ( ns ) ;
    i ++ ) {
      String xs = readLine ( ) . split ( " " ) ;
      String ys = readLine ( ) . split ( " " ) ;
      String zs = readLine ( ) . split ( " " ) ;
      String ps = readLine ( ) . split ( " " ) ;
      int xa = Integer . parseInt ( xs ) ;
      int ya = Integer . parseInt ( ys ) ;
      int za = Integer . parseInt ( zs ) ;
      int pa = Integer . parseInt ( ps ) ;
      x [ i ] = Integer . parseInt ( xs ) ;
      y [ i ] = Integer . parseInt ( ys ) ;
      z [ i ] = Integer . parseInt ( zs ) ;
      p [ i ] = Integer . parseInt ( ps ) ;
      for ( int j : xrange ( i + 1 ) ) {
        int xb = x [ j ] ;
        int yb = y [ j ] ;
        int zb = z [ j ] ;
        int pb = p [ j ] ;
        double value = ( fabs ( xb - xa ) + fabs ( yb - ya ) + fabs ( zb - za ) ) / ( double ) ( ( pa + pb ) ) ;
        if ( value > minValue ) {
          minValue = value ;
          ship1 = i ;
          ship2 = j ;
        }
      }
    }
    double totalpf = ( double ) p [ ship1 ] + ( double ) p [ ship2 ] ;
    double scale = ( double ) p [ ship1 ] / ( double ) totalpf ;
    double cruiserx = ( x [ ship2 ] - x [ ship1 ] ) * scale + x [ ship1 ] ;
    double cruisery = ( y [ ship2 ] - y [ ship1 ] ) * scale + y [ ship @ @