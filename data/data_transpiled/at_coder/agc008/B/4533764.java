@ VisibleForTesting static Iterable < Integer > accumulate ( ) {
  final Scanner scanner = new Scanner ( System . in ) ;
  final int N = Integer . parseInt ( scanner . nextLine ( ) ) ;
  final int K = Integer . parseInt ( scanner . nextLine ( ) ) ;
  final List < Integer > L = Lists . newArrayList ( Integer . parseInt ( scanner . nextLine ( ) ) ) ;
  final AtomicInteger accL = new AtomicInteger ( 0 ) ;
  final AtomicInteger pos = new AtomicInteger ( L . size ( ) ) ;
  for ( int l : L ) {
    accL . set ( l > 0 ? l : 0 ) ;
  }
  final AtomicInteger accPos = new AtomicInteger ( 0 ) ;
  final AtomicInteger accPos = new AtomicInteger ( pos . get ( accL . size ( ) - 1 ) ) ;
  final int sumPos = accPos . get ( accPos . size ( ) - 1 ) ;
  double ans = - Double . MAX_VALUE ;
  for ( int s = 0 ;
  s <= N - K ;
  s ++ ) {
    final int tmpS = accL . get ( s + K ) - accL . get ( s ) ;
    final int posS = accPos . get ( s + K ) - accPos . get ( s ) ;
    ans = Math . max ( ans , tmpS + sumPos - posS , sumPos - posS ) ;
  }
  System . out . println ( ans ) ;
  return L ;
}
