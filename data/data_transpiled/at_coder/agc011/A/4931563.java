@ VisibleForTesting static int from ( ) {
  int N = Integer . parseInt ( input . nextLine ( ) ) ;
  int C = Integer . parseInt ( input . nextLine ( ) ) ;
  int K = Integer . parseInt ( input . nextLine ( ) ) ;
  Map < Integer , Integer > ps = new HashMap < > ( ) ;
  for ( int i = 0 ;
  i < N ;
  i ++ ) {
    int T = Integer . parseInt ( input . nextLine ( ) ) ;
    ps . put ( T , ++ T ) ;
  }
  int count = 0 ;
  int currentPs = 0 ;
  int timeLimit = 10 * 9 + K + 1 ;
  for ( int t : new ArrayList < > ( ps . keySet ( ) ) ) {
    if ( t > timeLimit && currentPs > 0 ) {
      count ++ ;
      currentPs = 0 ;
    }
    if ( currentPs == 0 ) {
      ++ t ;
    }
  }
  return count ;
}
