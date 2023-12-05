static final Queue < int [ ] > queue = new ArrayDeque < int [ ] > ( ) {
  @ Override public int [ ] [ ] consume ( String input ) {
    int h = Integer . parseInt ( input ) ;
    int w = Integer . parseInt ( input ) ;
    List < String > s = new ArrayList < String > ( ) ;
    for ( int i = 0 ;
    i < h ;
    i ++ ) s . add ( new LinkedList < String > ( ) ) ;
    Queue < Integer > q = new ArrayDeque < Integer > ( ) ;
    int [ ] [ ] ma = new int [ h ] [ w ] ;
    for ( int i = 0 ;
    i < h ;
    i ++ ) ma [ i ] = new int [ w ] ;
    int [ ] [ ] dyx = {
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
            int white = 0 ;
            int black = 0 ;
            for ( int i = 0 ;
            i < h ;
            i ++ ) white += s . get ( i ) . length ( ) ;
            black = h * w - white ;
            q . add ( ma ) ;
            s . set ( 0 , 0 ) ;
            s . set ( 0 , 0 ) ;
            s . set ( 0 , 0 ) ;
            boolean flag = true ;
            while ( flag ) {
              Queue < Integer [ ] > newq = new Queue < Integer [ ] > ( ) ;
              while ( ! q . isEmpty ( ) ) {
                int y = q . poll ( ) ;
                for ( int i = 0 ;
                i < h ;
                i ++ ) {
                  int x = dyx [ i ] ;
                  if ( 0 <= x ) {
                    newq . add ( y + dy ) ;
                  }
                }
              }
            }
            return ma ;
          }
        }
        