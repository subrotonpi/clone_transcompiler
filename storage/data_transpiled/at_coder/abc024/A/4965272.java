public static int zoo ( @ Nonnegative int A , @ Nonnegative int B , @ Nonnegative int C , @ Nonnegative int K , @ Nonnegative int S , @ Nonnegative int T ) {
  int total = A * S + B * T ;
  if ( S + T >= K ) {
    total -= C * ( S + T ) ;
  }
  return total ;
}
