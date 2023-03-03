public static int T = Integer . parseInt ( input ) {
  for ( int TT = 1 ;
  TT <= T ;
  TT ++ ) {
    int J = ( Integer . parseInt ( input . readLine ( ) ) ) ;
    int P = ( Integer . parseInt ( input . readLine ( ) ) ) ;
    int S = ( Integer . parseInt ( input . readLine ( ) ) ) ;
    int K = ( Integer . parseInt ( input . readLine ( ) ) ) ;
    int m = Math . min ( S , K ) ;
    int ans = J * P * m ;
    System . out . println ( "Case #" + TT + ": " + ans ) ;
    for ( int j = 0 ;
    j < J ;
    j ++ ) {
      for ( int p = 0 ;
      p < P ;
      p ++ ) {
        for ( int s = 0 ;
        s < m ;
        s ++ ) {
          int t = ( j + p + s ) % S ;
          System . out . println ( j + 1 + " " + p + 1 + " " + t + 1 ) ;
        }
      }
    }
  }
  return T ;
}
