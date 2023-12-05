, L = Integer . numberOfTrailingZeros ( Integer . lowestOneBit ( L ) ) ) ;
int s = 0 ;
for ( int b : B ) {
  s ^= b ;
}
if ( s != 0 ) {
  System . out . println ( - 1 ) ;
  exit ( 0 ) ;
}
