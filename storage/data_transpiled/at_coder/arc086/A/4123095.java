@ VisibleForTesting static void from ( String input ) {
  int N = Integer . parseInt ( input ) ;
  int K = Integer . parseInt ( input ) ;
  List < Integer > A = Lists . newArrayList ( ) ;
  for ( int i = 0 ;
  i < N ;
  i ++ ) {
    A . add ( i ) ;
  }
  C = new Counter ( A ) ;
  List < Integer > v = Lists . newArrayList ( ) ;
  v . addAll ( C . values ( ) ) ;
  v . addAll ( v ) ;
  v . sort ( ) ;
  int div = v . size ( ) ;
  int ans = 0 ;
  if ( div <= K ) {
    ans = 0 ;
  }
  else {
    ans += Integer . parseInt ( v . subList ( 0 , div - K ) ) ;
  }
  System . out . println ( ans ) ;
}
