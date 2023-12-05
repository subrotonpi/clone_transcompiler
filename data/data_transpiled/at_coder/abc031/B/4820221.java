public static int input ( ) {
  int l = Integer . parseInt ( input . readLine ( ) ) , h = Integer . parseInt ( input . readLine ( ) ) ;
  int n = Integer . parseInt ( input . readLine ( ) ) ;
  for ( int i = 0 ;
  i < n ;
  i ++ ) {
    int a = Integer . parseInt ( input . readLine ( ) ) ;
    if ( a < l ) {
      System . out . println ( l - a ) ;
    }
    else if ( l <= a && a <= h ) {
      System . out . println ( 0 ) ;
    }
    else {
      System . out . println ( - 1 ) ;
    }
  }
  return l ;
}
