public static int simulate ( int N ) {
  for ( int A : As ) {
    N -= N % A ;
  }
  return N ;
}
