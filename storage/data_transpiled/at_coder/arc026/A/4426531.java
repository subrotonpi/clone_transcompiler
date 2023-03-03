public static void main ( String input ) {
  int n = Integer . parseInt ( input ) ;
  int a = Integer . parseInt ( input ) ;
  int b = Integer . parseInt ( input ) ;
  if ( n <= 5 ) {
    System . out . println ( b * n ) ;
  }
  else {
    System . out . println ( b * 5 + ( n - 5 ) * a ) ;
  }
}
