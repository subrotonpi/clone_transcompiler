public static void print ( int n = Integer . parseInt ( input ) ) {
  int h1 = 0 ;
  int h2 = 0 ;
  int h3 = 0 ;
  for ( int i = 0 ;
  i < n ;
  i ++ ) {
    int a = Integer . parseInt ( input . nextLine ( ) ) ;
    int b = Integer . parseInt ( input . nextLine ( ) ) ;
    int c = Integer . parseInt ( input . nextLine ( ) ) ;
    h1 = Math . max ( h1 , a ) ;
    h2 = Math . max ( h2 , b ) ;
    h3 = Math . max ( h3 , c ) ;
  }
  System . out . println ( h1 * h2 * h3 ) ;
}
