public static void print ( ) {
  n = Integer . parseInt ( input ( ) ) ;
  k = Integer . parseInt ( input ( ) ) ;
  int num = 1 ;
  for ( int i = 0 ;
  i < n ;
  i ++ ) {
    num = Math . min ( num + k , num * 2 ) ;
  }
  System . out . println ( num ) ;
}
