@ VisibleForTesting static final String FILE_NAME_BASE = "D-small-attempt1" ;
final int NUM_PROCESSES = 0 ;
final double MEM_LIMIT_GB = 1.5 ;
final int RECURSION_LIMIT = 1000 ;
@ SuppressWarnings ( "resource" ) Scanner in = new Scanner ( System . in ) ;
final int rows = ( int ) in . nextInt ( ) ;
final int cols = ( int ) in . nextInt ( ) ;
return rows % modulo ;
}
