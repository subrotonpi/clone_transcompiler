static final int [ ] solve ( int k , int n , int [ ] a , int [ ] d , int y ) {
  final int X_MAX = 10 * 20 ;
  {
    int r = k ;
    for ( int i = 0 ;
    i < n ;
    i ++ ) {
      if ( a [ i ] < y ) {
        r -= ( y - a [ i ] + d [ i ] - 1 ) / d [ i ] ;
        if ( r < 0 ) {
          return r ;
        }
      }
    }
    return r ;
  }
  {
    int ok = 1 ;
    int ng = X_MAX ;
    while ( ok + 1 < ng ) {
      int mid = ( ok + ng ) / 2 ;
      if ( calc ( k , n , a , d , mid ) < 0 ) {
        ng = mid ;
      }
      else {
        ok = mid ;
      }
    }
    int ans = 0 ;
    int r = k ;
    List < Integer > list = new ArrayList < Integer > ( ) ;
    for ( int i = 0 ;
    i < n ;
    i ++ ) {
      if ( a [ i ] < ok ) {
        int x = ( ok - a [ i ] + d [ i ] - 1 ) / d [ i ] ;
        ans += a [ i ] * x + d [ i ] * x * ( x - 1 ) / 2 ;
        r -= x ;
        list . add ( new Integer ( a [ i ] + d [ i ] * x ) ) ;
      }
      else {
        list . add ( new Integer ( a [ i ] ) ) ;
      }
    }
    Collections . sort ( list ) ;
    while ( 0 < r ) {
      int y = list . remove ( 0 ) ;
      int i = list . remove ( 1 ) ;
      ans += y ;
      r -- ;
      int v = ( y + d [ i ] ) ;
      list . add ( binarySearch ( list , v ) ) ;
    }
    return ans ;
  }
  {
    int k = input . nextInt ( ) ;
    k = Integer . parseInt ( k ) ;
    int n = input . nextInt ( ) ;
    int [ ] a = new int [ n ] ;
    int [ ] d = new int [ n ] ;
    for ( int i = 0 ;
    i < n ;
    i ++ ) {
      int ai = input . nextInt ( ) ;
      int di = input . nextInt ( ) ;
      ai = Integer . parseInt ( ai ) ;
      di = Integer . parseInt ( di ) ;
      a [ i ] = ai ;
      d [ i ] = di ;
    }
    System . out . println ( solve ( k , n ,