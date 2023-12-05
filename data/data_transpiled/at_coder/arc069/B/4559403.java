public static void print ( int n ) {
  String s = input . nextLine ( ) ;
  int len = s . length ( ) ;
  int [ ] circle ;
  boolean flag = false ;
  for ( int [ ] start : new int [ ] [ ] {
    {
      1 , 1 }
      , {
        1 , - 1 }
        , {
          - 1 , 1 }
          , {
            - 1 , - 1 }
          }
          ) {
            int [ ] circle = start . clone ( ) ;
            for ( int i = 1 ;
            i < n - 1 ;
            i ++ ) {
              circle [ i + 1 ] = circle [ i ] * s . charAt ( i ) * circle [ i - 1 ] ;
            }
            if ( circle [ circle . length - 2 ] == circle [ circle . length - 1 ] * s . charAt ( circle . length - 1 ) * circle [ 0 ] && circle [ circle . length - 1 ] == circle [ 0 ] * s . charAt ( 0 ) * circle [ 1 ] ) {
              flag = true ;
              break ;
            }
          }
          if ( flag ) {
            String ans = "" ;
            for ( int i = 0 ;
            i < circle . length ;
            i ++ ) {
              if ( circle [ i ] == 1 ) {
                ans += "S" ;
              }
              else {
                ans += "W" ;
              }
            }
            System . out . println ( ans ) ;
          }
          else {
            System . out . println ( - 1 ) ;
          }
        }
        