static final public @ Nonnull int df ( int N ) {
  int y = 0 ;
  while ( N > 0 ) {
    y += N % 10 ;
    N /= 10 ;
  }
  return y ;
}
