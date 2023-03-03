public static void print ( int a ) {
  int b = Integer . parseInt ( input . nextLine ( ) ) ;
  int c = Integer . parseInt ( input . nextLine ( ) ) ;
  int sum = Integer . parseInt ( input . nextLine ( ) ) ;
  int count = 0 ;
  for ( int i = 0 ;
  i < a + 1 ;
  i ++ ) {
    for ( int j = 0 ;
    j < b + 1 ;
    j ++ ) {
      for ( int k = 0 ;
      k < c + 1 ;
      k ++ ) {
        if ( ( i * 500 + j * 100 + k * 50 ) == sum ) {
          count ++ ;
        }
      }
    }
  }
  System . out . println ( count ) ;
}
