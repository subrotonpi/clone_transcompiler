public static void main ( String input ) {
  int n = Integer . parseInt ( input ) ;
  Map < Integer , Integer > a = new HashMap < > ( ) ;
  for ( int i = 0 ;
  i < n ;
  i ++ ) {
    a . put ( i + 1 , Integer . parseInt ( input ) ) ;
  }
  int x = 1 ;
  for ( int i = 0 ;
  i < n ;
  i ++ ) {
    x = a . get ( x ) ;
    if ( x == 2 ) {
      System . out . println ( i + 1 ) ;
      break ;
    }
  }
  else {
    System . out . println ( - 1 ) ;
  }
}
