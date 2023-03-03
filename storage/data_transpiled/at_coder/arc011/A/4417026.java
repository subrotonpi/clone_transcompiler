public static void main ( String input ) {
  int m = Integer . parseInt ( input ) ;
  int n = Integer . parseInt ( input ) ;
  int N = Integer . parseInt ( input ) ;
  int d = N ;
  int s = N ;
  while ( d / m > 0 ) {
    s += d / m * n ;
    d = d % m + d / m * n ;
  }
  System . out . println ( s ) ;
}
