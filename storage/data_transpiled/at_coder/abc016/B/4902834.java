public static void main ( String [ ] args ) {
  int a , b , c ;
  for ( int i = 0 ;
  i < input . length ;
  i ++ ) {
    if ( a + b != c && a - b != c ) {
      System . out . println ( "!" ) ;
    }
    else if ( a + b != c ) {
      System . out . println ( "-" ) ;
    }
    else if ( a - b != c ) {
      System . out . println ( "+" ) ;
    }
    else {
      System . out . println ( "?" ) ;
    }
  }
}
