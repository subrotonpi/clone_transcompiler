public static void print ( int n ) {
  int ans = 10 ;
  for ( int i = 0 ;
  i < Math . min ( 10 * 5 , n ) ;
  i ++ ) {
    if ( n % ( i + 1 ) == 0 ) ans = Math . min ( ans , Math . max ( Integer . toString ( i + 1 ) . length ( ) , Integer . toString ( n / ( i + 1 ) ) . length ( ) ) ) ;
  }
  System . out . println ( ans ) ;
}
