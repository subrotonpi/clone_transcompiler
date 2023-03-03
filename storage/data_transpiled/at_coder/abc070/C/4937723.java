static final Scanner getScanner ( ) {
  final Scanner ns = new Scanner ( System . in ) ;
  final Scanner ni = new Scanner ( ns ) ;
  final Scanner nm = new Scanner ( System . in ) ;
  final List < Integer > nl = new LinkedList < Integer > ( ) ;
  final List < String > nsl = new LinkedList < String > ( ) ;
  for ( int i = 0 ;
  i < ns . size ( ) ;
  i ++ ) {
    ns . next ( ) ;
  }
  final int n = ni . nextInt ( ) ;
  int t = ni . nextInt ( ) ;
  if ( n == 1 ) {
    System . out . println ( t ) ;
  }
  else {
    for ( int i = 0 ;
    i < n - 1 ;
    i ++ ) {
      final int tmp = ni . nextInt ( ) ;
      t = lcm . compare ( t , tmp ) ;
    }
    System . out . println ( t ) ;
  }
  return ns ;
}
