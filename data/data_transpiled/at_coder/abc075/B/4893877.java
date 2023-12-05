public static void print ( String input ) {
  int h = Integer . parseInt ( input ) ;
  int w = Integer . parseInt ( input ) ;
  int [ ] [ ] glid = new int [ h + 2 ] [ w + 1 ] ;
  int [ ] hIndex = {
    - 1 , - 1 , - 1 , 0 , 0 , 1 , 1 , 1 }
    ;
    int [ ] wIndex = {
      - 1 , 0 , 1 , - 1 , 1 , - 1 , 0 , 1 }
      ;
      glid [ 0 ] = new int [ w + 2 ] ;
      glid [ h + 1 ] = new int [ w + 2 ] ;
      for ( int i = 0 ;
      i < h ;
      i ++ ) {
        int [ ] temp1 = new int [ w + 2 ] ;
        int [ ] temp2 = new int [ w + 2 ] ;
        for ( int j = 0 ;
        j < w ;
        j ++ ) temp1 [ j ] = 0 ;
        int [ ] temp2 = new int [ w + 2 ] ;
        for ( int j = 0 ;
        j < w ;
        j ++ ) temp2 [ j ] = input . charAt ( j ) ;
        temp1 [ h + 1 ] = temp2 [ j ] ;
        temp1 [ h + 1 ] = 0 ;
        glid [ h + 1 ] = temp1 ;
      }
      for ( int j = 0 ;
      j < h ;
      j ++ ) {
        for ( int k = 0 ;
        k < w ;
        k ++ ) {
          if ( glid [ j + 1 ] [ k + 1 ] == "#" ) continue ;
          else {
            int cnt = 0 ;
            for ( int n = 0 ;
            n < 8 ;
            n ++ ) {
              if ( glid [ j + 1 + hIndex [ n ] ] [ k + 1 + wIndex [ n ] ] == "#" ) cnt ++ ;
            }
            glid [ j + 1 ] [ k + 1 ] = Integer . toString ( cnt ) ;
          }
        }
      }
      for ( int hPrint = 0 ;
      hPrint < h ;
      hPrint ++ ) {
        for ( int wPrint = 0 ;
        wPrint < w ;
        wPrint ++ ) {
          System . out . print ( glid [ hPrint + 1 ] [ wPrint + 1 ] ) ;
        }
        System . out . println ( ) ;
      }
    }
    