public static void main ( String input , int a , int b , int c ) {
  boolean found = false ;
  for ( int i = 1 ;
  i <= b ;
  i ++ ) {
    if ( ( a * i ) % b == c ) {
      found = true ;
    }
  }
  if ( found ) {
    System . out . println ( "YES" ) ;
  }
  else {
    System . out . println ( "NO" ) ;
  }
}
