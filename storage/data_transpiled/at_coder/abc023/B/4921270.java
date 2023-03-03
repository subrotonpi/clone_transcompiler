public static int N = Integer . parseInt ( input ) {
  String S = input . next ( ) ;
  String s = "b" ;
  if ( s . equals ( S ) ) {
    System . out . println ( 0 ) ;
  }
  else {
    for ( int i = 0 ;
    i < 100 ;
    i ++ ) {
      if ( i % 3 == 0 ) {
        s = "a" + s + "c" ;
      }
      else if ( i % 3 == 1 ) {
        s = "c" + s + "a" ;
      }
      else {
        s = "b" + s + "b" ;
      }
      if ( s . length ( ) >= S . length ( ) ) {
        if ( s . equals ( S ) ) {
          System . out . println ( i + 1 ) ;
        }
        else {
          System . out . println ( - 1 ) ;
        }
        break ;
      }
    }
  }
  return N ;
}
