static final String solve ( int N , List < List < Customer >> customers ) throws IOException {
  final int [ ] [ ] malthash = new int [ N + 1 ] [ ] ;
  for ( Flavor flavor : xrange ( 0 , N + 1 ) ) {
    malthash [ flavor ] [ 0 ] = 0 ;
  }
  return solve ( N , customers ) ;
}
