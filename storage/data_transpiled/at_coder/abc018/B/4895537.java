public static void solve ( ) {
  String s = input . nextLine ( ) ;
  int n = Integer . parseInt ( input . nextLine ( ) ) ;
  for ( int i = 0 ;
  i < n ;
  i ++ ) {
    int l = ( Integer ) input . nextInt ( ) ;
    int r = ( Integer ) input . nextInt ( ) ;
    String tmp = s . substring ( l - 1 , r ) ;
    s = tmp . substring ( 0 , l - 1 ) + s . substring ( r ) ;
  }
  System . out . println ( s ) ;
}
