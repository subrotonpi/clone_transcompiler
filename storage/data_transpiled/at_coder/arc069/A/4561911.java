public static void print ( String s ) {
  int c = Integer . parseInt ( input . nextLine ( ) ) ;
  int a = Math . min ( s , c / 2 ) ;
  c -= s * 2 ;
  a += Math . max ( 0 , c / 4 ) ;
  System . out . println ( a ) ;
}
