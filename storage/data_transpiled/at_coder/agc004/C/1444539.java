static final String [ ] [ ] read ( InputStream in ) throws IOException {
  BufferedReader reader = new BufferedReader ( new InputStreamReader ( in ) ) ;
  String nextLine = reader . readLine ( ) ;
  int H = Integer . parseInt ( nextLine ) ;
  int W = Integer . parseInt ( nextLine ) ;
  char [ ] [ ] red = new char [ H ] [ W ] , blue = new char [ H ] [ W ] ;
  StringBuilder rBuilder = new StringBuilder ( ) , bBuilder = new StringBuilder ( ) ;
  StringBuilder rBuilder = new StringBuilder ( ) , bBuilder = new StringBuilder ( ) ;
  for ( ;
  ( nextLine = reader . readLine ( ) ) != null ;
  ) {
    rBuilder . append ( new char [ ] {
      '#' , '.' }
      ) ;
      rBuilder . append ( new char [ ] {
        '#' , '.' }
        ) ;
        bBuilder . append ( new char [ ] {
          '.' , '.' }
          ) ;
          bBuilder . append ( new char [ ] {
            '.' , '#' }
            ) ;
          }
          if ( H % 2 != 0 ) {
            rBuilder . append ( new char [ ] {
              '#' , '.' }
              ) ;
              bBuilder . append ( new char [ ] {
                '.' , '#' }
                ) ;
              }
              for ( int y = 0 ;
              y < H ;
              y ++ ) {
                for ( int x = 0 ;
                x < nextLine . length ( ) ;
                x ++ ) {
                  if ( nextLine . charAt ( x ) == '#' ) {
                    if ( red [ y ] [ x ] == '.' ) red [ y ] [ x ] = '#' ;
                    else blue [ y ] [ x ] = '#' ;
                  }
                }
              }
              StringBuilder join = new StringBuilder ( ) ;
              for ( char [ ] line : red ) {
                System . out . println ( join . toString ( ) ) ;
              }
              System . out . println ( ) ;
              for ( char [ ] line : blue ) {
                System . out . println ( join . toString ( ) ) ;
              }
              return red ;
            }
            