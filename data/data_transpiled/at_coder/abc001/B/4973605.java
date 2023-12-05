public static void input ( ) {
  int m = Integer . parseInt ( input . nextLine ( ) ) ;
  String vv = "00" ;
  if ( 100 <= m && m <= 900 ) {
    vv = "0" + Integer . toString ( m / 100 ) ;
  }
  else if ( 1000 <= m && m <= 5000 ) {
    vv = Integer . toString ( m / 100 ) ;
  }
  else if ( 6000 <= m && m <= 30000 ) {
    vv = Integer . toString ( m / 1000 + 50 ) ;
  }
  else if ( 35000 <= m ) {
    vv = "89" ;
  }
  System . out . println ( vv ) ;
}
