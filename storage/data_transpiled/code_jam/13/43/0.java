static final String solve ( ) throws Exception {
  if ( __name__ == "solve" ) {
    BufferedReader br = new BufferedReader ( new InputStreamReader ( System . in ) ) ;
    if ( args . length >= 2 ) {
      String fn = args [ 1 ] ;
      if ( fn != null ) {
        br = new BufferedReader ( new FileReader ( fn ) ) ;
      }
    }
    int T = Integer . parseInt ( br . readLine ( ) ) ;
    for ( int _T = xrange ( T ) ;
    _T < T ;
    _T ++ ) {
      int N = Integer . parseInt ( br . readLine ( ) ) ;
      int [ ] A = ArrayUtil . toIntArray ( br . readLine ( ) . split ( " " ) ) ;
      int [ ] B = ArrayUtil . toIntArray ( br . readLine ( ) . split ( " " ) ) ;
      assert A . length == N ;
      assert B . length == N : B . length ;
      boolean [ ] [ ] gt = new boolean [ N ] [ N ] ;
      for ( int i = 0 ;
      i < N ;
      i ++ ) {
        gt [ i ] [ i ] = false ;
      }
      for ( int i = xrange ( N ) ;
      i < N ;
      i ++ ) {
        for ( int j = xrange ( i + 1 , N ) ;
        j < N ;
        j ++ ) {
          if ( A [ i ] >= A [ j ] ) {
            gt [ i ] [ j ] = true ;
          }
        }
        for ( int j = xrange ( i - 1 , - 1 , - 1 ) ;
        j < N ;
        j ++ ) {
          if ( A [ j ] == A [ i ] - 1 ) {
            gt [ i ] [ j ] = true ;
            break ;
          }
        }
        for ( int j = xrange ( i ) ;
        j < N ;
        j ++ ) {
          if ( B [ i ] >= B [ j ] ) {
            gt [ i ] [ j ] = true ;
            break ;
          }
        }
        for ( int j = xrange ( i + 1 , N ) ;
        j < N ;
        j ++ ) {
          if ( B [ j ] == B [ i ] - 1 ) {
            gt [ i ] [ j ] = true ;
            break ;
          }
        }
      }
      int [ ] v = new int [ N ] ;
      int r = 0 ;
      while ( r < N ) {
        for ( int i = xrange ( N ) ;
        i < N ;
        i ++ ) {
          if ( v [ i ] == 0 && Arrays . equals ( gt [ i ] [ j ] , v [ j ] ) )