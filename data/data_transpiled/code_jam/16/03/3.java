static private final List < List < Integer >> read ( Reader reader , String d ) throws IOException {
  final List < Integer > result = new ArrayList < > ( ) ;
  int n = reader . nextInt ( ) ;
  if ( n < 2 ) {
    return result ;
  }
  final int [ ] s = new int [ 3 ] ;
  for ( int i = 0 ;
  i < s . length ;
  i ++ ) {
    s [ i ] = reader . nextInt ( ) ;
  }
  int root = n * .5 ;
  for ( int x = 0 ;
  x < s . length ;
  x ++ ) {
    if ( x == 0 ) continue ;
    if ( x > root ) break ;
    s [ ( x * x - 3 ) / 2 ] = 0 ;
  }
  final File fi = new File ( d ) ;
  final File fo = new File ( fi , "out" ) ;
  final int T = readInt ( fi ) ;
  for ( int i = 0 ;
  i < T ;
  i ++ ) {
    final List < Integer > res = solver ( fi ) ;
    writeCase ( fo , i , res ) ;
  }
  final int PRIMES = reader . nextInt ( 2 * 16 ) ;
  return result ;
}
