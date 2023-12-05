@ VisibleForTesting static int from ( Scanner input ) {
  int N = input . nextInt ( ) ;
  int D = input . nextInt ( ) ;
  int X = input . nextInt ( ) ;
  int Y = input . nextInt ( ) ;
  if ( X % D != 0 || Y % D != 0 ) {
    System . out . println ( 0 ) ;
    exit ( ) ;
  }
  int y = 0 ;
  int a = Math . abs ( X / D ) ;
  int c = Math . abs ( Y / D ) ;
  int fct = factorial ( N ) ;
  if ( ( N - a - c ) % 2 != 0 ) {
    System . out . println ( 0 ) ;
    exit ( ) ;
  }
  int m = ( N - a ) / 2 ;
  for ( int b = 0 ;
  b < m ;
  b ++ ) {
    y += fct / ( factorial ( a + b ) * factorial ( b ) * factorial ( c + m - b ) * factorial ( m - b ) ) ;
  }
  int z = 4 * N ;
  System . out . println ( y / z ) ;
  return z ;
}
