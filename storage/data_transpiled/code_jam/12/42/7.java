static final String getTestName ( ) throws IOException {
  if ( __name__ == "__main__" ) {
    BufferedReader br = new BufferedReader ( new InputStreamReader ( System . in ) ) ;
    if ( args . length >= 2 ) {
      String fn = args [ 1 ] ;
      if ( fn != null ) {
        br = new BufferedReader ( new FileReader ( fn ) ) ;
      }
    }
    int t = Integer . parseInt ( br . readLine ( ) ) ;
    for ( int _t = xrange ( t ) ;
    _t < t ;
    ++ _t ) {
      int n = Integer . parseInt ( br . readLine ( ) ) ;
      int w = Integer . parseInt ( br . readLine ( ) ) ;
      int l = Integer . parseInt ( br . readLine ( ) ) ;
      int [ ] students = ArrayUtil . toIntArray ( br . readLine ( ) . split ( " " ) ) ;
      assert students . length == n ;
      students = Arrays . copyOf ( students , n ) ;
      int [ ] indexes = Arrays . copyOf ( students , n ) ;
      int [ ] positions = new int [ n ] ;
      for ( int i = xrange ( 0 , n ) ;
      i < students . length ;
      ++ i ) {
        boolean found = false ;
        for ( int j = xrange ( - 1 , i ) ;
        j < students [ i ] ;
        ++ j ) {
          int x ;
          if ( j == - 1 ) x = 0 ;
          else x = positions [ j ] [ 0 ] + students [ i ] + students [ j ] ;
          if ( x > w ) continue ;
          for ( int k = xrange ( - 1 , i ) ;
          k < students [ i ] ;
          ++ k ) {
            int y ;
            if ( k == - 1 ) y = 0 ;
            else y = positions [ k ] [ 1 ] + students [ i ] + students [ k ] ;
            if ( y > l ) continue ;
            boolean good = true ;
            for ( int h = xrange ( 0 , i ) ;
            h < students [ i ] ;
            ++ h ) {
              int _x = positions [ h ] ;
              int _y = positions [ h ] ;
              if ( ( x - _x ) * ( x - _x ) + ( y - _y ) * ( y - _y ) ) < ( students [ h ] + students [ i ] ) * ( y - _y ) ;
            }
            if ( good ) {
              positions [ i ] = new int [ ] {
                x , y }
                ;
                found = true ;
                break ;
              }
            }
            if ( found == true ) break ;
          }
        }
        assert found ;
      }
      