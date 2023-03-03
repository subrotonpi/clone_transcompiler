static final d . blah ( ) {
  final Scanner ri = new Scanner ( System . in ) ;
  final int t = Integer . parseInt ( ri . next ( ) ) ;
  for ( int testCase = xrange ( 1 , t + 1 ) ;
  testCase <= t ;
  testCase ++ ) {
    final int h = Integer . parseInt ( ri . next ( ) ) ;
    final int w = Integer . parseInt ( ri . next ( ) ) ;
    final int ddd = Integer . parseInt ( ri . next ( ) ) ;
    final List < String > X = new LinkedList < String > ( ) ;
    for ( int i = xrange ( h ) ;
    i < w ;
    i ++ ) {
      final String line = ri . next ( ) ;
      X . add ( line ) ;
    }
    System . out . println ( "Case #" + testCase + ": " + d . blah ( ddd , X ) ) ;
  }
  return new d . blah ( t , X ) ;
}
