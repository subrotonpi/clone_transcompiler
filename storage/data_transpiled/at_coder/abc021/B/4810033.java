public static void print ( int n ) {
  int a = ( Integer ) input . nextInt ( ) ;
  int b = ( Integer ) input . nextInt ( ) ;
  int k = ( Integer ) input . nextInt ( ) ;
  List < Integer > p = new ArrayList < Integer > ( ) ;
  for ( int i = 0 ;
  i < k ;
  i ++ ) {
    p . add ( Integer . parseInt ( input . next ( ) ) ) ;
  }
  if ( p . contains ( a ) || p . contains ( b ) ) {
    System . out . println ( "NO" ) ;
    exit ( ) ;
  }
  if ( Collections . binarySearch ( p , a ) == p . size ( ) ) {
    System . out . println ( "YES" ) ;
  }
  else {
    System . out . println ( "NO" ) ;
  }
}
