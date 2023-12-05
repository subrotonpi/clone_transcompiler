public static void print ( int n , int a , int b ) {
  int pos = 0 ;
  for ( int i = 0 ;
  i < n ;
  i ++ ) {
    String s = input . next ( ) ;
    int d = Integer . parseInt ( s ) ;
    d = Integer . parseInt ( d ) ;
    if ( d < a ) d = a ;
    else if ( d > b ) d = b ;
    d = s . equals ( "East" ) ? d : - d ;
    pos += d ;
  }
  if ( pos == 0 ) System . out . println ( 0 ) ;
  else if ( pos > 0 ) System . out . println ( "East " + pos ) ;
  else System . out . println ( "West " + - pos ) ;
}
