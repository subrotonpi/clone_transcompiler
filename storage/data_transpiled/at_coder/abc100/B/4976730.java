public static void main ( String D , int N ) {
  int ans = Integer . parseInt ( input ( ) . split ( " " ) ) ;
  ans = N * 100 * D ;
  if ( N == 100 ) {
    ans += 1 * 100 * D ;
  }
  System . out . println ( ans ) ;
}
