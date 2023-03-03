public static int [ ] readIntLine ( ) {
  int l = Integer . parseInt ( input . nextLine ( ) ) ;
  int h = Integer . parseInt ( input . nextLine ( ) ) ;
  int n = Integer . parseInt ( input . nextLine ( ) ) ;
  int [ ] a = new int [ n ] ;
  for ( int i = 0 ;
  i < a . length ;
  i ++ ) {
    a [ i ] = Integer . parseInt ( input . nextLine ( ) ) ;
  }
  for ( int i = 0 ;
  i < a . length ;
  i ++ ) {
    if ( a [ i ] >= l && a [ i ] <= h ) {
      System . out . println ( 0 ) ;
    }
    else if ( a [ i ] > l ) {
      System . out . println ( - 1 ) ;
    }
    else {
      System . out . println ( l - a [ i ] ) ;
    }
  }
  return a ;
}
