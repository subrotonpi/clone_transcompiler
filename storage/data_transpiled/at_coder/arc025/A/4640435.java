public static void print ( String input ) {
  int L = Integer . parseInt ( input . nextLine ( ) ) ;
  int R = Integer . parseInt ( input . nextLine ( ) ) ;
  int ans = 0 ;
  for ( int i = 0 ;
  i < 7 ;
  i ++ ) {
    ans += Math . max ( L [ i ] , R [ i ] ) ;
  }
  System . out . println ( ans ) ;
}
