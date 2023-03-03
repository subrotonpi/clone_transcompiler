static int howMany ( int M [ ] , int t ) {
  return t >= 0 ? Integer . numberOfTrailingZeros ( ( t / M ) + 1 ) : 0 ;
}
