@ VisibleForTesting static LinkedHashMap < String , Integer > map ( ) {
  final int INF = Integer . MAX_VALUE ;
  final int mod = 10 * * 9 + 7 ;
  final int eps = 10 * * - 7 ;
  /* inpl */
  final LinkedHashMap < String , Integer > inpls = new LinkedHashMap < > ( ) ;
  /* inpls */
  final int N = inpls . size ( ) ;
  final int L = N ;
  final String S = input ( ) ;
  int cnt = 1 ;
  int ans = 0 ;
  for ( final String s : S ) {
    if ( s . equals ( "+" ) ) {
      cnt ++ ;
    }
    else {
      cnt -- ;
    }
    if ( cnt > L ) {
      ans ++ ;
      cnt = 1 ;
    }
  }
  System . out . println ( ans ) ;
  return inpls ;
}
