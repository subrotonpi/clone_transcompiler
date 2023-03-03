@ VisibleForTesting static void main ( String [ ] args ) {
  final boolean DEBUG = false ;
  final Runnable debugPrint = new Runnable ( ) {
    public void run ( ) {
      if ( DEBUG ) {
        System . out . println ( args [ 0 ] ) ;
      }
    }
  }
  ;
  final int numCases = Integer . parseInt ( args [ 0 ] ) ;
  for ( int testCase = 1 ;
  testCase <= numCases ;
  testCase ++ ) {
    final LinkedList < String > sched = new LinkedList < > ( ) ;
    for ( String s : args ) {
      sched . add ( s ) ;
    }
    final int lSched = sched . size ( ) ;
    final ArrayList < String > tasks = new ArrayList < > ( ) ;
    int score = 0 ;
    for ( int i = 0 ;
    i < sched . size ( ) ;
    i ++ ) {
      if ( tasks . size ( ) == lSched - i ) {
        final String a = tasks . remove ( tasks . size ( ) - 1 ) ;
        final String b = sched . get ( i ) ;
        if ( a . equals ( b ) ) {
          score += 10 ;
        }
        else {
          score += 5 ;
        }
      }
      else if ( tasks . size ( ) == 0 ) {
        tasks . add ( sched . get ( i ) ) ;
      }
      else if ( sched . get ( i ) . equals ( tasks . get ( tasks . size ( ) - 1 ) ) ) {
        tasks . remove ( tasks . size ( ) - 1 ) ;
        score += 10 ;
      }
      else {
        tasks . add ( sched . get ( i ) ) ;
      }
    }
    System . out . println ( "Case #" + testCase + ": " + score ) ;
  }
}
