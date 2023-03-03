@ Sys public static void Solve ( int J , int P , int S , int K ) {
  int T = Integer . parseInt ( System . console ( ) . readLine ( ) ) ;
  System . out . println ( J * P * K ) ;
  for ( int j = 0 ;
  j < J ;
  j ++ ) {
    for ( int p = 0 ;
    p < P ;
    p ++ ) {
      for ( int k = 0 ;
      k < K ;
      k ++ ) {
        System . out . println ( j + 1 + " " + p + 1 + " " + ( ( j + p + k ) % S ) + 1 ) ;
      }
      System . out . println ( ) ;
    }
  }
  System . out . println ( ) ;
  for ( int T = 0 ;
  T < Integer . parseInt ( System . console ( ) . readLine ( ) ) ;
  T ++ ) {
    J = Integer . parseInt ( System . console ( ) . readLine ( ) ) ;
    P = Integer . parseInt ( System . console ( ) . readLine ( ) ) ;
    S = Integer . parseInt ( System . console ( ) . readLine ( ) ) ;
    K = Integer . parseInt ( System . console ( ) . readLine ( ) ) ;
    System . out . println ( "Case #" + ( T + 1 ) + ":" ) ;
    Solve ( J , P , S , K ) ;
  }
}
