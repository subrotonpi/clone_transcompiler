static final Scanner getScanner ( ) {
  final Scanner input = new Scanner ( System . in ) ;
  final int N = Integer . parseInt ( input . nextLine ( ) ) ;
  final int M = Integer . parseInt ( input . nextLine ( ) ) ;
  final int [ ] disk = new int [ M ] ;
  for ( int i = 0 ;
  i < M ;
  i ++ ) {
    disk [ i ] = Integer . parseInt ( input . nextLine ( ) ) ;
  }
  final int [ ] ans = new int [ N + 1 ] ;
  for ( int i = 0 ;
  i < N + 1 ;
  i ++ ) {
    ans [ i ] = i ;
  }
  for ( int x : disk ) {
    int pos = 0 ;
    for ( int i = 0 ;
    i < N + 1 ;
    i ++ ) {
      if ( ans [ i ] == x ) {
        pos = i ;
      }
    }
    ans [ 0 ] = ans [ pos ] ;
  }
  for ( int i = 1 ;
  i <= N ;
  i ++ ) {
    System . out . println ( ans [ i ] ) ;
  }
  return new Scanner ( System . in ) ;
}
