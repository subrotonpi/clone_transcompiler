public static void print ( String input ) {
  String n = input . replaceAll ( " " , "" ) ;
  int keta_sum = Integer . parseInt ( n ) ;
  if ( Integer . parseInt ( n ) % keta_sum == 0 ) {
    System . out . println ( "Yes" ) ;
  }
  else {
    System . out . println ( "No" ) ;
  }
}
