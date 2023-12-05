public static int F ( int X , int D , int N ) {
  int Z = N > 0 && F ( ( X * D + X ) % M , D * D % M , N / 2 ) ;
  return [ Z , Z * D + X ] [ N % 2 ] ;
}
