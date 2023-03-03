static Set < Integer > sizes = new HashSet < > ( ) {
  private int [ ] [ ] splits ;
  for ( int a = 1 ;
  a <= 17 ;
  a ++ ) {
    for ( int b = 1 ;
    b <= 17 ;
    b ++ ) {
      if ( a * b <= 16 ) {
        sizes . add ( new Integer [ ] {
          a , b }
          ) ;
        }
      }
    }
    Map < Integer , List < Integer >> answers = new HashMap < > ( ) ;
    final Scanner scanner = new Scanner ( System . in ) ;
    final int w = scanner . nextInt ( ) ;
    final int h = scanner . nextInt ( ) ;
    List < Integer > result ;
    int [ ] d = new int [ w * 2 + h * 2 ] ;
    int [ ] e = new int [ w * 2 + h * 2 ] ;
    for ( int i = 0 ;
    i < w * 2 + h * 2 ;
    i ++ ) {
      int pos ;
      int dir ;
      if ( scanner . hasNext ( ) ) {
        pos = new int [ ] {
          0 , i }
          ;
          dir = new int [ ] {
            1 , 0 }
            ;
          }
          else if ( scanner . hasNext ( ) ) {
            pos = new int [ ] {
              i - w , w - 1 }
              ;
              dir = new int [ ] {
                0 , - 1 }
                ;
              }
              else if ( scanner . hasNext ( ) ) {
                pos = new int [ ] {
                  h - 1 , w - 1 - ( i - w - h ) }
                  ;
                  dir = new int [ ] {
                    - 1 , 0 }
                    ;
                  }
                  else {
                    pos = new int [ ] {
                      ( w * 2 + h * 2 ) - 1 - i , 0 }
                      ;
                      dir = new int [ ] {
                        0 , 1 }
                        ;
                      }
                      d [ i ] = new int [ ] {
                        pos , dir }
                        ;
                        e [ ( pos [ 0 ] - dir [ 0 ] ) + ( pos [ 1 ] - dir [ 1 ] ) ] = i ;
                      }
                      List < Integer > L = new ArrayList < > ( ) ;
                      for ( int i = 0 ;
                      i < w * 2 + h * 2 ;
                      i ++ ) {
                        int [ ] pos = d [ i ] ;
                        int [ ] dir = new int [ ] {
                          Integer . parseInt ( scanner . next ( ) ) }
                          ;
                          for ( int i = 1 ;
                          i <= cases ;
                          i ++ ) {
                            int h = scanner . nextInt ( ) ;
                            w = scanner . nextInt ( ) ;
                            result = scanner . next ( ) ;
                          }
                          L