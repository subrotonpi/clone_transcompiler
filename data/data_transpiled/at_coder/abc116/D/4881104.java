static final int [ ] getSortedList ( ) {
  int N = Integer . parseInt ( input . nextLine ( ) ) ;
  int K = Integer . parseInt ( input . nextLine ( ) ) ;
  List < Integer > L = new ArrayList < > ( ) ;
  for ( int i = 0 ;
  i < N ;
  i ++ ) {
    final int t = Integer . parseInt ( input . nextLine ( ) ) ;
    heapifyList ( L , - d , t ) ;
  }
  List < Integer > LL = new ArrayList < > ( ) ;
  int sum = 0 ;
  Set < Integer > used = new HashSet < > ( ) ;
  for ( int i = 0 ;
  i < K ;
  i ++ ) {
    int d = Integer . parseInt ( input . nextLine ( ) ) ;
    int t = Integer . parseInt ( input . nextLine ( ) ) ;
    if ( used . contains ( t ) ) {
      heapifyList ( LL , - d , t ) ;
    }
    used . add ( t ) ;
    sum += - d ;
  }
  int ans = used . size ( ) * 2 + sum ;
  while ( L . size ( ) > 0 && LL . size ( ) > 0 ) {
    int d = Integer . parseInt ( input . nextLine ( ) ) ;
    int t = Integer . parseInt ( input . nextLine ( ) ) ;
    if ( ! used . contains ( t ) ) {
      used . add ( t ) ;
      int dd = Integer . parseInt ( input . nextLine ( ) ) ;
      sum = sum - dd + ( - d ) ;
      ans = Math . max ( ans , used . size ( ) * 2 + sum ) ;
    }
  }
  System . out . println ( ans ) ;
  return LL . toArray ( ) ;
}
