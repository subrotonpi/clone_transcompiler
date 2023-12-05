@ VisibleForTesting static void fillWithDefault ( ) {
  int N = Integer . parseInt ( input . nextLine ( ) ) ;
  List < Integer > T = new ArrayList < > ( N ) ;
  for ( int i = 0 ;
  i < N ;
  i ++ ) {
    T . add ( Integer . parseInt ( input . nextLine ( ) ) ) ;
  }
  List < Map . Entry < Integer , Integer >> T_Counted = new ArrayList < > ( T ) ;
  T_Counted . entrySet ( ) . stream ( ) . sorted ( ) . forEach ( e -> {
    int time = 0 ;
    int num = e . getValue ( ) ;
    for ( int i = 0 ;
    i < num ;
    i ++ ) {
      time += e . getKey ( ) ;
    }
  }
  ) ;
  int [ ] nums = T_Counted . toArray ( ) ;
  int r = 1 ;
  for ( int num : nums ) {
    r = ( r * factorial ( num ) ) % ( 10 * * 9 + 7 ) ;
  }
  System . out . println ( penalty ) ;
  System . out . println ( r ) ;
}
