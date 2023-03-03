static final int solve ( int [ ] a , int L ) {
  final Scanner input = new Scanner ( System . in ) ;
  final int [ ] aux = new int [ L ] ;
  Arrays . sort ( a ) ;
  for ( int i = 0 ;
  i < L ;
  i ++ ) {
    aux [ i ] = input . nextInt ( ) ;
  }
  return Arrays . binarySearch ( aux , 0 , L ) + Arrays . binarySearch ( aux , L , 2 ) * 2 ;
}
