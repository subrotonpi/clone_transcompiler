public static void main ( ) {
  String a = input . nextLine ( ) ;
  String b = input . nextLine ( ) ;
  int ab = Integer . parseInt ( a + b ) ;
  for ( int i = 0 ;
  i < 400 ;
  i ++ ) {
    if ( i * i == ab ) {
      System . out . println ( "Yes" ) ;
      exit ( ) ;
    }
  }
  System . out . println ( "No" ) ;
}
