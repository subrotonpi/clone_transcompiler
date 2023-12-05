public static int dCandyDistribution ( int N , int M , int A ) {
  final int [ ] remainders = new int [ N ] ;
  for ( int t = 0 ;
  t < N ;
  t ++ ) {
    remainders [ t % M ] += 1 ;
  }
  return Arrays . stream ( remainders . values ( ) ) . mapToInt ( Integer :: valueOf ) . sum ( ) ;
}
