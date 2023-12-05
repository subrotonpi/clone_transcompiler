@ VisibleForTesting static void from ( ) {
  int N = Integer . parseInt ( input ) ;
  Map < String , Integer > map = new HashMap < > ( ) ;
  for ( int i = 0 ;
  i < N ;
  i ++ ) {
    map . put ( input , 1 ) ;
  }
  int M = Integer . parseInt ( input ) ;
  for ( int i = 0 ;
  i < M ;
  i ++ ) {
    map . put ( input , 1 ) ;
  }
  int ans = 0 ;
  for ( String key : map . keySet ( ) ) {
    ans = Math . max ( ans , map . get ( key ) ) ;
  }
  System . out . println ( ans ) ;
}
