static final int [ ] [ ] getNegativeInstances ( ) {
  final int [ ] [ ] A = new int [ 6 ] [ 3 ] ;
  final int [ ] [ ] B = new int [ 6 ] [ 3 ] ;
  final int [ ] [ ] C = new int [ 6 ] [ 3 ] ;
  final int [ ] [ ] D = new int [ 6 ] [ 3 ] ;
  for ( int a = 0 ;
  a < A . length ;
  a ++ ) {
    for ( int b = 0 ;
    b < B . length ;
    b ++ ) {
      for ( int c = 0 ;
      c < C . length ;
      c ++ ) {
        if ( new Integer [ ] {
          A [ a ] [ b ] [ c ] [ c ] [ D ] }
          ) {
            System . out . println ( A [ a ] [ b ] [ c ] [ D ] + "=7" ) ;
            System . exit ( 0 ) ;
          }
        }
      }
    }
    return A ;
  }
  