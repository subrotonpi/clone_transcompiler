static final String print ( ) {
  final int inf = 10 * 20 ;
  final int mod = 10 * 9 + 7 ;
  {
    final int [ ] [ ] li = new int [ ] [ ] {
      {
        Integer . parseInt ( input ) }
        , {
          Integer . parseInt ( input ) }
          , {
            Integer . parseInt ( input ) }
            , {
              Integer . parseInt ( input ) }
              , {
                Integer . parseInt ( input ) }
                , {
                  Integer . parseInt ( input ) }
                  , {
                    Integer . parseInt ( input ) }
                    , {
                      Integer . parseInt ( input ) }
                      , {
                        Integer . parseInt ( input ) }
                        , {
                          Integer . parseInt ( input ) }
                          , {
                            Integer . parseInt ( input ) }
                            , {
                              Integer . parseInt ( input ) }
                              , {
                                Integer . parseInt ( input ) }
                                , {
                                  Integer . parseInt ( input ) }
                                  , {
                                    Integer . parseInt ( input ) }
                                    , {
                                      Integer . parseInt ( input ) }
                                      , {
                                        Integer . parseInt ( input ) }
                                        , {
                                          Integer . parseInt ( input ) }
                                          , {
                                            Integer . parseInt ( input ) }
                                            , {
                                              Integer . parseInt ( input ) }
                                              , {
                                                Integer . parseInt ( input ) }
                                                , {
                                                  Integer . parseInt ( input ) }
                                                  , {
                                                    Integer . parseInt ( input ) }
                                                  }
                                                  ;
                                                }
                                                System . out . println ( Main . class . getName ( ) ) ;
                                                final int n = li [ 0 ] . intValue ( ) ;
                                                final int l = li [ 0 ] . intValue ( ) ;
                                                final int [ ] [ ] a = new int [ n ] [ n ] ;
                                                for ( int i = 0 ;
                                                i < n ;
                                                i ++ ) {
                                                  final int x = li [ i ] . intValue ( ) ;
                                                  final char d = ls [ i ] . charAt ( 0 ) ;
                                                  if ( d == 'L' ) {
                                                    a [ i ] [ 0 ] = 1 ;
                                                  }
                                                  else {
                                                    a [ i ] [ 0 ] = 2 ;
                                                  }
                                                  int r = 0 ;
                                                  int i = 0 ;
                                                  while ( i < n && a [ i ] [ 1 ] == 1 ) {
                                                    r += a [ i ] [ 0 ] - i - 1 ;
                                                    i ++ ;
                                                  }
                                                  int j = n - 1 ;
                                                  while ( j > - 1 && a [ j ] [ 1 ] == 2 ) {
                                                    r += l - a [ j ] [ 0 ] - ( n - 1 - j ) ;
                                                    j -- ;
                                                  }
                                                  if ( i > j ) {
                                                    return r ;
                                                  }
                                                  int k = i ;
                                                  while ( k <= j ) {
                                                    final int rk = k ;
                                                    while ( a [