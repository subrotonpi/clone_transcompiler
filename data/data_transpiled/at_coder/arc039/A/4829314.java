public static int input ( ) {
  String A = input . nextLine ( ) ;
  String B = input . nextLine ( ) ;
  int x , y ;
  if ( A . charAt ( 0 ) != '9' ) {
    x = Integer . parseInt ( '9' + A . substring ( 1 ) ) - Integer . parseInt ( B ) ;
  }
  else if ( A . charAt ( 1 ) != '9' ) {
    x = Integer . parseInt ( A . substring ( 0 , 1 ) + '9' + A . charAt ( 2 ) ) - Integer . parseInt ( B ) ;
  }
  else if ( A . charAt ( 2 ) != '9' ) {
    x = Integer . parseInt ( A . substring ( 0 , 2 ) + '9' ) - Integer . parseInt ( B ) ;
  }
  else {
    x = Integer . parseInt ( A ) - Integer . parseInt ( B ) ;
  }
  if ( B . charAt ( 0 ) != '1' ) {
    y = Integer . parseInt ( A ) - Integer . parseInt ( '1' + B . substring ( 1 ) ) ;
  }
  else if ( B . charAt ( 1 ) != '0' ) {
    y = Integer . parseInt ( A ) - Integer . parseInt ( B . substring ( 0 , 2 ) + '0' ) ;
  }
  else {
    y = Integer . parseInt ( A ) - Integer . parseInt ( B ) ;
  }
  return y ;
}
