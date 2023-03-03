static final String getBinaryString ( InputStream iStream ) throws IOException {
  final byte [ ] b = new byte [ 1 ] ;
  final Scanner s = new Scanner ( iStream ) ;
  int i ;
  int last = 0 ;
  for ( i = 0 ;
  i < b . length - 1 ;
  i ++ ) {
    b [ i ] = last + b [ i ] * ( b [ i + 1 ] - 1 ) ;
    last = b [ i + 1 ] ;
  }
  s . close ( ) ;
  return b ;
}
