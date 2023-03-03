@ VisibleForTesting static void heapify ( ) {
  int N = Integer . parseInt ( input . nextLine ( ) ) ;
  P = new int [ N ] ;
  for ( int i = 0 ;
  i < N ;
  i ++ ) {
    int x = Integer . parseInt ( input . nextLine ( ) ) ;
    int y = Integer . parseInt ( input . nextLine ( ) ) ;
    P [ i ] = x < y ? P [ i ] : new int [ ] {
      x , y }
      : new int [ ] {
        x }
        ;
      }
      int [ ] X = new int [ N ] ;
      int [ ] Y = new int [ N ] ;
      for ( int i = 0 ;
      i < N ;
      i ++ ) {
        X [ i ] = X [ i ] ;
        Y [ i ] = Y [ i ] ;
      }
      int MIN = min ( X ) ;
      int MAX = max ( Y ) ;
      int res = ( MAX - MIN ) ;
      int base = max ( Y ) ;
      int r = max ( X ) ;
      while ( P . length -- > 0 ) {
        int x = max ( X ) ;
        int y = max ( Y ) ;
        res = Math . min ( res , base * ( r - x ) ) ;
        if ( y != - 1 ) {
          P [ i ] = y ;
          r = max ( r , y ) ;
        }
        else {
          break ;
        }
      }
      System . out . println ( res ) ;
    }
    