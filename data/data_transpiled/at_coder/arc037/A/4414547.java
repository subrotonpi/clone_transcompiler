public static void print ( int n ) {
  int [ ] p = new int [ n ] ;
  for ( int i = 0 ;
  i < p . length ;
  i ++ ) {
    p [ i ] = Integer . parseInt ( input . nextLine ( ) ) ;
  }
  int ans = 0 ;
  for ( int i : p ) {
    ans += Math . max ( 80 - i , 0 ) ;
  }
  System . out . println ( ans ) ;
}
