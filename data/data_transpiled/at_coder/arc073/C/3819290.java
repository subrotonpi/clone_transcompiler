public static int [ ] inpl ( ) {
  return Arrays . stream ( input . split ( " " ) ) . mapToInt ( Integer :: parseInt ) . toArray ( ) ;
  int N = Integer . parseInt ( input . nextLine ( ) ) ;
  int [ ] C = new int [ N ] ;
  int [ ] X = new int [ N ] ;
  int [ ] Y = new int [ N ] ;
  for ( int i = 0 ;
  i < N ;
  i ++ ) {
    int x = inpl ( ) ;
    int y = inpl ( ) ;
    if ( x > y ) x = y ;
    X [ i ] = x ;
    Y [ i ] = y ;
    C [ i ] = new int [ N ] ;
  }
  int minx = Math . min ( X ) ;
  int maxx = Math . max ( X ) ;
  int miny = Math . min ( Y ) ;
  int maxy = Math . max ( Y ) ;
  int ans = ( maxy - miny ) * ( maxx - minx ) ;
  int ix = X [ iy ] , r = Y [ ix ] ;
  if ( r < l ) l = r ;
  ArrayList < Integer > H = new ArrayList < Integer > ( ) ;
  for ( int i = 0 ;
  i < C . length ;
  i ++ ) {
    int x = C [ i ] ;
    int y = C [ i ] ;
    if ( y <= l ) {
      l = y ;
      continue ;
    }
    if ( x >= r ) {
      r = x ;
      continue ;
    }
    H . add ( new Integer ( x ) ) ;
  }
  ArrayList < Integer > Candi = new ArrayList < Integer > ( ) ;
  for ( int i = 0 ;
  i < H . size ( ) ;
  i ++ ) {
    int x = H . get ( i ) ;
    int y = Candi . get ( i ) ;
    ans = Math . min ( ans , ( maxy - minx ) * ( r - x ) ) ;
    r = Math . max ( r , y ) ;
  }
  ans = Math . min ( ans , ( maxy - minx ) * ( r - l ) ) ;
  System . out . println ( ans ) ;
}
