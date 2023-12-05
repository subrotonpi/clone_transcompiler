static int [ ] findsol ( String S ) throws IOException {
  final int N = 0 ;
  char s = '+' ;
  for ( int ii = S . length ( ) - 2 ;
  ii >= 0 ;
  -- ii ) {
    if ( ( S . charAt ( ii ) != s ) && ( S . charAt ( ii ) != ' ' ) ) {
      s = S . charAt ( ii ) ;
      N ++ ;
    }
  }
  return N ;
}
