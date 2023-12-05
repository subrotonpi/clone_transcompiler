public static int [ ] getDigits ( ) {
  String A = input . nextLine ( ) ;
  String B = input . nextLine ( ) ;
  String C = A . replace ( A . substring ( 0 , 1 ) , '9' , 1 ) ;
  String D = A . substring ( 0 , 1 ) + '9' + A . substring ( 2 ) ;
  String E = A . substring ( 0 , 2 ) + '9' ;
  String F = B . replace ( B . substring ( 0 , 1 ) , '1' , 1 ) ;
  String G = B . substring ( 0 , 1 ) + '0' + B . substring ( 2 ) ;
  String H = B . substring ( 0 , 2 ) + '0' ;
  int [ ] I = {
    Integer . parseInt ( A ) , Integer . parseInt ( C ) , Integer . parseInt ( D ) , Integer . parseInt ( E ) }
    ;
    int [ ] J = {
      Integer . parseInt ( B ) , Integer . parseInt ( F ) , Integer . parseInt ( G ) , Integer . parseInt ( H ) }
      ;
      int ans = - 999 ;
      for ( int i = 0 ;
      i < 4 ;
      i ++ ) {
        if ( I [ i ] - Integer . parseInt ( B ) >= ans ) ans = I [ i ] - Integer . parseInt ( B ) ;
      }
      for ( int j = 0 ;
      j < 4 ;
      j ++ ) {
        if ( Integer . parseInt ( A ) - J [ j ] >= ans ) ans = Integer . parseInt ( A ) - J [ j ] ;
      }
      System . out . println ( ans ) ;
      return I ;
    }
    