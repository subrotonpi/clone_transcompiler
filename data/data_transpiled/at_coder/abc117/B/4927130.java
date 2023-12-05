public static void main ( String input ) {
  int n = Integer . parseInt ( input ) ;
  List < Integer > l = Lists . newArrayList ( ) ;
  for ( int i = 0 ;
  i < n ;
  i ++ ) {
    l . add ( Integer . parseInt ( input ) ) ;
  }
  Collections . sort ( l ) ;
  if ( 2 * l . get ( l . size ( ) - 1 ) < Integer . parseInt ( l . get ( l . size ( ) - 1 ) ) ) {
    System . out . println ( "Yes" ) ;
  }
  else {
    System . out . println ( "No" ) ;
  }
}
