@ VisibleForTesting static LinkedHashMap < Integer , Integer > input ( ) {
  final LinkedHashMap < Integer , Integer > map = new LinkedHashMap < > ( ) ;
  final int [ ] [ ] IL = new int [ ] [ ] {
    Collections . singletonList ( Integer . parseInt ( input . nextLine ( ) ) ) }
    ;
    final int [ ] SL = new int [ ] {
      Integer . parseInt ( input . nextLine ( ) ) }
      ;
      final int I = Integer . parseInt ( System . in . nextLine ( ) ) ;
      final int [ ] S = new int [ ] {
        Integer . parseInt ( input . nextLine ( ) ) }
        ;
        final int N = IL [ 0 ] ;
        final int G = IL [ 1 ] ;
        final int E = IL [ 2 ] ;
        final int [ ] P = IL [ 3 ] ;
        final int [ ] [ ] friends = new int [ E ] [ N + 1 ] ;
        for ( int i = 0 ;
        i < E ;
        i ++ ) {
          friends [ i ] = IL [ i ] ;
          friends [ i ] [ 0 ] = IL [ i ] ;
        }
        final int [ ] [ ] edge = new int [ N + 1 ] [ N + 1 ] ;
        for ( int i = 0 ;
        i < N + 1 ;
        i ++ ) {
          for ( int [ ] ab : friends ) {
            if ( ab [ 1 ] != 0 ) {
              edge [ ab [ 0 ] ] [ ab [ 1 ] ] = 1 ;
            }
            if ( ab [ 0 ] != 0 ) {
              edge [ ab [ 1 ] ] [ ab [ 0 ] ] = 1 ;
            }
          }
        }
        for ( int i = 0 ;
        i < P ;
        i ++ ) {
          edge [ i ] [ N ] = 1 ;
        }
        int count = 0 ;
        while ( true ) {
          final Queue < Integer > stack = new ArrayDeque < > ( ) ;
          final int [ ] used = new int [ N + 1 ] ;
          final int [ ] route = new int [ N + 1 ] ;
          int tmp = 0 ;
          while ( stack . size ( ) > 0 ) {
            tmp = stack . remove ( ) ;
            if ( tmp == N ) {
              break ;
            }
            for ( int i = 0 ;
            i < edge . length ;
            i ++ ) {
              if ( edge [ tmp ] [ i ] == 1 && used [ i ] == 0 ) {
                stack . add ( i ) ;
                route [ i ] = tmp ;
                used [ i ] = 1 ;
              }
            }
          }
          else {
            break ;
          }
          count ++ ;
          i = N ;
          