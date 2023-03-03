public static void print ( int n ) {
  int k = Integer . parseInt ( input ( ) ) ;
  int res = 1 ;
  for ( int i = 0 ;
  i < n ;
  i ++ ) {
    res = Math . min ( res * 2 , res + k ) ;
  }
  System . out . println ( res ) ;
}
