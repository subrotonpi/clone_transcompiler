public static void print ( String input ) {
  N = Integer . parseInt ( input ) ;
  A = Integer . parseInt ( input ) ;
  B = Integer . parseInt ( input ) ;
  if ( A == B ) {
    System . out . println ( N % ( A + 1 ) > 0 ? "Takahashi" : "Aoki" ) ;
  }
  else {
    System . out . println ( N <= A || A > B ? "Takahashi" : "Aoki" ) ;
  }
}
