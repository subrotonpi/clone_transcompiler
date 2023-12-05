static final int solve ( int N , int [ ] customer , int [ ] meltfavor ) throws IOException {
  final Scanner file = new Scanner ( System . in ) ;
  final int nc = Integer . parseInt ( file . nextLine ( ) ) ;
  int count = 1 ;
  while ( file . hasNextLine ( ) ) {
    final int [ ] N = new int [ nc ] ;
    for ( int i = 0 ;
    i < N ;
    i ++ ) {
      N [ i ] = customer [ i ] ;
    }
    if ( N [ i ] == 0 ) {
      out [ meltfavor [ i ] - 1 ] = 1 ;
    }
  }
  final int [ ] [ ] solve = new int [ N ] [ ] ;
  for ( int i = 0 ;
  i < N ;
  i ++ ) {
    out = new int [ N ] [ ] ;
    for ( int j = 0 ;
    j < N . length ;
    j ++ ) {
      out [ i ] = 0 ;
    }
    check ( out , customer , meltfavor ) ;
  }
  final int [ ] [ ] allco = new int [ N ] [ ] ;
  final int n = 0 ;
  final int a = 0 ;
  final int b = 0 ;
  final int c = 0 ;
  final int d = 0 ;
  final int x0 = 0 ;
  final int y0 = 0 ;
  final int m = 0 ;
  int total = 0 ;
  for ( int i = 0 ;
  i < n - 1 ;
  i ++ ) {
    x = ( a * x + b ) % m ;
    y = ( c * y + d ) % m ;
    out [ i ] = new int [ N [ i ] ] ;
    for ( int j = 0 ;
    j < i ;
    j ++ ) {
      if ( BigInteger . ZERO . compareTo ( out [ j ] [ 0 ] ) + out [ k ] [ 0 ] + out [ i ] [ i ] [ i ] - 1 ] . x == 0 && BigInteger . ZERO . compareTo ( out [ j ] [ 1 ] ) + out [ k ] [ 1 ] + out [ i ] [ i ] [ i ] - 1 ] . y == 0 ) {
        total ++ ;
      }
    }
  }
  return total ;
}
