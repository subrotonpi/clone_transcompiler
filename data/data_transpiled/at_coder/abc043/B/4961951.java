public static String input ( ) {
  String newS = String . valueOf ( ) ;
  for ( int ii = 0 ;
  ii < list . length ;
  ii ++ ) {
    if ( list [ ii ] == 'B' ) {
      newS = newS . substring ( 0 , newS . length ( ) - 1 ) ;
    }
    else {
      newS += list [ ii ] ;
    }
  }
  System . out . println ( newS ) ;
  return newS ;
}
