static final Scanner input = new Scanner ( System . in ) {
  final Scanner scanner = new Scanner ( System . in ) ;
  for ( int testcase = 1 ;
  testcase <= Integer . MAX_VALUE ;
  testcase ++ ) {
    final String name = scanner . next ( ) . toString ( ) ;
    final int n = scanner . nextInt ( ) ;
    final int index = Integer . parseInt ( name ) ;
    final TIntHashSet startingPoints = new TIntHashSet ( ) ;
    final boolean enoughConjuants = false ;
    int numConjugants = 0 ;
    for ( index = xrange ( name . length ( ) - 1 , name . length ( ) , enoughConjugants ) ;
    index >= 0 ;
    index -- ) {
      if ( "aeiou" . indexOf ( name . charAt ( index ) ) >= 0 ) {
        numConjugants = 0 ;
      }
      else {
        numConjugants ++ ;
      }
      if ( numConjugants >= n ) {
        startingPoints . add ( index ) ;
      }
    }
    int count ;
    int lastUsed = 1 ;
    for ( index = xrange ( n , name . length ( ) , enoughConjugants ) ;
    index >= 0 ;
    index -- ) {
      final int indexMinus = index - n + 1 ;
      if ( startingPoints . contains ( indexMinus ) ) {
        count = count + indexMinus + 1 ;
        lastUsed = indexMinus + 1 ;
      }
      else {
        count = count + lastUsed ;
      }
    }
    System . out . printf ( "Case #%d: %d%n" , testcase , count ) ;
  }
  return scanner ;
}
