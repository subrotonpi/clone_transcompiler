public static String hoa = list ( input ) ;
String hob = list ( input ) ;
String hoc = list ( input ) ;
String f = "A" ;
while ( true ) {
  if ( ( f . equals ( "A" ) && hoa . length ( ) == 0 ) ) {
    System . out . println ( f ) ;
    break ;
  }
  else if ( ( f . equals ( "B" ) && hob . length ( ) == 0 ) ) {
    System . out . println ( f ) ;
    break ;
  }
  else if ( ( f . equals ( "C" ) && hoc . length ( ) == 0 ) ) {
    System . out . println ( f ) ;
    break ;
  }
  else if ( ( f . equals ( "A" ) ) && ( hoa . charAt ( 0 ) == 'a' ) ) {
    f = "A" ;
    hoa = hoa . substring ( 1 ) ;
  }
  else if ( ( f . equals ( "B" ) ) && ( hoa . charAt ( 0 ) == 'b' ) ) {
    f = "B" ;
    hoa = hoa . substring ( 1 ) ;
  }
  else if ( ( f . equals ( "C" ) ) && ( hob . charAt ( 0 ) == 'c' ) ) {
    f = "C" ;
    hoa = hob . substring ( 1 ) ;
  }
  else if ( ( f . equals ( "B" ) ) && ( hob . charAt ( 0 ) == 'a' ) ) {
    f = "A" ;
    hob = hob . substring ( 1 ) ;
  }
  else if ( ( f . equals ( "B" ) ) && ( hob . charAt ( 0 ) == 'b' ) ) {
    f = "B" ;
    hob = hob . substring ( 1 ) ;
  }
  else if ( ( f . equals ( "C" ) ) && ( hoc . charAt ( 0 ) == 'c' ) ) {
    f = "C" ;
    hob = hob . substring ( 1 ) ;
  }
  else if ( ( f . equals ( "C" ) ) && ( hoc . charAt ( 0 ) == 'a' ) ) {
    f = "A" ;
    hoc = hoc . substring ( 1 ) ;
  }
  return f ;
}
