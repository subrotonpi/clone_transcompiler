static final String getSolutionName ( ) {
  final String problemName = "C" ;
  final String testCase = "small" ;
  int attempt = 2 ;
  {
    final Scanner inputScanner = new Scanner ( System . in ) ;
    final int numberOfCases = Integer . parseInt ( inputScanner . nextLine ( ) ) ;
    for ( int i = 1 ;
    i <= numberOfCases ;
    i ++ ) {
      final int N = Integer . parseInt ( inputScanner . nextLine ( ) ) ;
      final int S = Integer . parseInt ( inputScanner . nextLine ( ) ) ;
      final int [ ] asteroids = new int [ N ] ;
      for ( ;
      i < N ;
      i ++ ) {
        asteroids [ i ] = Integer . parseInt ( inputScanner . nextLine ( ) ) ;
      }
      final int result = solution ( N , S , asteroids ) ;
      new PrintWriter ( System . out ) . printf ( "Case #%d: %f\n" , testCase , result ) ;
    }
    return "" ;
  }
  private static Map < Integer , Map < Integer , Integer >> buildUpTransitions ( int N , int S , String asteroids ) {
    final Map < Integer , Map < Integer , Integer >> transitions = buildUpTransitions ( N , S , asteroids ) ;
    final PriorityQueue < Integer > queue = new PriorityQueue < > ( ) ;
    queue . add ( new Integer ( 0 ) ) ;
    final Set < String > seen = new HashSet < > ( ) ;
    while ( queue . size ( ) > 0 ) {
      final int cost = queue . poll ( ) ;
      final String vertex = queue . poll ( ) ;
      if ( ! seen . contains ( vertex ) ) {
        seen . add ( vertex ) ;
        if ( vertex . equals ( "finish" ) ) {
          return cost ;
        }
        if ( transitions . containsKey ( vertex ) ) {
          for ( final Map . Entry < Integer , Integer > newVertex : transitions . get ( vertex ) . entrySet ( ) ) {
            if ( ! seen . contains ( newVertex . getKey ( ) ) ) {
              queue . add ( new Integer ( Math . max ( cost , newVertex . getValue ( ) ) ) ) ;
            }
          }
        }
      }
    }
    return Double . POSITIVE_INFINITY ;
  }
}
