public static void main ( ) {
  N = Integer . parseInt ( input ( ) ) ;
  S = input ( ) ;
  int ans = 0 ;
  for ( int i = 0 ;
  i < N + 1 ;
  i ++ ) {
    int tmp = new HashSet ( S . subList ( 0 , i ) ) . size ( ) ;
    if ( tmp > ans ) ans = tmp ;
  }
  System . out . println ( ans ) ;
}
