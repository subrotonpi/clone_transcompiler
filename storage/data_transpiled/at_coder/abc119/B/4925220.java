public static void input ( ) {
  n = Integer . parseInt ( input . nextLine ( ) ) ;
  double amount = 0 ;
  for ( int i = 0 ;
  i < n ;
  i ++ ) {
    String a = Integer . parseInt ( input . nextLine ( ) ) ;
    String b = Integer . parseInt ( input . nextLine ( ) ) ;
    double x = Double . parseDouble ( a ) ;
    if ( b . equals ( "JPY" ) ) {
      amount = amount + x ;
    }
    else {
      amount = amount + x * 380000.0 ;
    }
  }
  System . out . println ( amount ) ;
}
