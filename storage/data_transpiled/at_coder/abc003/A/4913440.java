public static void print ( int a ) {
  int i = Integer . parseInt ( input . nextLine ( ) ) ;
  int money = 0 ;
  for ( i = 1 ;
  i <= a ;
  i ++ ) {
    money = money + ( 10000 * i ) / a ;
  }
  System . out . println ( money ) ;
}
