@ VisibleForTesting static void heapSort ( ) {
  int T = Integer . parseInt ( input . nextLine ( ) ) ;
  for ( int j = 0 ;
  j < T ;
  j ++ ) {
    int H = Integer . parseInt ( input . nextLine ( ) ) ;
    int N = Integer . parseInt ( input . nextLine ( ) ) ;
    int M = Integer . parseInt ( input . nextLine ( ) ) ;
    int [ ] [ ] fh = new int [ N ] [ M ] ;
    int [ ] [ ] ch = new int [ N ] [ M ] ;
    int [ ] dirs = {
      new int [ ] {
        1 , 0 }
        , new int [ ] {
          - 1 , 0 }
          , new int [ ] {
            0 , 1 }
            , new int [ ] {
              0 , - 1 }
            }
            ;
            for ( int i = 0 ;
            i < N ;
            i ++ ) ch [ i ] [ N ] = Integer . parseInt ( input . nextLine ( ) ) ;
            for ( int i = 0 ;
            i < N ;
            i ++ ) fh [ i ] [ N ] = Integer . parseInt ( input . nextLine ( ) ) ;
            Heap heap = new Heap ( 0.0 , ( long ) 0 ) ;
            int [ ] [ ] done = new int [ M ] [ N ] ;
            for ( int i = 0 ;
            i < M ;
            i ++ ) {
              heap . add ( new Double ( 0.0 ) ) ;
            }
            while ( heap . size ( ) > 0 ) {
              final long t = heap . get ( ) ;
              if ( ( t == ( N - 1 ) ) || ( t == ( M - 1 ) ) ) {
                ans = t ;
                break ;
              }
              if ( done [ t ] [ t ] ) continue ;
              done [ t ] [ t ] = 1 ;
              for ( int i = 0 ;
              i < dirs . length ;
              i ++ ) {
                int dx = dirs [ i ] ;
                int ny = dirs [ i ] ;
                int nx = x + dx ;
                int ny = y + dy ;
                if ( ! ( ( 0 <= nx && nx < N ) ) ) continue ;
                int ceil = ch [ nx ] [ ny ] ;
                int flor = fh [ nx ] [ ny ] ;
                if ( ( ( ceil < flor + 50 ) || ( ch [ x ] [ y ] < flor + 50 ) || ( ceil < fh [ x ] [ y ] + 50 ) ) ) continue ;
                int st = Math . max ( t , ( H - ceil + 50 ) / 10 ) ;
                int dt