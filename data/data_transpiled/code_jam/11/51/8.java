public static String solve ( ) {
  int w = Integer . parseInt ( readLine ( ) ) ;
  int l = Integer . parseInt ( readLine ( ) ) ;
  int u = Integer . parseInt ( readLine ( ) ) ;
  int g = Integer . parseInt ( readLine ( ) ) ;
  int [ ] L = new int [ l ] ;
  int [ ] U = new int [ u ] ;
  for ( int i = 0 ;
  i < l ;
  i ++ ) {
    L [ i ] = Integer . parseInt ( readLine ( ) ) ;
    U [ i ] = Integer . parseInt ( readLine ( ) ) ;
  }
  w ++ ;
  float [ ] h = new float [ w ] ;
  float [ ] hl = new float [ w ] ;
  for ( int i = 0 ;
  i < l ;
  i ++ ) {
    float dx = L [ i ] [ 0 ] - L [ i - 1 ] [ 0 ] ;
    float d = 1.0f * ( L [ i ] [ 1 ] - L [ i - 1 ] [ 1 ] ) / dx ;
    for ( int x : xrange ( dx + 1 ) ) {
      h [ x + L [ i - 1 ] [ 0 ] ] = x * d + L [ i - 1 ] [ 1 ] ;
    }
  }
  l = u ;
  L = U ;
  for ( int i = 0 ;
  i < l ;
  i ++ ) {
    float dx = L [ i ] [ 0 ] - L [ i - 1 ] [ 0 ] ;
    float d = 1.0f * ( L [ i ] [ 1 ] - L [ i - 1 ] [ 1 ] ) / dx ;
    for ( int x : xrange ( dx + 1 ) ) {
      hl [ x + L [ i - 1 ] [ 0 ] ] = x * d + L [ i - 1 ] [ 1 ] ;
    }
  }
  float [ ] h = new float [ hl . length ] ;
  for ( int i = 0 ;
  i < hl . length ;
  i ++ ) {
    h [ i ] = h [ i ] - y ;
    float a = Float . intBitsToFloat ( ( h [ i ] + h [ i - 1 ] ) * .5 ) ;
    float d = a / g ;
    float [ ] r = new float [ w ] ;
    int i = 0 ;
    int c = 0 ;
    while ( r . length < g - 1 ) {
      if ( c >= d - eps ) {
        float ll = 0.0f , rr = 1.0f ;
        float ap ;
        while ( rr - ll > 1e-8 ) {
          float m = (