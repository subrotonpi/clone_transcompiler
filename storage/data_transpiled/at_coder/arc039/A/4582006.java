public static int input ( ) {
  String a = input . substring ( 0 , 1 ) ;
  String b = input . substring ( 1 , 2 ) ;
  int res1 = 900 + Integer . parseInt ( a . substring ( 1 , 2 ) ) - Integer . parseInt ( b ) ;
  int res2 = Integer . parseInt ( a . substring ( 0 , 2 ) ) * 100 + 90 + Integer . parseInt ( a . substring ( 2 , 3 ) ) - Integer . parseInt ( b ) ;
  int res3 = Integer . parseInt ( a . substring ( 0 , 2 ) ) * 10 + 9 - Integer . parseInt ( b ) ;
  int res4 = Integer . parseInt ( a . substring ( 0 , 2 ) ) - 100 ;
  int res5 = Integer . parseInt ( a . substring ( 0 , 2 ) ) - 100 ;
  int res6 = Integer . parseInt ( a . substring ( 0 , 2 ) ) ;
  return res6 ;
}
