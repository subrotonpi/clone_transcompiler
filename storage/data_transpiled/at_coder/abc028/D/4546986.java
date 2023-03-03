public static void main ( String input ) {
  int n , k = map ( Integer . parseInt , input . split ( " " ) ) ;
  System . out . println ( ( 6 * ( k - 1 ) * ( n - k ) + 3 * n - 2 ) / n * * 3 ) ;
}
