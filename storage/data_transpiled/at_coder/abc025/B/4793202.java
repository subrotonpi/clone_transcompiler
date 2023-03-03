public static void print ( int n , int a , int b ) {
  int pos = 0 ;
  for ( int i = 0 ;
  i < n ;
  i ++ ) {
    String s = input . next ( ) ;
    int d = Math . min ( b , Math . max ( a , Integer . MAX_VALUE ) ) ;
    if ( s . equals ( "East" ) ) {
      pos += d ;
    }
    else {
      pos -= d ;
    }
  }
  if ( pos > 0 ) {
    System . out . println ( "East" + pos ) ;
  }
  else if ( pos < 0 ) {
    System . out . println ( "West" + - pos ) ;
  }
  else {
    System . out . println ( 0 ) ;
  }
}
