public static void main ( String input ) {
  int N = Integer . parseInt ( input ) ;
  int A = Integer . parseInt ( input ) ;
  int B = Integer . parseInt ( input ) ;
  if ( A == B ) {
    if ( N <= A ) {
      System . out . println ( "Takahashi" ) ;
    }
    else if ( N % ( A + 1 ) == 0 ) {
      System . out . println ( "Aoki" ) ;
    }
    else {
      System . out . println ( "Takahashi" ) ;
    }
  }
  else if ( A > B ) {
    System . out . println ( "Takahashi" ) ;
  }
  else {
    if ( N <= A ) {
      System . out . println ( "Takahashi" ) ;
    }
    else {
      System . out . println ( "Aoki" ) ;
    }
  }
}
