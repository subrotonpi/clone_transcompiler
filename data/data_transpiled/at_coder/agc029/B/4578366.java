static final int binum ( int num ) {
  int numberLen = Integer . numberOfTrailingZeros ( num ) - 2 ;
  int f = 2 * numberLen - 1 ;
  return ( num ^ f ) + 1 ;
}
