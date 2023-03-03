static final String FILE_NAME_BASE = "B-large" ;
final int NUM_PROCESSES = 4 ;
{
  int low , high , test ;
  int mid ;
  int nxy ;
  int nreached ;
  int time ;
  int rt ;
  {
    low = low + high - 1 ;
    mid = ( low + high ) / 2 ;
    if ( test ( mid ) ) {
      if ( mid == low ) return low ;
      high = mid + 1 ;
    }
    else {
      synchronized ( ForkJoinPool . class ) {
        ForkJoinPool pool = ForkJoinPool . class . getPool ( NUM_PROCESSES ) ;
        results = new int [ numCases ] ;
        for ( int i = 0 ;
        i < numCases ;
        i ++ ) {
          results [ i ] = pool . submit ( new Solve ( ) , new Runnable ( ) {
            @ Override public void run ( ) {
              int water = 0 ;
              int rows = 0 ;
              int cols = 0 ;
              while ( reachAtLast [ i ] != nxy ) {
                nreached ++ ;
              }
            }
            int nreached = 0 ;
            if ( nreached == nreached ) {
              int oi = search ( 0 , reachAtLast . length , new Runnable ( ) {
                @ Override public void run ( ) {
                  int value = 0 ;
                  int nreached = 0 ;
                  while ( reachAtLast [ i ] != nreached ) {
                    int nreached ++ ;
                  }
                }
              }
              ) ;
            }
            int nreached = 0 ;
            if ( nreached == nreached ) {
              int oi = 0 ;
              int nreached = 0 ;
              while ( nreached == nreached ) {
                int value = ( int ) ( nreached - 1 ) ;
                int nreached = nreached ;
                if ( nreached == nreached ) {
                  int water = water - nreached ;
                  nreached = nreached ;
                }
              }
              int nreached = nreached - nreached ;
              if ( nreached == nreached ) {
                int water = nreached - nreached ;
                nreached = nreached ;
              }
              int nreached = nreached - nreached ;
              if ( nreached == nreached ) {
                int water = water - nreached ;
                nreached = nreached ;
              }
              int nreached = nreached - nreached ;
              if ( nreached == nreached ) {
                nreached = nreached ;
              }
              int water = nreached - nreached ;
              if ( water > 0 ) {
                water = water - nreached ;
                nreached = nreached ;
              }
            }
          }
        }
        ) ;
      }
    }
  }
  int newReached = 0 ;
  int nreached = 0 ;
  while ( nreached !=