@ Sys public static void eachCase ( int J , int P , int S , int K ) {
  if ( S <= K ) {
    for ( int i : xrange ( J ) ) {
      for ( int j : xrange ( P ) ) {
        for ( int k : xrange ( S ) ) {
          System . out . println ( 1 + i + " " + 1 + j + " " + 1 + k ) ;
        }
      }
    }
  }
  else {
    for ( int i : xrange ( J ) ) {
      for ( int j : xrange ( P ) ) {
        for ( int k : xrange ( K ) ) {
          System . out . println ( 1 + i + " " + 1 + j + " " + 1 + ( ( i + j + k ) % S ) ) ;
        }
      }
    }
  }
  int T = Integer . parseInt ( System . console ( ) . readLine ( ) ) ;
  for ( int t : xrange ( 1 , T + 1 ) ) {
    int J = Integer . parseInt ( System . console ( ) . readLine ( ) ) ;
    int P = Integer . parseInt ( System . console ( ) . readLine ( ) ) ;
    int S = Integer . parseInt ( System . console ( ) . readLine ( ) ) ;
    int K = Integer . parseInt ( System . console ( ) . readLine ( ) ) ;
    System . out . println ( "Case #" + t + ": " + J * P * Math . min ( S , K ) ) ;
    eachCase ( J , P , S , K ) ;
  }
}
