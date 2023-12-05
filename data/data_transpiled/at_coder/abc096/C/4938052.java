public static void main ( String [ ] args ) throws Exception {
  BufferedReader input = new BufferedReader ( new InputStreamReader ( System . in ) ) ;
  try {
    int H = Integer . parseInt ( input . readLine ( ) ) ;
    int W = Integer . parseInt ( input . readLine ( ) ) ;
    StringBuilder s = new StringBuilder ( ) ;
    for ( int i = 0 ;
    i < H ;
    i ++ ) s . append ( new StringBuilder ( input . readLine ( ) ) ) ;
    int [ ] [ ] dir4 = new int [ ] [ ] {
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
            for ( int i = 0 ;
            i < H ;
            i ++ ) for ( int j = 0 ;
            j < W ;
            j ++ ) {
              if ( s . substring ( i , j ) . equals ( "." ) ) continue ;
              int cnt = 0 ;
              for ( int [ ] d : dir4 ) {
                int nx = i + d [ 0 ] ;
                int ny = j + d [ 1 ] ;
                if ( ! ( 0 <= nx && nx < H ) ) continue ;
                if ( ! ( 0 <= ny && ny < W ) ) continue ;
                if ( s . substring ( nx , ny ) . equals ( "#" ) ) cnt ++ ;
              }
              if ( cnt == 0 ) {
                System . out . println ( "No" ) ;
                exit ( ) ;
              }
            }
            System . out . println ( "Yes" ) ;
          }
          finally {
            input = null ;
          }
          final String [ ] args = new String [ ] {
          }
          ;
          if ( args . length > 0 ) {
            args [ 0 ] = "-" ;
          }
          else {
            args [ 0 ] = "-" ;
          }
        }
        