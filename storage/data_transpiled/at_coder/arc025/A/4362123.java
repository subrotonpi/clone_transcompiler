public static void print ( String input ) {
  int d = Integer . parseInt ( input . nextLine ( ) ) ;
  int j = Integer . parseInt ( input . nextLine ( ) ) ;
  int s = 0 ;
  for ( int i = 0 ;
  i < 7 ;
  i ++ ) {
    s += Math . max ( d , j ) ;
  }
  System . out . println ( s ) ;
}
