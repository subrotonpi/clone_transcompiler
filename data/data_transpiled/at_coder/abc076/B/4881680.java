public static void print ( int N ) {
  int K = Integer . parseInt ( input ( ) ) ;
  int num = 1 ;
  for ( int i = 0 ;
  i < N ;
  i ++ ) {
    num = Math . min ( num + K , num * 2 ) ;
  }
  System . out . println ( num ) ;
}
