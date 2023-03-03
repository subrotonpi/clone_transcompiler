public static int T = Integer . parseInt ( readLine ( ) ) {
  for ( int t = 0 ;
  t < T ;
  t ++ ) {
    int N = Integer . parseInt ( readLine ( ) ) ;
    int L = Integer . parseInt ( readLine ( ) ) ;
    int H = Integer . parseInt ( readLine ( ) ) ;
    int [ ] notes = ArrayUtil . fromIntArray ( readLine ( ) ) ;
    boolean ffound = false ;
    for ( int l = L ;
    l <= H ;
    l ++ ) {
      if ( Stream . of ( notes ) . anyMatch ( x -> x == l || Math . max ( x , l ) % Math . min ( x , l ) == 0 ) ) {
        ffound = l ;
        break ;
      }
    }
    System . out . println ( "Case #" + ( t + 1 ) + ": " + ( ffound ? "NO" : "NO" ) ) ;
  }
  return T ;
}
