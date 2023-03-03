public static int N ( ) {
  int T = Integer . parseInt ( input . nextLine ( ) ) ;
  int [ ] t = new int [ N ] ;
  for ( int i = 0 ;
  i < N ;
  i ++ ) t [ i ] = Integer . parseInt ( input . nextLine ( ) ) ;
  int res = 0 ;
  for ( int i = 0 ;
  i < N - 1 ;
  i ++ ) res += Math . max ( 0 , T - ( t [ i + 1 ] - t [ i ] ) ) ;
  System . out . println ( N * T - res ) ;
  return res ;
}
