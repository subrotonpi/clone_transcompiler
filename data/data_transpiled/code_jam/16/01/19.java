static int [ ] convertNums ( String s ) throws IOException {
  final int N ;
  int [ ] t = new int [ 10 ] ;
  while ( ( N > 0 ) && ( N < t . length ) ) {
    t [ N ] = N % 10 ;
    N = ( int ) ( ( N - t [ N - 1 ] ) / 10 ) ;
  }
  return t ;
}
