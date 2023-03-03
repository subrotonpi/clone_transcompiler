public static void input ( ) {
  String a = input . nextLine ( ) ;
  String b = input . nextLine ( ) ;
  int ans = Integer . parseInt ( a ) - Integer . parseInt ( b ) ;
  String x = '9' + a . charAt ( 1 ) + a . charAt ( 2 ) ;
  String y = a . charAt ( 0 ) + '9' + a . charAt ( 2 ) ;
  String z = a . charAt ( 0 ) + a . charAt ( 1 ) + '9' ;
  ans = Math . max ( ans , Integer . parseInt ( x ) - Integer . parseInt ( b ) , Integer . parseInt ( y ) - Integer . parseInt ( b ) , Integer . parseInt ( z ) - Integer . parseInt ( b ) ) ;
  String d = '1' + b . charAt ( 1 ) + b . charAt ( 2 ) ;
  String e = b . charAt ( 0 ) + '0' + b . charAt ( 2 ) ;
  String f = b . charAt ( 0 ) + b . charAt ( 1 ) + '0' ;
  ans = Math . max ( ans , Integer . parseInt ( a ) - Integer . parseInt ( d ) , Integer . parseInt ( a ) - Integer . parseInt ( e ) , Integer . parseInt ( a ) - Integer . parseInt ( f ) ) ;
  System . out . println ( ans ) ;
}
