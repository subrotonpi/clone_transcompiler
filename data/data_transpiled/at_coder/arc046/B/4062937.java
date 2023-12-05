public static void main ( String input ) {
  int n = Integer . parseInt ( input ) ;
  int a = Integer . parseInt ( input ) ;
  int b = Integer . parseInt ( input ) ;
  if ( a > b ) {
    System . out . println ( "Takahashi" ) ;
  }
  else if ( a == b ) {
    if ( n % ( a + 1 ) == 0 ) {
      System . out . println ( "Aoki" ) ;
    }
    else {
      System . out . println ( "Takahashi" ) ;
    }
  }
  else if ( a < b ) {
    if ( n <= a ) {
      System . out . println ( "Takahashi" ) ;
    }
    else {
      System . out . println ( "Aoki" ) ;
    }
  }
}
