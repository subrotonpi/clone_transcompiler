public static void main ( int n , int lower , int upper ) {
  int res = 0 ;
  for ( int i = 0 ;
  i < n ;
  i ++ ) {
    String [ ] step = input . split ( " " ) ;
    int offset ;
    if ( step [ 0 ] . equals ( "West" ) ) {
      offset = - 1 ;
    }
    else if ( step [ 0 ] . equals ( "East" ) ) {
      offset = 1 ;
    }
    if ( Integer . parseInt ( step [ 1 ] ) < lower ) {
      res += lower * offset ;
    }
    else if ( Integer . parseInt ( step [ 1 ] ) > upper ) {
      res += upper * offset ;
    }
    else {
      res += Integer . parseInt ( step [ 1 ] ) * offset ;
    }
  }
  if ( res == 0 ) {
    System . out . println ( 0 ) ;
  }
  else if ( res > 1 ) {
    System . out . println ( "East " + String . valueOf ( res ) ) ;
  }
  else {
    System . out . println ( "West " + String . valueOf ( Math . abs ( res ) ) ) ;
  }
}
