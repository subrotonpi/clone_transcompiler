public static int A ( ) {
  int a , b ;
  a = Math . max ( new Integer ( '9' + A . substring ( 1 ) ) , new Integer ( A . charAt ( 0 ) + '9' + A . substring ( 2 ) ) ) ;
  b = Math . min ( new Integer ( '1' + B . substring ( 1 ) ) , new Integer ( B . charAt ( 0 ) + '0' + B . substring ( 2 ) ) ) ;
  return a ;
}
