public static int A , int B = Integer . parseInt ( input . nextLine ( ) ) {
  if ( A == 1 ) {
    A += 13 ;
  }
  if ( B == 1 ) {
    B += 13 ;
  }
  return A > B ? "Alice" : A == B ? "Draw" : "Bob" ;
}
