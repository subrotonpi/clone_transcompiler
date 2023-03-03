public static List < Integer > convert ( String input ) {
  int E = Integer . parseInt ( input ) ;
  int B = Integer . parseInt ( input ) ;
  List < Integer > L = Lists . newArrayList ( ) ;
  for ( int i = 0 ;
  i < 6 ;
  i ++ ) {
    if ( E . contains ( L . get ( i ) ) ) {
      num ++ ;
    }
    if ( L . contains ( B ) ) {
      b = true ;
    }
  }
  if ( num == 6 ) {
    System . out . println ( "1" ) ;
  }
  else if ( num == 5 && b ) {
    System . out . println ( "2" ) ;
  }
  else if ( num == 5 ) {
    System . out . println ( "3" ) ;
  }
  else if ( num == 4 ) {
    System . out . println ( "4" ) ;
  }
  else if ( num == 3 ) {
    System . out . println ( "5" ) ;
  }
  else {
    System . out . println ( "0" ) ;
  }
  return L ;
}
