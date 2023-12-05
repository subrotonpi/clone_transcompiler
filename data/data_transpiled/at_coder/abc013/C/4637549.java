public static int N ( ) {
  int N = Integer . parseInt ( input . nextLine ( ) ) ;
  int H = Integer . parseInt ( input . nextLine ( ) ) ;
  int A = Integer . parseInt ( input . nextLine ( ) ) ;
  int B = Integer . parseInt ( input . nextLine ( ) ) ;
  int C = Integer . parseInt ( input . nextLine ( ) ) ;
  int D = Integer . parseInt ( input . nextLine ( ) ) ;
  int E = Integer . parseInt ( input . nextLine ( ) ) ;
  int ans = C * N ;
  for ( int i = 0 ;
  i < N + 1 ;
  i ++ ) {
    int j = Math . max ( ( E * ( N - i ) - B * i - H ) / ( D + E ) + 1 , 0 ) ;
    ans = Math . min ( ans , A * i + C * j ) ;
  }
  System . out . println ( ans ) ;
  return N ;
}
