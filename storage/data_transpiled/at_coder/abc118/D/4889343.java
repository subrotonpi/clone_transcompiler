public static int [ ] [ ] getNegativeInstances ( ) {
  int n , m ;
  int [ ] [ ] a = new int [ 3 ] [ 3 ] ;
  for ( int i = 0 ;
  i < a . length ;
  i ++ ) {
    a [ i ] = Integer . parseInt ( input . nextLine ( ) ) ;
  }
  int [ ] [ ] set = {
    {
      1 , 2 }
      , {
        7 , 3 }
        , {
          4 , 4 }
          , {
            5 , 5 }
            , {
              3 , 5 }
              , {
                2 , 5 }
                , {
                  9 , 6 }
                  , {
                    6 , 6 }
                    , {
                      8 , 7 }
                    }
                    ;
                    Arrays . sort ( set ) ;
                    String ans_str = "" ;
                    for ( int i = 0 ;
                    i < a . length ;
                    i ++ ) {
                      if ( a [ i ] [ 0 ] == kouho [ i ] [ 0 ] ) {
                        kouho [ i ] = i ;
                      }
                    }
                    kouho = kouho [ 0 ] ;
                    Arrays . sort ( kouho ) ;
                    System . out . println ( ans_str . length ( ) - 1 ) ;
                    int kouho [ ] = {
                      inc1 }
                      ;
                      for ( int i = 0 ;
                      i < kouho . length ;
                      i ++ ) {
                        if ( a [ i ] [ 0 ] == kouho [ i ] [ 1 ] ) {
                          kouho [ i ] = i ;
                        }
                      }
                      kouho = kouho [ 0 ] ;
                      for ( int i = 0 ;
                      i < kouho . length ;
                      i ++ ) {
                        if ( kouho [ i ] [ 0 ] == kouho [ i ] [ 0 ] ) {
                          kouho [ i ] = i ;
                        }
                      }
                      kouho = kouho [ 0 ] ;
                      for ( int i = 0 ;
                      i < kouho . length ;
                      i ++ ) {
                        kouho [ i ] = kouho [ i ] ;
                      }
                      int max_honsu = Math . max ( kouho [ 0 ] [ 1 ] , 0 ) ;
                      m -- ;
                      int max_keta = 0 ;
                      ans_kouho = new int [ max_honsu ] ;
                      for ( int i = 0 ;
                      i < kouho . length ;
                      i ++ ) {
                        int keta_tmp = n / kouho [ i ] [ 1 ] ;
                        int num_tmp = kouho [ i ] ;
                        int amari_tmp = n % keta_tmp ;
                        int