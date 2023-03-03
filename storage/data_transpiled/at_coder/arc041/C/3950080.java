static final double [ ] [ ] getProbabilities ( ) {
  final double INF = Double . MAX_VALUE ;
  final double MOD = 10 * 9 + 7 ;
  {
    final int [ ] li = new int [ ] {
      Integer . MAX_VALUE }
      ;
    }
    final int [ ] LS = new int [ ] {
      System . console ( ) . readLine ( ) . split ( " " ) }
      ;
      {
        final int [ ] I = new int [ ] {
          Integer . MAX_VALUE }
          ;
          {
            final int [ ] S = new int [ ] {
              input . readLine ( ) . split ( " " ) }
              ;
            }
          }
          final int n = li [ 0 ] ;
          final int l = li [ 1 ] ;
          final List < Integer > rabbit = new ArrayList < > ( ) ;
          for ( int i = 0 ;
          i < n ;
          i ++ ) {
            for ( int j = 0 ;
            j < i ;
            j ++ ) {
              final int x = ( i + 1 ) ;
              final int d = ( i + 2 ) ;
              rabbit . add ( new Integer [ ] {
                ( Integer . MAX_VALUE - x ) , d == 'L' ? 0 : 1 }
                ) ;
              }
              final int [ ] [ ] rabbit = rabbit . toArray ( new Integer [ ] [ ] {
                {
                  l + 1 , 1 }
                  , {
                    l + 2 , 0 }
                    , {
                      l + 3 , 1 }
                    }
                    ) ;
                    int state = 0 ;
                    int left = 1 ;
                    final List < Integer > rabbitL = new ArrayList < > ( ) ;
                    final List < Integer > rabbitR = new ArrayList < > ( ) ;
                    int ans = 0 ;
                    for ( int i = 0 ;
                    i < n + 3 ;
                    i ++ ) {
                      final int x = rabbit . get ( i ) ;
                      final int d = rabbit . get ( i ) ;
                      if ( state == 0 ) {
                        if ( d == 0 ) {
                          ans += x - left ;
                          left ++ ;
                        }
                        else {
                          rabbitR . add ( x ) ;
                          state = 1 ;
                        }
                      }
                      else if ( state == 1 ) {
                        if ( d == 1 ) {
                          rabbitR . add ( x ) ;
                        }
                        else {
                          rabbitL . add ( x ) ;
                          state = 2 ;
                        }
                      }
                      else {
                        if ( d == 0 ) {
                          rabbitL . add ( x ) ;
                        }
                        else {
                          final int numOfRabbitR = rabbitR . size ( ) ;
                          final int numOfRabbitL = rabbitL . size ( ) ;
                          final int