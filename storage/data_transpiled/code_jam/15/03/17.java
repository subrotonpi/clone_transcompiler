) @ __author__ ( "Reuben" ) public static String solution ( String string , int repeats ) throws IOException {
  if ( evalStringRepeated ( string , repeats ) != new Integer ( 1 ) ) return "NO" ;
  boolean iFound = false ;
  boolean jFound = false ;
  String s = string . length ( ) * Math . min ( repeats , 8 ) ;
  for ( int i = 0 ;
  iFound && jFound ;
  i ++ ) {
    for ( int j = i + 1 ;
    j < s . length ( ) ;
    j ++ ) {
      if ( evalString ( s . substring ( 0 , i + 1 ) ) . equals ( new Integer ( "i" ) ) && evalString ( s . substring ( i + 1 , j + 1 ) ) . equals ( new Integer ( "j" ) ) ) return "YES" ;
    }
  }
  return "NO" ;
}
