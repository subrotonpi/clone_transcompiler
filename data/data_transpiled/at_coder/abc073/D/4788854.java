static int [ ] [ ] solve ( ) {
  final Scanner input = new Scanner ( System . in ) ;
  final int N = input . nextInt ( ) ;
  final int M = input . nextInt ( ) ;
  final int R = input . nextInt ( ) ;
  final List < Integer > r = Lists . newArrayList ( ) ;
  for ( int i = 0 ;
  i < N ;
  i ++ ) {
    r . add ( i ) ;
  }
  final int INF = 10 * 9 ;
  final int [ ] [ ] A = new int [ N ] [ M ] ;
  for ( int i = 0 ;
  i < N ;
  i ++ ) {
    A [ i ] [ 0 ] = INF ;
    for ( int j = 0 ;
    j < M ;
    j ++ ) {
      A [ i ] [ j ] = i ;
    }
    for ( int j = 0 ;
    j < M ;
    j ++ ) {
      int a = input . nextInt ( ) ;
      int b = input . nextInt ( ) ;
      int c = input . nextInt ( ) ;
      A [ a - 1 ] [ b - 1 ] = c ;
      A [ b - 1 ] [ a - 1 ] = c ;
    }
    final int [ ] [ ] D = new int [ N ] [ M ] ;
    for ( int j = 0 ;
    j < N ;
    j ++ ) {
      A [ j ] [ j ] = A [ j ] [ j ] ;
    }
    final int [ ] [ ] G = floydWarshall ( D ) ;
    int ans = INF ;
    for ( int [ ] root : r ) {
      int cur = 0 ;
      for ( int i = 0 ;
      i < R - 1 ;
      i ++ ) {
        int s = root [ i ] - 1 , g = root [ i + 1 ] - 1 ;
        cur += G [ s ] [ g ] ;
      }
      ans = Math . min ( ans , cur ) ;
    }
  }
  if ( __name__ . equals ( "solve" ) ) {
    System . out . println ( main ( ) ) ;
  }
  return new int [ ] [ ] {
  }
  ;
}
