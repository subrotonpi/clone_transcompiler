public static void main ( ) {
  int N = Integer . parseInt ( input ( ) ) ;
  int K = Integer . parseInt ( input ( ) ) ;
  int ans = 1 ;
  for ( int i = 0 ;
  i < N ;
  i ++ ) {
    int a = 2 * ans ;
    int b = ans + K ;
    ans = Math . min ( a , b ) ;
  }
  System . out . println ( ans ) ;
}
