public static void main ( String input ) {
  int n = Integer . parseInt ( input ) ;
  List < Integer > l = Lists . newArrayList ( ) ;
  for ( int i = 0 ;
  i < n ;
  i ++ ) {
    l . add ( Integer . parseInt ( input ) ) ;
  }
  int longest = Collections . max ( l ) ;
  int total = Integer . parseInt ( l . get ( 0 ) ) - longest ;
  if ( longest < total ) {
    System . out . println ( "Yes" ) ;
  }
  else {
    System . out . println ( "No" ) ;
  }
}
