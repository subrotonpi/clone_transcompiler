public static int [ ] dijkstra ( int s ) {
  int [ ] d = new int [ n ] ;
  boolean [ ] used = new boolean [ n ] ;
  Arrays . fill ( d , s ) ;
  d [ s ] = 0 ;
  while ( true ) {
    int v = - 1 ;
    for ( int i = 0 ;
    i < n ;
    i ++ ) {
      if ( ( ! used [ i ] ) && ( v == - 1 ) ) {
        v = i ;
      }
      else if ( ( ! used [ i ] ) && ( d [ i ] < d [ v ] ) ) {
        v = i ;
      }
    }
    if ( v == - 1 ) {
      break ;
    }
    used [ v ] = true ;
    for ( int j = 0 ;
    j < n ;
    j ++ ) {
      d [ j ] = Math . min ( d [ j ] , d [ v ] + cost [ v ] [ j ] ) ;
    }
  }
  int Xs = Integer . parseInt ( input . nextLine ( ) ) ;
  int Ys = Integer . parseInt ( input . nextLine ( ) ) ;
  int Xt = Integer . parseInt ( input . nextLine ( ) ) ;
  int Yt = Integer . parseInt ( input . nextLine ( ) ) ;
  n = Integer . parseInt ( input . nextLine ( ) ) ;
  Point [ ] p = new Point [ n + 2 ] ;
  p [ 0 ] = new Point ( Xs , Ys , 0 ) ;
  p [ 1 ] = new Point ( Xt , Yt , 0 ) ;
  for ( int i = 2 ;
  i < n + 2 ;
  i ++ ) {
    p [ i ] = new Point ( Integer . parseInt ( input . nextLine ( ) ) ) ;
  }
  cost = new int [ n + 2 ] ;
  for ( int i = 0 ;
  i < n + 2 ;
  i ++ ) {
    for ( int j = i ;
    j < n + 2 ;
    j ++ ) {
      cost [ i ] [ j ] = cost [ j ] [ i ] = Math . max ( ( ( p [ i ] . x - p [ j ] . x ) * ( p [ i ] . x - p [ j ] . x ) + ( p [ i ] . y - p [ j ] . y ) * ( p [ i ] . y - p [ j ] . y ) ) * 0.5 - p [ i ] [ j ] - p [ j ] [ i ] ) ;
    }
  }
  cost = cost ;
  n += 2 ;
  