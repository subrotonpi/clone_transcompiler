public static String solver ( int x , int r , int c ) {
  if ( x > 6 ) return "RICHARD" ;
  if ( ( r * c ) % x != 0 ) return "RICHARD" ;
  if ( x <= 2 ) return "GABRIEL" ;
  if ( x == 3 ) {
    if ( Math . min ( r , c ) > 1 ) return "GABRIEL" ;
    else return "RICHARD" ;
  }
  if ( x == 4 ) {
    if ( Math . min ( r , c ) > 2 ) return "GABRIEL" ;
    else return "RICHARD" ;
  }
  if ( x == 5 ) {
    if ( Math . min ( r , c ) > 2 && r + c > 8 ) return "GABRIEL" ;
    else return "RICHARD" ;
  }
  if ( x == 6 ) {
    if ( Math . min ( r , c ) > 3 ) return "GABRIEL" ;
    else return "RICHARD" ;
  }
  final Scanner fileIN = new Scanner ( System . in ) ;
  final List < String > inputLines = fileIN . nextLine ( ) . split ( "\\s+" ) ;
  final List < String > inputLines = new ArrayList < > ( ) ;
  for ( final String line : inputLines ) {
    inputLines . add ( line . trim ( ) ) ;
  }
  final PrintWriter fileOUT = new PrintWriter ( System . out ) ;
  final int numberOfCases = Integer . parseInt ( inputLines . remove ( 0 ) ) ;
  for ( int num = 0 ;
  num < numberOfCases ;
  num ++ ) {
    final String [ ] inputlist = inputLines . remove ( 0 ) . replaceAll ( "\\s+" , "" ) . split ( "\\s+" ) ;
    x = Integer . parseInt ( inputlist [ 0 ] ) ;
    r = Integer . parseInt ( inputlist [ 1 ] ) ;
    c = Integer . parseInt ( inputlist [ 2 ] ) ;
    fileOUT . println ( "Case #" + ( num + 1 ) + ": " + solver ( x , r , c ) ) ;
  }
  return "" ;
}
