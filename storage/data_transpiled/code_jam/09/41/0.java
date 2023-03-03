static final Scanner stdin = new Scanner ( System . in ) {
  @ Override public void close ( ) throws IOException {
    BufferedReader stdin = new BufferedReader ( new InputStreamReader ( System . in ) ) ;
    int T = Integer . parseInt ( stdin . readLine ( ) ) ;
    for ( int cs = 1 ;
    cs <= T ;
    cs ++ ) {
      int N = Integer . parseInt ( stdin . readLine ( ) ) ;
      int [ ] rows = new int [ N ] ;
      for ( int each = 0 ;
      each < N ;
      each ++ ) {
        String s = stdin . readLine ( ) ;
        assert s . length ( ) == N ;
        int num = 0 ;
        for ( int i = 0 ;
        i < s . length ( ) ;
        i ++ ) {
          if ( s . charAt ( i ) == '1' ) num = i ;
        }
        rows [ each ] = num ;
      }
      int ans = 0 ;
      for ( int i = 0 ;
      i < N ;
      i ++ ) {
        int j = i ;
        while ( j < N && rows [ j ] > i ) j ++ ;
        assert j < N ;
        for ( int k = i ;
        k < j ;
        k ++ ) {
          rows [ k + 1 ] = rows [ k ] ;
          ans ++ ;
        }
      }
      System . out . println ( "Case #" + cs + ": " + ans ) ;
    }
  }
}
