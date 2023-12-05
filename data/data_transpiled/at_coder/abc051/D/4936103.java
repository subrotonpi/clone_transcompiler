public static int N ( Scanner input ) {
  int M = input . nextInt ( ) ;
  int [ ] A = new int [ M ] ;
  int [ ] B = new int [ M ] ;
  int [ ] C = new int [ M ] ;
  for ( int i = 0 ;
  i < M ;
  i ++ ) {
    int a = input . nextInt ( ) ;
    int b = input . nextInt ( ) ;
    int c = input . nextInt ( ) ;
    A [ i ] = a - 1 ;
    B [ i ] = b - 1 ;
    C [ i ] = c ;
  }
  final int INF = 10 * 9 ;
  int [ ] [ ] dist = new int [ N ] [ N ] ;
  for ( int j = 0 ;
  j < N ;
  j ++ ) {
    dist [ N ] [ j ] = i != j ? INF : 0 ;
  }
  for ( int i = 0 ;
  i < M ;
  i ++ ) {
    dist [ N ] [ i ] = dist [ N ] [ B [ i ] ] ;
    dist [ N ] [ B [ i ] ] = dist [ N ] [ C [ i ] ] ;
  }
  for ( int k = 0 ;
  k < N ;
  k ++ ) {
    for ( int i = 0 ;
    i < N ;
    i ++ ) {
      for ( int j = 0 ;
      j < N ;
      j ++ ) {
        dist [ i ] [ j ] = Math . min ( dist [ i ] [ j ] , dist [ i ] [ k ] + dist [ k ] [ j ] ) ;
      }
    }
  }
  int ans = M ;
  for ( int i = 0 ;
  i < M ;
  i ++ ) {
    for ( int j = 0 ;
    j < N ;
    j ++ ) {
      if ( dist [ j ] [ A [ i ] ] + C [ i ] == dist [ j ] [ B [ i ] ] ) {
        ans = ans - 1 ;
        break ;
      }
    }
  }
  System . out . println ( ans ) ;
  return ans ;
}
