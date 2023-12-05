public static void input ( String s ) {
  int x , y ;
  s = input . split ( "T" ) ;
  x -= s . substring ( 0 , 1 ) . length ( ) ;
  s . removeFirst ( ) ;
  List < Integer > listYoko = new ArrayList < > ( ) ;
  for ( int i = 1 ;
  i < s . length ( ) ;
  i += 2 ) listYoko . add ( s . substring ( i , i + 1 ) ) ;
  List < Integer > listTate = new ArrayList < > ( ) ;
  for ( int i = 0 ;
  i < s . length ( ) ;
  i += 2 ) listTate . add ( s . substring ( i , i + 1 ) ) ;
  if ( listYoko . isEmpty ( ) ) listYoko = new ArrayList < > ( 0 ) ;
  if ( listTate . isEmpty ( ) ) listTate = new ArrayList < > ( 0 ) ;
  Set < Integer > setYoko = new HashSet < > ( ) ;
  setYoko . add ( listYoko . get ( 0 ) ) ;
  setTate . add ( listTate . get ( 0 ) ) ;
  for ( int i = 1 ;
  i < listYoko . size ( ) ;
  i ++ ) {
    Set < Integer > sy = new HashSet < > ( ) ;
    for ( int j : setYoko ) sy . add ( j + i ) ;
    setYoko . add ( j - listTate . get ( i ) ) ;
    setYoko = sy ;
  }
  for ( int i = 1 ;
  i < listTate . size ( ) ;
  i ++ ) {
    Set < Integer > st = new HashSet < > ( ) ;
    for ( int j : setTate ) st . add ( j + i ) ;
    setTate . add ( st ) ;
  }
  if ( ( setYoko . contains ( x ) ) && ( setTate . contains ( y ) ) ) System . out . println ( "Yes" ) ;
  else System . out . println ( "No" ) ;
}
