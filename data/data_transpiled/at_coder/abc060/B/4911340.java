public static void main ( String input , int a , int b , int c ) {
  boolean flag = false ;
  for ( int i = 0 ;
  i < b ;
  i ++ ) {
    if ( a * i % b == c ) {
      flag = true ;
    }
  }
  if ( flag ) {
    System . out . println ( "YES" ) ;
  }
  else {
    System . out . println ( "NO" ) ;
  }
}
