static final String getInput ( ) {
  Scanner input = new Scanner ( System . in ) ;
  int N = Integer . parseInt ( input . nextLine ( ) ) ;
  Pair [ ] L = new Pair [ N ] ;
  for ( int i = 0 ;
  i < N ;
  i ++ ) {
    int w = ( Integer . parseInt ( input . nextLine ( ) ) ) ;
    int h = input . nextInt ( ) ;
    L [ i ] = new Pair ( w , - h ) ;
  }
  Arrays . sort ( L ) ;
  final int [ ] LIS = new int [ N ] ;
  for ( int i = 1 ;
  i < N ;
  i ++ ) LIS [ i ] = LIS [ i ] ;
  return LIS ;
}
