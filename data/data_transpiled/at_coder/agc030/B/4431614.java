public static int [ ] solve ( ) {
  int L = Integer . parseInt ( input . nextLine ( ) ) ;
  int N = Integer . parseInt ( input . nextLine ( ) ) ;
  int [ ] X = new int [ N ] ;
  int [ ] Y = new int [ N + 1 ] ;
  for ( int i = 0 ;
  i < N ;
  i ++ ) {
    X [ i ] = Integer . parseInt ( input . nextLine ( ) ) ;
  }
  for ( int i = 0 ;
  i < N ;
  i ++ ) {
    Y [ i + 1 ] = X [ i ] + Y [ i ] ;
  }
  int ans = max ( X [ N - 1 ] , L - X [ 0 ] ) ;
  for ( int i = 0 ;
  i < N - 1 ;
  i ++ ) {
    int P = i + 1 ;
    int Q = N - ( i + 1 ) ;
    if ( P < Q ) {
      ans = max ( ans , 2 * Y [ i + 1 ] + 2 * ( L * ( P + 1 ) - ( Y [ i + P + 2 ] - Y [ i + 1 ] ) ) - ( L - X [ i + 1 ] ) ) ;
    }
    else if ( P > Q ) {
      ans = max ( ans , 2 * ( Y [ i + 1 ] - Y [ i - Q ] ) - X [ i ] + 2 * ( L * Q - ( Y [ N ] - Y [ i + 1 ] ) ) - min ( X [ i ] , L - X [ i + 1 ] ) ) ;
    }
  }
  System . out . println ( ans ) ;
  return X ;
}
