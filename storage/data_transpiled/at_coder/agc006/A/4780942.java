public static void print ( String s , String t ) {
  n = Integer . parseInt ( input . nextLine ( ) ) ;
  s = s . trim ( ) ;
  t = t . trim ( ) ;
  boolean isMatch = false ;
  for ( int i = 0 ;
  i < s . length ( ) ;
  i ++ ) {
    if ( s . substring ( i ) . equals ( t . substring ( 0 , n - i ) ) ) {
      isMatch = true ;
      break ;
    }
  }
  if ( isMatch ) {
    System . out . println ( s . substring ( 0 , i ) + t . length ( ) ) ;
  }
  else {
    System . out . println ( s . length ( ) + t . length ( ) ) ;
  }
}
