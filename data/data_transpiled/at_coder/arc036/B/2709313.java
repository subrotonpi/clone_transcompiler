public static int [ ] getS ( ) {
  int N = Integer . parseInt ( input . nextLine ( ) ) ;
  int [ ] H = new int [ N ] ;
  for ( int i = 0 ;
  i < N ;
  i ++ ) {
    H [ i ] = Integer . parseInt ( input . nextLine ( ) ) ;
  }
  int [ ] U = new int [ N ] ;
  int [ ] S = new int [ N ] ;
  for ( int i = 1 ;
  i < N ;
  i ++ ) {
    U [ i ] = ( U [ i - 1 ] ) * ( H [ i - 1 ] < H [ i ] ? 1 : 0 ) + 1 ;
  }
  for ( int i = N - 1 ;
  i >= 0 ;
  i -- ) {
    S [ i ] = ( S [ i + 1 ] ) * ( H [ i ] > H [ i ] ? 1 : 0 ) + 1 ;
  }
  int ans = 0 ;
  for ( int i = 0 ;
  i < N ;
  i ++ ) {
    ans = Math . max ( ans , U [ i ] + S [ i ] ) ;
  }
  System . out . println ( ans - 1 ) ;
  return U ;
}
