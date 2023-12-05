public static void print ( int N ) {
  int K = Integer . parseInt ( input ( ) ) ;
  int tmp = 1 ;
  for ( int i = 0 ;
  i <= N ;
  i ++ ) {
    tmp = Math . min ( tmp + K , tmp * 2 ) ;
  }
  System . out . println ( tmp ) ;
}
