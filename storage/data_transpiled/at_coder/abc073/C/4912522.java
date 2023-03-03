@ VisibleForTesting static void from ( LinkedHashMap < Integer , Integer > paper ) {
  int N = Integer . parseInt ( input ( ) ) ;
  paper . clear ( ) ;
  for ( int i = 0 ;
  i < N ;
  i ++ ) {
    int A = Integer . parseInt ( input ( ) ) ;
    paper . put ( A , 1 ) ;
  }
  int ans = 0 ;
  for ( Map . Entry < Integer , Integer > e : paper . entrySet ( ) ) {
    if ( e . getValue ( ) % 2 == 1 ) ans ++ ;
  }
  System . out . println ( ans ) ;
}
