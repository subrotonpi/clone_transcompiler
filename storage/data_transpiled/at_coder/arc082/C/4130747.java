public static void main ( String [ ] args ) {
  int N = Integer . parseInt ( input . nextLine ( ) ) ;
  List < List < Integer >> points = new ArrayList < > ( ) ;
  for ( int i = 0 ;
  i < N ;
  i ++ ) {
    points . add ( Collections . singletonList ( Integer . parseInt ( input . nextLine ( ) ) ) ) ;
  }
  int [ ] x = points . toArray ( new int [ N ] ) ;
  int [ ] y = points . toArray ( new int [ N ] ) ;
  final int M = 998244353 ;
  int c = 1 + N + N * ( N - 1 ) / 2 ;
  for ( int i = 0 ;
  i < N ;
  i ++ ) {
    int xi = x [ i ] ;
    int yi = y [ i ] ;
    int [ ] dx = new int [ N ] ;
    int [ ] dy = new int [ N ] ;
    int [ ] dx = new int [ N ] ;
    int [ ] dy = new int [ N ] ;
    int [ ] dx = new int [ N ] ;
    int [ ] dy = new int [ N ] ;
    int [ ] dy = new int [ N ] ;
    int [ ] dx = new int [ N ] ;
    int [ ] dy = new int [ N ] ;
    int [ ] dy = new int [ N ] ;
    for ( int j = 0 ;
    j < N ;
    j ++ ) {
      dx [ j ] = x [ j ] - xi ;
      dy [ j ] = y [ j ] - yi ;
    }
    for ( int j = i + 1 ;
    j < N ;
    j ++ ) {
      int xj = dx [ j ] ;
      int yj = dy [ j ] ;
      int cc = 1 ;
      for ( int k = j + 1 ;
      k < N ;
      k ++ ) {
        if ( xj * dy [ k ] - dx [ k ] * yj == 0 ) {
          cc *= 2 ;
          cc %= M ;
        }
      }
      c += cc - 1 ;
    }
  }
  int r = 1 ;
  for ( int i = 0 ;
  i < N ;
  i ++ ) {
    r *= 2 ;
    r %= M ;
  }
  r -= c ;
  r %= M ;
  System . out . println ( r ) ;
}
