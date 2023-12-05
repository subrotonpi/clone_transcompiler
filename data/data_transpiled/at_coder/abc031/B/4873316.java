public static int a = Integer . parseInt ( input ) {
  int b = Integer . parseInt ( input . nextLine ( ) ) ;
  int n = Integer . parseInt ( input . nextLine ( ) ) ;
  int [ ] array = new int [ n ] ;
  for ( int i = 0 ;
  i < n ;
  i ++ ) {
    array [ i ] = Integer . parseInt ( input . nextLine ( ) ) ;
  }
  for ( int xx : array ) {
    System . out . println ( xx > b ? - 1 : 0 <= xx ? a : a - xx ) ;
  }
  return a ;
}
