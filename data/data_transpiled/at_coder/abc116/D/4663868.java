@ VisibleForTesting static void heapSort ( ) {
  int n = Integer . parseInt ( input . nextLine ( ) ) ;
  int k = Integer . parseInt ( input . nextLine ( ) ) ;
  List < Integer > L = new ArrayList < > ( ) ;
  for ( int i = 0 ;
  i < n ;
  i ++ ) {
    int t = Integer . parseInt ( input . nextLine ( ) ) ;
    int d = Integer . parseInt ( input . nextLine ( ) ) ;
    heapSort ( L , - d , t ) ;
  }
  List < Integer > LL = new ArrayList < > ( ) ;
  int sum = 0 ;
  Set < Integer > s = new HashSet < > ( ) ;
  for ( int i = 0 ;
  i < k ;
  i ++ ) {
    int d = Integer . parseInt ( input . nextLine ( ) ) ;
    int t = Integer . parseInt ( input . nextLine ( ) ) ;
    if ( s . contains ( t ) ) {
      heapSort ( LL , - d , t ) ;
    }
    s . add ( t ) ;
    sum += - d ;
  }
  int ans = s . size ( ) * 2 + sum ;
  while ( L . size ( ) > 0 && LL . size ( ) > 0 ) {
    int d = Integer . parseInt ( input . nextLine ( ) ) ;
    int t = Integer . parseInt ( input . nextLine ( ) ) ;
    if ( ! s . contains ( t ) ) {
      s . add ( t ) ;
      int dd = Integer . parseInt ( input . nextLine ( ) ) ;
      sum = sum - dd + ( - d ) ;
      ans = Math . max ( ans , s . size ( ) * 2 + sum ) ;
    }
  }
  System . out . println ( ans ) ;
}
