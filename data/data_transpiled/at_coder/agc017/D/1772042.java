static final int [ ] [ ] solve ( ) {
  final int N = Integer . parseInt ( input ( ) ) ;
  final Map < Integer , Integer > graph = new TreeMap < > ( ) ;
  for ( int i = 0 ;
  i < N - 1 ;
  i ++ ) {
    final int a = Integer . parseInt ( input ( ) . substring ( i , i + 1 ) ) ;
    final int b = Integer . parseInt ( input ( ) . substring ( i , i + 1 ) ) ;
    graph . put ( a , b ) ;
    graph . put ( b , a ) ;
  }
  return new int [ ] [ ] {
    {
      INF , INF }
      , {
        INF , INF }
        , {
          INF , INF }
          , {
            INF , INF }
            , {
              INF , INF }
              , {
                INF , INF }
                , {
                  INF , INF }
                  , {
                    INF , INF }
                    , {
                      INF }
                      , {
                        INF , INF }
                        , {
                          INF }
                          , {
                            INF }
                            , {
                              INF }
                              , {
                                INF }
                                , {
                                  INF }
                                  , {
                                    INF }
                                    , {
                                      INF }
                                      , {
                                        INF }
                                        , {
                                          INF }
                                          , {
                                            INF }
                                          }
                                          ;
                                          /* We can find the first N in the graph */
                                          final int [ ] [ ] grundy = {
                                            null }
                                            ;
                                            /* We can find the first N in the graph */
                                            for ( int i = 0 ;
                                            i < N ;
                                            i ++ ) {
                                              final int a = graph [ i ] [ 0 ] ;
                                              final int b = graph [ i ] [ 1 ] ;
                                              graph [ i ] [ 0 ] = b ;
                                              graph [ i ] [ 1 ] = a ;
                                            }
                                            /* We can find the first N in the graph */
                                            for ( int i = 0 ;
                                            i < N ;
                                            i ++ ) {
                                              final int a = graph [ i ] [ 0 ] ;
                                              final int b = graph [ i ] [ 1 ] ;
                                              graph [ i ] [ 0 ] = a ;
                                              graph [ i ] [ 1 ] = b ;
                                              graph [ i ] [ 2 ] = a ;
                                            }
                                            System . out . println ( solve ( N , graph ) ? "Alice" : "Bob" ) ;
                                          }
                                          