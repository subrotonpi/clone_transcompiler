public static void input ( ) {
  String a = input . nextLine ( ) ;
  String b = input . nextLine ( ) ;
  int m = - 999 ;
  for ( int i = 0 ;
  i < 3 ;
  i ++ ) {
    String x = StringUtils . repeat ( '9' , i == j ? a . charAt ( j ) : a . charAt ( j ) ) ;
    m = Math . max ( m , Integer . parseInt ( x ) - Integer . parseInt ( b ) ) ;
    String y = StringUtils . repeat ( '0' , i > 0 ? '1' : 0 ) ;
    m = Math . max ( m , Integer . parseInt ( a ) - Integer . parseInt ( y ) ) ;
  }
  System . out . println ( m ) ;
}
