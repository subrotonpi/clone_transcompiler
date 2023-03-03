static final Scanner getScanner ( ) {
  final int N = Integer . parseInt ( input . nextLine ( ) ) ;
  final int M = Integer . parseInt ( input . nextLine ( ) ) ;
  final int P = Integer . parseInt ( input . nextLine ( ) ) ;
  final int Q = Integer . parseInt ( input . nextLine ( ) ) ;
  final int R = Integer . parseInt ( input . nextLine ( ) ) ;
  final int [ ] [ ] happy = new int [ M ] [ N ] ;
  for ( int x = 0 ;
  x < N ;
  x ++ ) {
    happy [ x ] [ y ] = x ;
  }
  for ( int x = 0 ;
  x < N ;
  x ++ ) {
    happy [ x ] [ y ] = R ;
  }
  int ans = 0 ;
  for ( int [ ] girls : combinations ( N , P ) ) {
    final int [ ] h = new int [ M ] ;
    for ( int g : girls ) {
      for ( int m = 0 ;
      m < M ;
      m ++ ) {
        h [ m ] += happy [ g ] [ m ] ;
      }
    }
    int v = Arrays . binarySearch ( h , h , - Q ) ;
    if ( ans < v ) {
      ans = v ;
    }
  }
  System . out . println ( ans ) ;
  return new Scanner ( ) ;
}
