static final String getInput ( ) {
  final double INF = Double . MAX_VALUE ;
  final double MOD = 10 * 9 + 7 ;
  /* LI */
  final int [ ] LI = new int [ ] {
    Integer . parseInt ( System . getProperty ( "line.separator" ) ) }
    ;
    /* LI_ */
    final int [ ] LI_ = new int [ ] {
      Integer . parseInt ( System . getProperty ( "line.separator" ) ) - 1 }
      ;
      /* LF */
      final double [ ] LF = new double [ ] {
        Double . parseDouble ( System . getProperty ( "line.separator" ) ) }
        ;
        /* LS */
        final int [ ] LS = new int [ ] {
          Integer . parseInt ( System . getProperty ( "line.separator" ) ) }
          ;
          /* II */
          final int [ ] II = new int [ ] {
            Integer . parseInt ( System . getProperty ( "line.separator" ) ) }
            ;
            /* SI */
            final Scanner scanner = new Scanner ( System . in ) ;
            int n = scanner . nextInt ( ) ;
            final int k = scanner . nextInt ( ) ;
            final int A = LI_ [ n ] ;
            final int [ ] D = new int [ n ] ;
            for ( int i = 1 ;
            i < n ;
            i ++ ) {
              D [ A [ i ] ] = i ;
            }
            int res = A [ 0 ] == 0 ? 0 : 1 ;
            /* DFS */
            int h = 0 ;
            for ( int to : D [ v ] ) {
              h = Math . max ( h , DFS ( to , v ) ) ;
            }
            if ( h == k - 1 && par != 0 ) {
              res ++ ;
              h = - 1 ;
            }
            return res ;
          }
          