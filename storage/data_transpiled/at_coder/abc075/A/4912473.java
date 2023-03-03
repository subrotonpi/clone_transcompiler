@ Nullable public static String print ( @ NotNull String s ) {
  int A = Integer . parseInt ( s ) ;
  int B = Integer . parseInt ( s ) ;
  int C = Integer . parseInt ( s ) ;
  if ( A != B && B == C ) {
    System . out . println ( A ) ;
  }
  else if ( A == B && B != C ) {
    System . out . println ( C ) ;
  }
  else {
    System . out . println ( B ) ;
  }
  return s ;
}
