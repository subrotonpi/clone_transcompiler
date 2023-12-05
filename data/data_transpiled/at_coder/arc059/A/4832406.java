public static void input ( ) {
  int n = Integer . parseInt ( input . nextLine ( ) ) ;
  List < Integer > l = Lists . newArrayList ( ) ;
  for ( int i = 0 ;
  i < n ;
  i ++ ) {
    l . add ( i ) ;
  }
  int s = Integer . parseInt ( l . get ( 0 ) ) ;
  if ( s - Integer . MIN_VALUE < Integer . MAX_VALUE + 1 ) {
    s = Integer . MIN_VALUE ;
  }
  else {
    s = Integer . MAX_VALUE + 1 ;
  }
  long ans = 0 ;
  for ( int i = 0 ;
  i < l . size ( ) ;
  i ++ ) {
    ans += ( s - l . get ( i ) ) * ( s - l . get ( i ) ) ;
  }
  System . out . println ( ans ) ;
}
