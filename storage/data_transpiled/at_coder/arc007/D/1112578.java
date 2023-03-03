public static boolean input ( ) {
  String s = input ( ) ;
  if ( s . charAt ( 0 ) == '0' ) {
    s = "1" + s ;
  }
  int l = s . length ( ) ;
  int sep = l ;
  for ( int i = 1 ;
  i < l ;
  i ++ ) {
    if ( s . charAt ( i ) != '0' ) {
      sep = i ;
      break ;
    }
  }
  int [ ] a = new int [ l ] ;
  a [ 0 ] = Integer . parseInt ( s . substring ( 0 , sep ) ) ;
  s = s . substring ( sep , l ) ;
  l = s . length ( ) ;
  if ( l == 0 ) {
    System . err . println ( a [ 0 ] + " " + 1 ) ;
    exit ( ) ;
  }
  if ( a [ 0 ] >= Integer . MAX_VALUE ) {
    int b = Integer . parseInt ( s ) ;
    String sa = Integer . toString ( a [ 0 ] ) ;
    int la = sa . length ( ) ;
    int lb = s . length ( ) ;
    if ( la > lb && sa . substring ( 0 , lb ) . equals ( s . substring ( 0 , lb ) ) ) {
      System . err . println ( a [ 0 ] + " " + 1 ) ;
      exit ( ) ;
    }
    while ( a [ 0 ] >= b ) b *= 10 ;
    System . err . println ( a [ 0 ] + " " + b - a [ 0 ] ) ;
    exit ( ) ;
  }
  /* check if (s.charAt(0) == 0 || t.charAt(0) == 0) */
  for ( int i = 1 ;
  i < l ;
  i ++ ) {
    int [ ] b = new int [ a . length + 1 ] ;
    b [ 0 ] = Integer . parseInt ( s . substring ( 0 , i ) ) ;
    int r = b [ 1 ] - b [ 0 ] ;
    if ( r <= 0 ) continue ;
    String t = s . substring ( i , l ) ;
    do {
      b [ 1 ] = b [ b . length - 1 ] + r ;
      String u = Integer . toString ( b [ b . length - 1 ] ) ;
      if ( ! check ( t , u ) ) break ;
      int lt = t . length ( ) ;
      int lu = u . length ( ) ;
      if ( lt <= lu ) {
        System . err . println ( b [ 0 ] + " "