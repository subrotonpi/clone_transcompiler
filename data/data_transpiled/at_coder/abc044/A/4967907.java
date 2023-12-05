public static void print ( int n ) {
  int k = Integer . parseInt ( input . nextLine ( ) ) ;
  int x = Integer . parseInt ( input . nextLine ( ) ) ;
  int y = Integer . parseInt ( input . nextLine ( ) ) ;
  int sum = 0 ;
  for ( int i = 0 ;
  i < n ;
  i ++ ) {
    if ( i + 1 <= k ) {
      sum += x ;
    }
    else {
      sum += y ;
    }
  }
  System . out . println ( sum ) ;
}
