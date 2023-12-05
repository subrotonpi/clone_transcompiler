static final String FILE_NAME = "C-small-attempt0" ;
final String INPUT_FILE = FILE_NAME + ".in" ;
final String OUTPUT_FILE = FILE_NAME + ".out" ;
{
  int [ ] A = new int [ n ] ;
  int [ ] S = new int [ n ] ;
  for ( int i = 0 ;
  i < n ;
  i ++ ) {
    A [ i ] = 0 ;
    S [ i ] = 0 ;
  }
  for ( int i = 0 ;
  i < n ;
  i ++ ) {
    A [ i ] = ( int ) B [ i % m ] ;
    B [ i % m ] = ( X * B [ i % m ] + Y * ( i + 1 ) ) % Z ;
  }
  for ( int i = 0 ;
  i < n ;
  i ++ ) {
    S [ i ] = 1 ;
    for ( int j = 0 ;
    j < i ;
    j ++ ) {
      if ( A [ j ] < A [ i ] ) {
        S [ i ] = S [ i ] + S [ j ] ;
      }
    }
  }
  System . out . println ( "Case #" + testCase + ": " + Arrays . toString ( S ) % 1000000007 ) ;
}
