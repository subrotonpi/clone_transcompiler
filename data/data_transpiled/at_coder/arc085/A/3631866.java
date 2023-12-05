public static void main ( String input ) {
  int N , M = map ( Integer . parseInt ( input ) , N ) ;
  double p = 2 * M ;
  double ans = p * ( 1900 * M + 100 * ( N - M ) ) ;
  System . out . println ( ans ) ;
}
