public static int getInt ( ) {
  int a = Integer . parseInt ( input . nextLine ( ) ) ;
  int b = Integer . parseInt ( input . nextLine ( ) ) ;
  int ans = 0 ;
  for ( int i = a ;
  i <= b ;
  i ++ ) {
    String tmp = String . valueOf ( i ) ;
    if ( tmp . charAt ( 0 ) == tmp . charAt ( tmp . length ( ) - 1 ) && tmp . charAt ( 1 ) == tmp . charAt ( tmp . length ( ) - 2 ) ) {
      ans ++ ;
    }
  }
  return ans ;
}
