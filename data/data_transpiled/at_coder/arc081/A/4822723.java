public static int [ ] getN ( ) {
  int [ ] A = new int [ N ] ;
  for ( int a = 0 ;
  a < N ;
  a ++ ) {
    A [ a ] = Integer . parseInt ( input . nextLine ( ) ) ;
  }
  HashMap < Integer , Integer > map = new HashMap < > ( ) ;
  for ( int a = 0 ;
  a < A . length ;
  a ++ ) {
    map . put ( A [ a ] , map . getOrDefault ( a , 0 ) + 1 ) ;
  }
  int [ ] B = new int [ ] {
    0 , 0 }
    ;
    for ( int k = 0 ;
    k < B . length ;
    k ++ ) {
      if ( map . get ( k ) >= 4 ) {
        B [ k ] = 1 ;
        B [ k ] = 2 ;
      }
      else if ( map . get ( k ) >= 2 ) {
        B [ k ] = 2 ;
      }
    }
    Arrays . sort ( B ) ;
    System . out . println ( B [ B . length - 1 ] * B [ B . length - 2 ] ) ;
    return B ;
  }
  