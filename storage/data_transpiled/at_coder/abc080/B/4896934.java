public static void print ( String s ) {
  int n = Integer . parseInt ( input . nextLine ( ) ) ;
  String n = Integer . toString ( n ) ;
  int sum = s . length ( ) ;
  for ( int i = 0 ;
  i < sum ;
  i ++ ) {
    if ( n % sum == 0 ) {
      System . out . println ( "Yes" ) ;
    }
    else {
      System . out . println ( "No" ) ;
    }
  }
}
