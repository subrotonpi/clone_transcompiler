public static void main ( String input , int [ ] y ) {
  int n = Integer . parseInt ( input ) , y = Integer . parseInt ( input ) ;
  int a = 0 ;
  boolean f = false ;
  while ( y - 1000 * n - 9000 * a >= 0 ) {
    int r = ( y - 1000 * n - 9000 * a ) ;
    int b = r / 4000 ;
    if ( r % 4000 == 0 && n - a - b >= 0 ) {
      System . out . println ( a + " " + b + " " + n - a - b ) ;
      f = true ;
      break ;
    }
    a ++ ;
  }
  if ( ! f ) System . out . println ( - 1 + " " + - 1 + " " + - 1 ) ;
}
