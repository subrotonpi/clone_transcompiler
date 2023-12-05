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
  L = Collections . unmodifiableList ( L ) ;
  R = Collections . unmodifiableList ( R ) ;
  int ans = 0 ;
  for ( int k = 0 ;
  k < N ;
  k ++ ) {
    ans = Math . max ( ans , 2 * ( L . get ( k ) - R . get ( k ) ) ) ;
  }
  System . out . println ( ans ) ;
  return L ;
}
