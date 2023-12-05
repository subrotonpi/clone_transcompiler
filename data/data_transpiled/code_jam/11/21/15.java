public static void readAllLines ( InputStream is ) throws IOException {
  BufferedReader br = new BufferedReader ( new InputStreamReader ( is ) ) ;
  int n = Integer . parseInt ( br . readLine ( ) ) ;
  int testCase = 1 ;
  String line ;
  while ( ( line = br . readLine ( ) ) != null ) {
    n = Integer . parseInt ( line ) ;
    int [ ] [ ] l = new int [ n ] [ n ] ;
    String [ ] tab = new String [ n ] [ n ] ;
    float [ ] wp = new float [ n ] ;
    float [ ] owp = new float [ n ] ;
    float [ ] oowp = new float [ n ] ;
    for ( int x = 0 ;
    x < n ;
    x ++ ) {
      line = br . readLine ( ) . trim ( ) ;
      tab [ x ] = line ;
      l [ x ] = new float [ ] {
        0.0f , 0.0f , 0.0f }
        ;
        for ( int i = 0 ;
        i < line . length ( ) ;
        i ++ ) {
          if ( line . charAt ( i ) == '1' ) {
            l [ l [ l [ x ] . length - 1 ] ++ ] = 1 ;
            l [ l [ x ] . length - 1 ] ++ ] = 1 ;
          }
          if ( line . charAt ( i ) == '0' ) {
            l [ l [ l [ l [ x ] . length - 1 ] ++ ] = 1 ;
            l [ l [ l [ l [ x ] . length - 1 ] . length - 1 ] ++ ] = 1 ;
          }
        }
        wp [ x ] = l [ l [ l [ x ] . length - 1 ] / l [ l [ l [ x ] . length - 1 ] . length - 1 ] ;
      }
      for ( int x = 0 ;
      x < n ;
      x ++ ) {
        float total = 0.0f ;
        int div = 0 ;
        for ( int y = 0 ;
        y < n ;
        y ++ ) {
          if ( tab [ x ] . charAt ( y ) == '.' || x == y ) continue ;
          div ++ ;
          float won = 0.0f ;
          float games = 0.0f ;
          for ( int z = 0 ;
          z < n ;
          z ++ ) {
            if ( z == x ) continue ;
            if ( tab [ y ] . charAt ( z ) != '.' ) games ++ ;
            if ( tab [ y ] . charAt ( z ) == '1' ) won ++ ;
          }
          total += ( won / games ) ;
        }
        owp [ x ] = total / div ;
      }
      for ( int