public static void N ( ) {
  int N = Integer . parseInt ( input ( ) ) ;
  int [ ] m = map ( N , input ( ) ) ;
  int ans = 0 ;
  for ( int p : m ) {
    ans += max ( 0 , 80 - p ) ;
  }
  System . out . println ( ans ) ;
}
