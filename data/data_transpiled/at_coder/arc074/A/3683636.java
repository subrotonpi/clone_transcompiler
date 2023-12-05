public static int calcT ( int h , int w ) {
  if ( ! ( h % 3 ) * ( w % 3 ) ) {
    System . out . println ( 0 ) ;
    exit ( ) ;
  }
  return Math . min ( h , w ) ;
}
