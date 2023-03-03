public static int [ ] getA ( ) {
  String A = input . nextLine ( ) ;
  String B = input . nextLine ( ) ;
  int [ ] ans = new int [ 3 ] ;
  ans [ 0 ] = ( Integer . parseInt ( A ) - Integer . parseInt ( B ) ) ;
  ans [ 1 ] = ( Integer . parseInt ( "9" + A . substring ( 1 ) ) - Integer . parseInt ( B ) ) ;
  ans [ 2 ] = ( Integer . parseInt ( A . substring ( 0 , 2 ) ) - Integer . parseInt ( "9" + A . substring ( 2 ) ) ) ;
  ans [ 3 ] = ( Integer . parseInt ( A . substring ( 0 , 2 ) ) - Integer . parseInt ( "1" + B . substring ( 1 ) ) ) ;
  ans [ 4 ] = ( Integer . parseInt ( A . substring ( 0 , 2 ) ) - Integer . parseInt ( "0" + B . substring ( 2 ) ) ) ;
  return ans ;
}
