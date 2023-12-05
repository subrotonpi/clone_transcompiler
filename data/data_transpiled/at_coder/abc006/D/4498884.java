static final int [ ] getBinaryArray ( ) {
  Scanner input = new Scanner ( System . in ) ;
  final int N = input . nextInt ( ) ;
  final int [ ] C = new int [ N ] ;
  for ( int i = 0 ;
  i < N ;
  i ++ ) C [ i ] = input . nextInt ( ) ;
  return C ;
}
