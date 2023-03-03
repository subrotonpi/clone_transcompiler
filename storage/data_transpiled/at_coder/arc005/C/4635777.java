static final int [ ] [ ] getRoots ( ) {
  final int height = Integer . parseInt ( System . console ( ) . readLine ( ) ) ;
  final int width = Integer . parseInt ( System . console ( ) . readLine ( ) ) ;
  final int [ ] [ ] nesw = {
    {
      0 , 1 }
      , {
        0 , - 1 }
        , {
          1 , 0 }
          , {
            - 1 , 0 }
          }
          ;
          final char [ ] [ ] root = new char [ height ] [ width ] ;
          int start_x = - 1 , start_y = - 1 , end_x = - 1 , end_y = - 1 ;
          for ( int h = 0 ;
          h < height ;
          h ++ ) {
            final char [ ] temp = System . console ( ) . readLine ( ) . toCharArray ( ) ;
            root [ h ] [ w ] = new char [ width ] ;
            for ( char n : temp ) {
              root [ h ] [ w ] = n ;
            }
          }
          for ( int h = 0 ;
          h < height ;
          h ++ ) {
            for ( int w = 0 ;
            w < width ;
            w ++ ) {
              switch ( root [ h ] [ w ] ) {
                case 's' : start_x = w ;
                start_y = h ;
                break ;
                case 'g' : end_x = w ;
                end_y = h ;
                break ;
              }
            }
          }
          final PriorityQueue < Integer > queue = new PriorityQueue < Integer > ( ) ;
          HeapWordSearch . search ( queue , new int [ ] {
            0 , start_x , start_y }
            ) ;
            final boolean [ ] [ ] visited = new boolean [ height ] [ width ] ;
            for ( int n = 0 ;
            n < width ;
            n ++ ) {
              for ( int m = 0 ;
              m < height ;
              m ++ ) {
                visited [ n ] [ m ] = true ;
              }
            }
            while ( queue . size ( ) > 0 ) {
              int point = queue . poll ( ) ;
              final int x = point ;
              final int y = point ;
              if ( visited [ y ] [ x ] ) {
                continue ;
              }
              visited [ y ] [ x ] = true ;
              if ( y == end_y && x == end_x ) {
                break ;
              }
              for ( int t : nesw ) {
                final int new_x = x + t [ 0 ] ;
                final int new_y = y + t [ 1 ] ;
                if ( 0 <= new_y && new_y < height && 0 <= new_x && ! visited [ new_y ] [ new_x ] ) {
                  final int temp @ @