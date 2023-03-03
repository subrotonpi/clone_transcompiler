public static void main ( String [ ] args ) {
  int N , M = map ( Integer . parseInt , input ( ) ) ;
  int once = 100 * ( N - M ) + 1900 * M ;
  int P = 2 * M ;
  int ans = once * P ;
  System . out . println ( ans ) ;
}
