public static boolean input ( ) {
  boolean w = false ;
  boolean b = false ;
  int cnt = 0 ;
  for ( int i = 0 ;
  i < s . length ( ) ;
  i ++ ) {
    if ( s . charAt ( i ) == 'B' ) {
      if ( w == true ) {
        cnt ++ ;
        w = false ;
        b = true ;
      }
      else {
        b = true ;
      }
    }
    else {
      if ( b == true ) {
        cnt ++ ;
        b = false ;
        w = true ;
      }
      else {
        w = true ;
      }
    }
  }
  System . out . println ( cnt ) ;
  return true ;
}
