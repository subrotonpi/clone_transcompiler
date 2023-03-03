static final String [ ] getGeneratorsUpToLengthN ( int n ) throws IOException {
  List < Integer > generators = new ArrayList < > ( ) ;
  for ( int ii = 1 ;
  ii <= n ;
  ii ++ ) {
    generators . addAll ( getGeneratorsLengthN ( ii ) ) ;
  }
  return generators . toArray ( new Integer [ generators . size ( ) ] ) ;
}
