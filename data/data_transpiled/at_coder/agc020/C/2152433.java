static int n ( int [ ] arr , int dp ) {
  for ( int a : arr ) dp |= dp << a ;
  int ofs = ( Integer . numberOfTrailingZeros ( arr [ ofs ] ) + 1 ) / 2 ;
  dp >>= ofs ;
  System . out . println ( ( dp & - dp ) . bitLength ( ) + ofs - 1 ) ;
  return dp ;
}
