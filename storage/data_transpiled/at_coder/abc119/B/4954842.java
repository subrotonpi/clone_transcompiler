public static void input ( ) {
  int n = Integer . parseInt ( input ( ) ) ;
  int m = 0 ;
  for ( int i = 0 ;
  i <= n ;
  i ++ ) {
    String [ ] money = input ( ) . split ( " " ) ;
    if ( ( money [ 1 ] . equals ( "JPY" ) ) ) {
      m += Integer . parseInt ( money [ 0 ] ) ;
    }
    else {
      m += Double . parseDouble ( money [ 0 ] ) * 380000 ;
    }
  }
  System . out . println ( m ) ;
}
