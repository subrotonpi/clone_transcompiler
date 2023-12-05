public static int [ ] getHigherRange ( ) {
  int N = Integer . parseInt ( input . nextLine ( ) ) ;
  int [ ] H = new int [ N ] ;
  for ( int i = 0 ;
  i < N ;
  i ++ ) H [ i ] = Integer . parseInt ( input . nextLine ( ) ) ;
  int [ ] L = new int [ N ] ;
  int [ ] R = new int [ N ] ;
  for ( int i = 1 ;
  i < N ;
  i ++ ) L [ i ] = ( L [ i - 1 ] ) * ( H [ i - 1 ] < H [ i ] ? 1 : 0 ) + 1 ;
  for ( int i = N - 1 ;
  i >= 0 ;
  i -- ) R [ i ] = ( R [ i + 1 ] ) * ( H [ i ] > H [ i + 1 ] ? 1 : 0 ) + 1 ;
  int ans = 0 ;
  for ( int i = 0 ;
  i < N ;
  i ++ ) ans = Math . max ( ans , L [ i ] + R [ i ] ) ;
  System . out . println ( ans - 1 ) ;
  return L ;
}
