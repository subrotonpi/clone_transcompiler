public static void main ( String input ) {
  int h = Integer . parseInt ( input ) ;
  int w = Integer . parseInt ( input ) ;
  List < List < Integer >> s = new ArrayList < > ( ) ;
  for ( int i = 0 ;
  i < h ;
  i ++ ) s . add ( Collections . singletonList ( Integer . parseInt ( input ) ) ) ;
  boolean p = true ;
  int [ ] q = {
    0 , 0 }
    ;
    List < int [ ] > d = new ArrayList < > ( ) ;
    for ( int i = 0 ;
    i < h ;
    i ++ ) {
      for ( int j = ( w - 1 ) * ( i % 2 ) ;
      j <= ( i % 2 == 1 ? - 1 : w ) ;
      j += ( i % 2 == 1 ? - 1 : 1 ) ) {
        if ( p ) {
          if ( s . get ( i ) . get ( j ) % 2 == 1 ) {
            q = new int [ ] {
              i , j }
              ;
              p = false ;
            }
          }
          else {
            d . add ( new int [ ] {
              q [ 0 ] + 1 , q [ 1 ] + 1 , i + 1 , j + 1 }
              ) ;
              q = new int [ ] {
                i , j }
                ;
                if ( s . get ( i ) . get ( j ) % 2 == 1 ) {
                  p = true ;
                }
              }
            }
          }
          System . out . println ( d . size ( ) ) ;
          for ( int [ ] i : d ) {
            System . out . println ( i [ 0 ] + " " + i [ 1 ] + " " + i [ 2 ] + " " + i [ 3 ] ) ;
          }
        }
        