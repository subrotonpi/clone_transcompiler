public static void main ( String input ) {
  int N = Integer . parseInt ( input ) ;
  int M = Integer . parseInt ( input ) ;
  List < Integer > A = new ArrayList < Integer > ( ) ;
  for ( int i = 0 ;
  i < M ;
  i ++ ) {
    A . add ( i ) ;
  }
  Collections . sort ( A , Collections . reverseOrder ( ) ) ;
  int V [ ] = {
    - 1 , 2 , 5 , 5 , 4 , 5 , 6 , 3 , 7 , 6 }
    ;
    int [ ] dp = new int [ N + 1 ] ;
    dp [ 0 ] = 0 ;
    for ( int i = 1 ;
    i <= N ;
    i ++ ) {
      int [ ] l = new int [ A . size ( ) ] ;
      for ( int j = 0 ;
      j < A . size ( ) ;
      j ++ ) {
        if ( A . get ( j ) >= 0 ) {
          l [ j ] = dp [ i - V [ j ] ] + 1 ;
        }
        if ( l [ j ] > 0 ) dp [ j ] = Math . max ( l [ j ] , 0 ) ;
      }
    }
    n = N ;
    while ( n > 0 ) {
      for ( int j = 0 ;
      j < A . size ( ) ;
      j ++ ) {
        if ( A . get ( j ) < 0 ) continue ;
        if ( dp [ n ] == dp [ n - V [ j ] ] + 1 ) {
          System . out . print ( A . get ( j ) ) ;
          n = n - V [ j ] ;
          break ;
        }
      }
    }
    System . out . println ( ) ;
  }
  