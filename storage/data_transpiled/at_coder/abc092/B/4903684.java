public static void main ( String input ) {
  int n = Integer . parseInt ( input ) ;
  int a = Integer . parseInt ( input ) ;
  int b = Integer . parseInt ( input ) ;
  int c = 0 ;
  for ( int i = 0 ;
  i < n ;
  i ++ ) {
    int d = Integer . parseInt ( input ) ;
    int e = 0 ;
    while ( d * e + 1 <= a ) {
      c ++ ;
      e ++ ;
    }
  }
  System . out . println ( c + b ) ;
}
