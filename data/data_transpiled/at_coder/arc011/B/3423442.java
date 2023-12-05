public static int a ( ) {
  String a = Integer . parseInt ( input . nextLine ( ) ) ;
  String br [ ] = input . split ( "\\s+" ) ;
  ArrayList < String > ar = new ArrayList < String > ( ) ;
  for ( String b : br ) {
    a = "" ;
    for ( String c : list ( b ) ) {
      if ( c . equals ( "z" ) || c . equals ( "r" ) || c . equals ( "Z" ) || c . equals ( "R" ) ) {
        a = a + "0" ;
      }
      else if ( c . equals ( "b" ) || c . equals ( "c" ) || c . equals ( "B" ) || c . equals ( "C" ) ) {
        a = a + "1" ;
      }
      else if ( c . equals ( "t" ) || c . equals ( "j" ) || c . equals ( "T" ) || c . equals ( "J" ) ) {
        a = a + "3" ;
      }
      else if ( c . equals ( "l" ) || c . equals ( "v" ) || c . equals ( "L" ) || c . equals ( "V" ) ) {
        a = a + "5" ;
      }
      else if ( c . equals ( "d" ) || c . equals ( "w" ) || c . equals ( "D" ) || c . equals ( "W" ) ) {
        a = a + "2" ;
      }
      else if ( c . equals ( "f" ) || c . equals ( "q" ) || c . equals ( "F" ) || c . equals ( "Q" ) ) {
        a = a + "4" ;
      }
      else if ( c . equals ( "s" ) || c . equals ( "x" ) || c . equals ( "S" ) || c . equals ( "X" ) ) {
        a = a + "6" ;
      }
      else if ( c . equals ( "p" ) || c . equals ( "m" ) || c . equals ( "P" ) || c . equals ( "M" ) ) {
        a = a + "7" ;
      }
      else if ( c . equals ( "h" ) || c . equals ( "k" ) || c . equals ( "H" ) || c . equals ( "K" ) ) {
        a = a + "8" ;
      }
      else if ( c . equals ( "n" ) || c .