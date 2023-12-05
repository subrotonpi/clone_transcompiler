public static void main ( String input ) {
  int n = Integer . parseInt ( input ) , t = Integer . parseInt ( input ) ;
  int total = 0 ;
  int open_till = 0 ;
  for ( ;
  ;
  ) {
    int a = Integer . parseInt ( input ) ;
    if ( a < open_till ) {
      total += t - ( open_till - a ) ;
      open_till = a + t ;
    }
    else {
      total += t ;
      open_till = a + t ;
    }
  }
  System . out . println ( total ) ;
}
