public static int input ( ) {
  int l = Integer . parseInt ( input . readLine ( ) ) , h = Integer . parseInt ( input . readLine ( ) ) ;
  int n = Integer . parseInt ( input . readLine ( ) ) ;
  for ( ;
  ;
  ) {
    int a = Integer . parseInt ( input . readLine ( ) ) ;
    if ( a < l ) {
      System . out . println ( l - a ) ;
    }
    else if ( a <= h ) {
      System . out . println ( 0 ) ;
    }
    else {
      System . out . println ( - 1 ) ;
    }
  }
}
