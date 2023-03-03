public static int solve ( int m , int p ) {
  int i ;
  int t ;
  int H [ ] = new int [ N ] ;
  int i ;
  int r = 0 ;
  int [ ] C = new int [ p + 1 ] ;
  for ( i = 0 ;
  i < N ;
  i ++ ) {
    if ( H [ i ] > 0 ) break ;
  }
  if ( i < p && H [ i ] - P <= 0 ) {
    C = Arrays . copyOf ( C , i + 1 ) ;
  }
  for ( i = 0 ;
  i < C . length ;
  i ++ ) {
    if ( C [ i ] == N || H [ i ] > 0 ) {
      t = m ;
      if ( C [ i ] < N ) {
        H [ i ] -= P ;
        if ( H [ i ] <= 0 ) t += G [ C [ i ] ] ;
      }
      int j = 0 ;
      while ( j < N ) {
        if ( H [ j ] > 0 ) break ;
        j ++ ;
      }
      if ( j < N ) H [ j ] -= Q ;
      r = Math . max ( r , solve ( t , C [ i ] ) ) ;
      if ( j < N ) H [ j ] += Q ;
      if ( i < N ) H [ i ] += P ;
    }
  }
  return r ;
  for ( int test = 0 ;
  test < input . nextInt ( ) ;
  test ++ ) {
    P = Integer . parseInt ( input . nextLine ( ) ) ;
    Q = Integer . parseInt ( input . nextLine ( ) ) ;
    N = Integer . parseInt ( input . nextLine ( ) ) ;
    H = new int [ N ] , G = new int [ N ] ;
    for ( i = 0 ;
    i < N ;
    i ++ ) {
      int h = Integer . parseInt ( input . nextLine ( ) ) ;
      int g = Integer . parseInt ( input . nextLine ( ) ) ;
      H [ i ] = h ;
      G [ i ] = g ;
    }
    System . out . println ( "Case #" + ( test + 1 ) + ": " + solve ( 0 , 0 ) ) ;
  }
  return 0 ;
}
