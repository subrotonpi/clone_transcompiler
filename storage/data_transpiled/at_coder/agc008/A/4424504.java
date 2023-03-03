static final double INF = Double . MAX_VALUE ;
final double MOD = 10 * 9 + 7 ;
{
  int [ ] LI = new int [ ] {
    Integer . MAX_VALUE , Integer . MIN_VALUE }
    ;
    int [ ] LI_ = new int [ ] {
      Integer . MAX_VALUE - 1 , Integer . MIN_VALUE }
      ;
      int [ ] LS = new int [ ] {
        Integer . MAX_VALUE , Integer . MIN_VALUE }
        ;
        int [ ] II = new int [ ] {
          Integer . MIN_VALUE , Integer . MIN_VALUE }
          ;
          int [ ] SI = new int [ ] {
            Integer . MIN_VALUE , Integer . MIN_VALUE }
            ;
            {
              int [ ] x = LI ;
              int [ ] y = LI_ ;
              int cnt ;
              if ( Math . abs ( x ) <= Math . abs ( y ) ) {
                cnt = Math . abs ( y ) - Math . abs ( x ) ;
                if ( x >= 0 ) {
                  if ( y < 0 ) {
                    cnt ++ ;
                  }
                }
                else {
                  if ( y >= 0 ) {
                    cnt ++ ;
                  }
                  else {
                    cnt += 2 ;
                  }
                }
              }
            }
          }
          