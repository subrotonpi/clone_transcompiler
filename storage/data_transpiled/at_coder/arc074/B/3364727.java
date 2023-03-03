@ VisibleForTesting static int heapSort ( ) {
  int N = Integer . parseInt ( input . nextLine ( ) ) ;
  List < Integer > A = Lists . newArrayList ( ) ;
  for ( int i = 0 ;
  i < N ;
  i ++ ) {
    A . add ( Integer . parseInt ( input . nextLine ( ) ) ) ;
  }
  List < Integer > lList = new ArrayList < > ( A . subList ( 0 , N ) ) ;
  List < Integer > lSum = new ArrayList < > ( ) ;
  lSum . add ( Integer . valueOf ( lList . size ( ) ) ) ;
  for ( int a = N ;
  a < 2 * N ;
  a ++ ) {
    lSum . add ( lSum . get ( lSum . size ( ) - 1 ) - heapSort ( lList , a ) + a ) ;
  }
  List < Integer > rList = new ArrayList < > ( ) ;
  rList . add ( Integer . valueOf ( - 1 ) ) ;
  List < Integer > rSum = new ArrayList < > ( ) ;
  rSum . add ( Integer . valueOf ( - 1 ) ) ;
  for ( int a = N ;
  a < 2 * N ;
  a ++ ) {
    rSum . add ( Integer . valueOf ( a ) - heapSort ( rList , a ) - a ) ;
  }
  int ans = - ( 10 * 15 ) ;
  for ( int l = lSum . size ( ) , r = rSum . size ( ) ;
  l > r ;
  l = l + r ) {
    ans = Math . max ( ans , l + r ) ;
  }
  System . out . println ( ans ) ;
  return ans ;
}
