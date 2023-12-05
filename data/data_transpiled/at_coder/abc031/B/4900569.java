public static int input ( ) {
  int l = Integer . parseInt ( input . readLine ( ) ) , h = Integer . parseInt ( input . readLine ( ) ) ;
  int n = Integer . parseInt ( input . readLine ( ) ) ;
  for ( int i = 0 ;
  i < n ;
  i ++ ) {
    int t = Integer . parseInt ( input . readLine ( ) ) ;
    if ( t < l ) {
      System . out . println ( l - t ) ;
    }
    else if ( l <= t && t <= h ) {
      System . out . println ( 0 ) ;
    }
    else {
      System . out . println ( - 1 ) ;
    }
  }
  return l ;
}
