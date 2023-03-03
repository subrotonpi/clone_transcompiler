public static int X ( int A , int B ) {
  if ( B <= A ) {
    System . out . println ( "delicious" ) ;
  }
  else if ( B <= A + X ) {
    System . out . println ( "safe" ) ;
  }
  else {
    System . out . println ( "dangerous" ) ;
  }
  return A ;
}
