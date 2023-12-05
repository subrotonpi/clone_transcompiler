public static double [ ] [ ] Xs , double Ys , double Xt , double Yt ) {
  int n = Integer . parseInt ( input . nextLine ( ) ) ;
  Tuple [ ] p = new Tuple [ n + 2 ] ;
  p [ 0 ] = new Tuple ( Xs , Ys , 0 ) ;
  p [ 1 ] = new Tuple ( Xt , Yt , 0 ) ;
  for ( int i = 2 ;
  i < n + 2 ;
  i ++ ) {
    p [ i ] = new Tuple ( Integer . parseInt ( input . nextLine ( ) ) ) ;
  }
  double [ ] [ ] cost = new double [ n + 2 ] [ n + 2 ] ;
  for ( int i = 0 ;
  i < n + 2 ;
  i ++ ) {
    cost [ i ] [ j ] = cost [ j ] [ i ] = Math . max ( ( ( p [ i ] . x - p [ j ] . x ) * ( p [ i ] . x - p [ j ] . x ) + ( p [ i ] . y - p [ j ] . y ) * ( p [ i ] . y - p [ j ] . y ) ) * 0.5 - p [ i ] [ 2 ] - p [ j ] [ 2 ] ) ;
  }
  n += 2 ;
  int s = 0 ;
  double [ ] d = new double [ n ] ;
  boolean [ ] used = new boolean [ n ] ;
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
  System . out . println ( d [ 1 ] ) ;
  return cost ;
}
