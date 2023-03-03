public static int [ ] [ ] a ( String input ) {
  int [ ] [ ] a1 = {
    {
      a [ 0 ] , 0 , 0 }
      , {
        a [ 1 ] , 1 , 0 }
        , {
          a [ 2 ] , 0 , 1 }
          , {
            a [ 3 ] , 1 , 1 }
          }
          ;
          Arrays . sort ( a1 ) ;
          if ( a1 [ 0 ] [ 2 ] == a1 [ 3 ] [ 2 ] ) {
            System . out . println ( a1 [ 2 ] [ 0 ] - a1 [ 1 ] [ 0 ] ) ;
          }
          else if ( a1 [ 0 ] [ 2 ] == a1 [ 2 ] [ 2 ] ) {
            System . out . println ( a1 [ 2 ] [ 0 ] - a1 [ 1 ] [ 0 ] ) ;
          }
          else {
            System . out . println ( 0 ) ;
          }
          return a1 ;
        }
        