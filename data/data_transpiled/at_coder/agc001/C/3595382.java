@ VisibleForTesting static void f ( final int s ) {
  int n = ( Integer ) input . nextInt ( ) , k = ( Integer ) input . nextInt ( ) ;
  int [ ] [ ] b = new int [ n - 1 ] [ n ] ;
  for ( int i = 0 ;
  i < n ;
  i ++ ) b [ i ] [ 0 ] = Integer . parseInt ( input . nextLine ( ) ) ;
  int [ ] x = new int [ n ] [ n ] , d = new int [ n ] , ans = 0 , c = 0 ;
  for ( int i = 0 ;
  i < b . length ;
  i ++ ) {
    x [ i ] [ 0 ] = b [ i ] [ 0 ] ;
    x [ i ] [ 1 ] = b [ i ] [ 1 ] ;
  }
  new Thread ( ) {
    @ Override public void run ( ) {
      for ( int i = 0 ;
      i < n ;
      i ++ ) {
        Queue < Point > q = new LinkedList < Point > ( ) , v = new ArrayList < Point > ( 1 ) ;
        v . set ( i ) ;
        for ( int j = 0 ;
        j < x [ i ] [ 0 ] ;
        j ++ ) {
          q . add ( new Point ( j , 1 , j ) ) ;
          d [ i ] [ j ] = b [ i ] [ j ] ;
          v . set ( j ) ;
        }
        while ( q . size ( ) > 0 ) {
          Point p = q . poll ( ) ;
          if ( p . y < s ) {
            for ( int j : x [ p . x [ 0 ] ] ) {
              if ( v . get ( j ) ) {
                q . add ( new Point ( j , p . y + 1 , p . z ) ) ;
                d [ i ] [ j ] = b [ i ] [ j ] ;
                v . set ( j ) ;
              }
            }
          }
        }
      }
    }
  }
  . start ( ) ;
  if ( k > n / 2 ) {
    for ( int i : x ) c = Math . max ( i , c ) ;
  }
  if ( n - c + 1 <= k ) ans = 0 ;
  else if ( k == 1 ) ans = n - 2 ;
  else {
    f ( k / 2 ) ;
    if ( k % 2 != 0 ) {
      for ( int i = 0 ;
      i < b . length ;
      i ++ ) ans = Math . min ( ans , n - d [ i ] . length - d [ j ] . length + d