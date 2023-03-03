public static int in ( String [ ] args ) throws IOException {
  BufferedReader br = new BufferedReader ( new InputStreamReader ( System . in ) ) ;
  String line ;
  int T = Integer . parseInt ( br . readLine ( ) . trim ( ) ) ;
  for ( int test = 0 ;
  test < T ;
  test ++ ) {
    int N = Integer . parseInt ( br . readLine ( ) . trim ( ) ) ;
    int [ ] v = new int [ N ] ;
    for ( int i = 0 ;
    i < N ;
    i ++ ) {
      line = br . readLine ( ) . trim ( ) ;
      int cur = 0 ;
      for ( int j = 0 ;
      j < line . length ( ) ;
      j ++ ) {
        if ( line . charAt ( j ) == '1' ) {
          cur = j + 1 ;
        }
      }
      v [ i ] = cur ;
    }
    int count = 0 ;
    for ( int i = 0 ;
    i < v . length - 1 ;
    i ++ ) {
      if ( v [ i ] > i + 1 ) {
        for ( int j = i + 1 ;
        j < v . length ;
        j ++ ) {
          if ( v [ j ] <= i + 1 ) {
            int aux = v [ j ] ;
            for ( int k = j ;
            k > i ;
            k -- ) {
              v [ k ] = v [ k - 1 ] ;
              count ++ ;
            }
            v [ i ] = aux ;
            break ;
          }
        }
      }
    }
    System . out . println ( "Case #" + ( test + 1 ) + ": " + count ) ;
  }
  return 0 ;
}
