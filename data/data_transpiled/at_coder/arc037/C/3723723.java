@ VisibleForTesting static void binarySearch ( ) {
  int N = Integer . parseInt ( input . nextLine ( ) ) ;
  int K = Integer . parseInt ( input . nextLine ( ) ) ;
  List < Integer > a = new ArrayList < > ( N ) ;
  List < Integer > b = new LinkedList < > ( ) ;
  for ( Integer bN : b ) {
    a . add ( bN ) ;
  }
  int ok = 0 , ng = 10 * 18 + 1 ;
  while ( ng - ok > 1 ) {
    int x = ( ok + ng ) / 2 ;
    int count = Math . min ( x , b . size ( ) ) ;
    if ( count < K ) {
      ok = x ;
    }
    else {
      ng = x ;
    }
  }
  System . out . println ( ok + 1 ) ;
}
