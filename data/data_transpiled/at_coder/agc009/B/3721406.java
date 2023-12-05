static final String getStdOut ( ) {
  final Scanner input = new Scanner ( System . in ) ;
  final int N = input . nextInt ( ) ;
  final List = new ArrayList < Integer > ( N ) ;
  for ( int i = 0 ;
  i < N ;
  i ++ ) {
    final int a = input . nextInt ( ) ;
    List . get ( a - 1 ) . add ( i ) ;
  }
  return "" ;
}
