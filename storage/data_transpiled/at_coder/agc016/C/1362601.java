public static void main ( String input , int h , int w , int hh , int ww ) {
  int [ ] area = {
    h * w , hh * ww }
    ;
    int m = ( h / hh ) * ( w / ww ) ;
    int a_inv = ( area [ 0 ] / m - area [ 1 ] ) ;
    if ( ( a_inv <= 0 ) || ( ( int ) a_inv < 0 ) ) {
      System . out . println ( "No" ) ;
    }
    else {
      System . out . println ( "Yes" ) ;
      int a = a_inv * - 1 ;
      if ( ( ( int ) a ) < a ) {
        a = Integer . MAX_VALUE + 1 ;
      }
      else {
        a = Integer . MIN_VALUE ;
      }
      int b = ( area [ 1 ] - 1 ) * a + 1 ;
      while ( ( b >= ( area [ 0 ] / m - 1 ) * a ) ) {
        a ++ ;
        b = ( area [ 1 ] - 1 ) * a + 1 ;
      }
      a = Integer . toString ( a ) ;
      b = Integer . toString ( - b ) ;
      for ( int i = 0 ;
      i < h ;
      i ++ ) {
        String [ ] ret = new String [ w ] ;
        for ( int j = 0 ;
        j < w ;
        j ++ ) {
          if ( ( ( i + 1 ) % hh ) == 0 && ( ( j + 1 ) % ww ) == 0 ) {
            ret [ j ] = b ;
          }
          else {
            ret [ j ] = a ;
          }
        }
        System . out . println ( Arrays . toString ( ret ) ) ;
      }
    }
  }
  