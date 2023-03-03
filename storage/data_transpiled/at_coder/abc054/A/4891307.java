public static String print ( int A , int B ) {
  String result ;
  if ( A == B ) {
    result = "Draw" ;
  }
  else if ( ( A < B && A != 1 ) || B == 1 ) {
    result = "Bob" ;
  }
  else {
    result = "Alice" ;
  }
  return result ;
}
