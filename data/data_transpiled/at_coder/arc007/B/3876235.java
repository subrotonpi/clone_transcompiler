public static void main ( String input ) {
  int N = Integer . parseInt ( input ) ;
  int M = Integer . parseInt ( input ) ;
  int [ ] disk = new int [ M ] ;
  for ( int i = 0 ;
  i < M ;
  i ++ ) {
    disk [ i ] = Integer . parseInt ( input ) ;
  }
  int [ ] ans = new int [ N + 1 ] ;
  for ( int i = 0 ;
  i < N ;
  i ++ ) {
    ans [ i ] = i ;
  }
  for ( int d : disk ) {
    for ( int i = 0 ;
    i < N + 1 && ans [ i ] == d ;
    i ++ ) {
      if ( ans [ i ] == d ) {
        ans [ 0 ] = ans [ i ] ;
        ans [ i ] = ans [ 0 ] ;
      }
    }
  }
  for ( int x : ans [ 1 ] ) {
    System . out . println ( x ) ;
  }
}
