@ VisibleForTesting static Iterable < Integer > accumulate ( ) {
  int N = Integer . parseInt ( input . nextLine ( ) ) ;
  List < Integer > L = new ArrayList < > ( ) , R = new ArrayList < > ( ) ;
  for ( int i = 0 ;
  i < N ;
  i ++ ) {
    int li = Integer . parseInt ( input . nextLine ( ) ) ;
    int ri = Integer . parseInt ( input . nextLine ( ) ) ;
    L . add ( li ) ;
    R . add ( ri ) ;
  }
  Collections . sort ( L , Collections . reverseOrder ( ) ) ;
  Collections . sort ( R , Collections . reverseOrder ( ) ) ;
  int ans = 0 ;
  for ( int k = 0 ;
  k < N + 1 ;
  k ++ ) {
    ans = Math . max ( ans , 2 * ( L . get ( k ) - R . get ( k ) ) ) ;
  }
  System . out . println ( ans ) ;
  return L ;
}
