public static String print ( int N ) {
  ArrayList < String > l = new ArrayList < String > ( ) ;
  String a = input . next ( ) ;
  l . add ( a ) ;
  String b = "" ;
  int f = 1 ;
  int shori = - 1 ;
  for ( int i = 0 ;
  i < N - 1 ;
  i ++ ) {
    b = input . next ( ) ;
    if ( f == 0 ) {
      if ( a . length ( ) != b . length ( ) || l . indexOf ( b ) > 0 ) {
        if ( shori == - 1 ) shori = 0 ;
      }
      f = 1 ;
    }
    else {
      if ( a . length ( ) != b . length ( ) || l . indexOf ( b ) > 0 ) {
        if ( shori == - 1 ) shori = 1 ;
      }
      f = 0 ;
    }
    a = b ;
    l . add ( b ) ;
  }
  if ( shori == 0 ) {
    System . out . println ( "LOSE" ) ;
  }
  else if ( shori == 1 ) {
    System . out . println ( "WIN" ) ;
  }
  else {
    System . out . println ( "DRAW" ) ;
  }
  return l . get ( 0 ) ;
}
