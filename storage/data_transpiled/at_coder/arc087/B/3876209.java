public static boolean input ( ) {
  s = input ;
  x = Integer . parseInt ( input . readLine ( ) ) ;
  y = Integer . parseInt ( input . readLine ( ) ) ;
  ArrayList < Integer > MoveX = new ArrayList < Integer > ( ) , MoveY = new ArrayList < Integer > ( ) ;
  String dir = "X" ;
  int count = 0 ;
  for ( int i = 0 ;
  i < s . length ( ) ;
  i ++ ) {
    if ( s . charAt ( i ) == 'T' ) {
      if ( count > 0 ) {
        if ( dir . equals ( "X" ) ) MoveX . add ( count ) ;
        else MoveY . add ( count ) ;
        count = 0 ;
        dir = ( dir . equals ( "X" ) ? "Y" : "X" ) ;
      }
      else count ++ ;
    }
  }
  if ( s . charAt ( s . length ( ) - 1 ) == 'F' ) {
    if ( dir . equals ( "X" ) ) MoveX . add ( count ) ;
    else MoveY . add ( count ) ;
  }
  int iniX = 0 ;
  if ( s . charAt ( 0 ) == 'F' ) {
    iniX = MoveX . remove ( 0 ) ;
  }
  return canMove . contains ( iniX ) ;
}
