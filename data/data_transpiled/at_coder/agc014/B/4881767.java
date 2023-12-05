public static void main ( String input ) {
  int n = Integer . parseInt ( input ) ;
  int m = Integer . parseInt ( input ) ;
  HashMap < Integer , Integer > qd = new HashMap < > ( ) ;
  for ( int i = 0 ;
  i < m ;
  i ++ ) {
    int a = Integer . parseInt ( input ) ;
    int b = Integer . parseInt ( input ) ;
    if ( ! qd . containsKey ( a ) ) {
      qd . put ( a , 1 ) ;
    }
    else {
      qd . get ( a ) ++ ;
    }
    if ( ! qd . containsKey ( b ) ) {
      qd . put ( b , 1 ) ;
    }
    else {
      qd . get ( b ) ++ ;
    }
  }
  if ( Arrays . asList ( qd . values ( ) ) . contains ( a % 2 ) ) {
    System . out . println ( "YES" ) ;
  }
  else {
    System . out . println ( "NO" ) ;
  }
}
