public static void n ( int i ) {
  int n = Integer . parseInt ( input . nextLine ( ) ) ;
  String s = input . nextLine ( ) ;
  int min = 9999 ;
  int max = 0 ;
  for ( int j = 1 ;
  j <= 5 ;
  j ++ ) {
    int x = s . indexOf ( Integer . toString ( j ) ) ;
    if ( min > x ) {
      min = x ;
    }
    if ( max < x ) {
      max = x ;
    }
  }
  System . out . println ( max + " " + min ) ;
}
