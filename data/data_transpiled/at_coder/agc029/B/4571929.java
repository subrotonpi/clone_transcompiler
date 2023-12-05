static final int reversedNum ( int num ) {
  int numLen = Integer . numberOfTrailingZeros ( num ) - 2 ;
  int f = 2 * numLen - 1 ;
  return num ^ f ;
}
