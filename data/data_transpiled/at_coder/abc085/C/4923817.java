public static void main ( String input ) {
  int n = Integer . parseInt ( input ) ;
  int y = Integer . parseInt ( input ) ;
  boolean flag = true ;
  for ( int i = 0 ;
  i < n + 1 ;
  i ++ ) {
    for ( int j = 0 ;
    j < n + 1 ;
    j ++ ) {
      int k = n - i - j ;
      if ( i * 10000 + j * 5000 + 1000 * k == y && k >= 0 ) {
        System . out . println ( i + " " + j + " " + n - i - j ) ;
        flag = false ;
        exit ( ) ;
      }
    }
  }
  if ( flag ) System . out . println ( - 1 + " " + - 1 + " " + - 1 ) ;
}
