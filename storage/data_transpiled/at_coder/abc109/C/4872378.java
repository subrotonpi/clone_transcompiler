@ VisibleForTesting static int sum ( ) {
  int N = Integer . parseInt ( input . nextLine ( ) ) ;
  int X = Integer . parseInt ( input . nextLine ( ) ) ;
  List < Integer > xi = Lists . newArrayList ( ) ;
  xi . add ( X ) ;
  Collections . sort ( xi ) ;
  List < Integer > diffs = new ArrayList < > ( ) ;
  for ( int i = 0 ;
  i < N ;
  i ++ ) {
    diffs . add ( xi . get ( i + 1 ) - xi . get ( i ) ) ;
  }
  int ans = Math . max ( diffs , 0 ) ;
  System . out . println ( ans ) ;
  return ans ;
}
