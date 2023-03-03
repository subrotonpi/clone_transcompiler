public static void main ( String input ) {
  int n , k = Integer . parseInt ( input . split ( " " ) ) ;
  int a = k - 1 ;
  int b = n - k ;
  System . out . println ( ( a * b * 6 + a * 3 + b * 3 + 1 ) / n * * 3 ) ;
}
