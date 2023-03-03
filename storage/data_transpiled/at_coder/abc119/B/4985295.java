static final int input ( ) {
  int n = Integer . parseInt ( input ( ) ) ;
  double money = 0 ;
  for ( int i = 0 ;
  i < n ;
  i ++ ) {
    String y = System . console ( ) . readLine ( ) ;
    String a = y . substring ( 0 , y . indexOf ( ' ' ) ) ;
    String b = y . substring ( y . indexOf ( ' ' ) + 1 ) ;
    double x = Double . parseDouble ( a ) ;
    if ( b . equals ( "JPY" ) ) money = money + x ;
    else money = money + x * 380000.0 ;
  }
  System . out . println ( money ) ;
}
