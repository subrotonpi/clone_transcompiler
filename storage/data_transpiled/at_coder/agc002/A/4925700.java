public static int [ ] [ ] ints ( int a , int b ) {
  if ( a * b <= 0 ) {
    System . out . println ( "Zero" ) ;
    exit ( ) ;
  }
  if ( a > 0 ) {
    System . out . println ( "Positive" ) ;
    exit ( ) ;
  }
  int s = Math . abs ( a ) - Math . abs ( b ) + 1 ;
  if ( s % 2 == 0 ) {
    System . out . println ( "Positive" ) ;
  }
  else {
    System . out . println ( "Negative" ) ;
  }
  return ints ( s ) ;
}
