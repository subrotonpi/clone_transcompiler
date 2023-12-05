public static void print ( int n ) {
  int k = Integer . parseInt ( input . nextLine ( ) ) ;
  int x = Integer . parseInt ( input . nextLine ( ) ) ;
  int y = Integer . parseInt ( input . nextLine ( ) ) ;
  int en = 0 ;
  for ( int i = 0 ;
  i < n ;
  i ++ ) {
    if ( i + 1 < k + 1 ) {
      en += x ;
    }
    else {
      en += y ;
    }
  }
  System . out . println ( en ) ;
}
