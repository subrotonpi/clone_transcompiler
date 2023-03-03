public static void main ( String input ) {
  int h = Integer . parseInt ( input ) ;
  int w = Integer . parseInt ( input ) ;
  List < Integer > s = new ArrayList < > ( ) ;
  for ( int i = 0 ;
  i < h ;
  i ++ ) s . add ( Integer . parseInt ( input ) ) ;
  boolean p = true ;
  int [ ] q = {
    0 , 0 }
    ;
    List < int [ ] > d = new ArrayList < > ( ) ;
    for ( int i = 0 ;
    i < h ;
    i ++ ) {
      if ( i % 2 == 0 ) {
        for ( int j = 0 ;
        j < w ;
        j ++ ) {
          if ( p ) {
            if ( s . get ( i ) . get ( j ) % 2 == 1 ) {
              q = {
                i , j }
                ;
                p = false ;
              }
            }
            else {
              d . add ( new int [ ] {
                q [ 0 ] + 1 , q [ 1 ] + 1 , i + 1 , j + 1 }
                ) ;
                q = {
                  i , j }
                  ;
                  if ( s . get ( i ) . get ( j ) % 2 == 1 ) {
                    p = true ;
                  }
                }
              }
            }
            else {
              for ( int j = w - 1 ;
              j >= 0 ;
              j -- ) {
                if ( p ) {
                  if ( s . get ( i ) . get ( j ) % 2 == 1 ) {
                    q = {
                      i , j }
                      ;
                      p = false ;
                    }
                  }
                  else {
                    d . add ( new int [ ] {
                      q [ 0 ] + 1 , q [ 1 ] + 1 , i + 1 , j + 1 }
                      ) ;
                      q = {
                        i , j }
                        ;
                        if ( s . get ( i ) . get ( j ) % 2 == 1 ) {
                          p = true ;
                        }
                      }
                    }
                  }
                }
                System . out . println ( d . size ( ) ) ;
                for ( int [ ] i : d ) {
                  System . out . println ( i [ 0 ] + " " + i [ 1 ] + " " + i [ 2 ] + " " + i [ 3 ] ) ;
                }
              }
              