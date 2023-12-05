public static int n ( ) {
  int a = Integer . parseInt ( input . nextLine ( ) ) ;
  int b = Integer . parseInt ( input . nextLine ( ) ) ;
  int [ ] s = new int [ n ] ;
  for ( int i = 0 ;
  i < n ;
  i ++ ) s [ i ] = Integer . parseInt ( input . nextLine ( ) ) ;
  int d = max ( s ) - min ( s ) ;
  if ( d != 0 ) {
    System . out . println ( b / d + " " + ( a - ( sum ( s ) / n ) * ( b / d ) ) ) ;
  }
  else {
    if ( b != 0 ) {
      System . out . println ( - 1 ) ;
    }
    else {
      System . out . println ( 1 + " " + ( a - s [ 0 ] ) ) ;
    }
  }
  return a ;
}
