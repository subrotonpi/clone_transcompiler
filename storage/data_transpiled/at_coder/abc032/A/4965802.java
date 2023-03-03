public static void print ( ) {
  int a = Integer . parseInt ( input ( ) ) ;
  int b = Integer . parseInt ( input ( ) ) ;
  int n = Integer . parseInt ( input ( ) ) ;
  int ans = 0 ;
  for ( int i = n ;
  i < 100000 ;
  i ++ ) {
    if ( i % a == 0 && i % b == 0 ) {
      ans = i ;
      break ;
    }
  }
  System . out . println ( ans ) ;
}
