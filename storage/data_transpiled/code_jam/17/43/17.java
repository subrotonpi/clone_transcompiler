static int LINES_PARAM = 0 ;
final String INPUT_FILE_NAME = "C-small-attempt4.in" ;
final String OUTPUT_FILE_NAME = "C-small-attempt4.out" ;
{
  boolean seen = false ;
  int k = i ;
  boolean vis = true ;
  for ( int j = i + 1 ;
  j < a . length ;
  j ++ ) {
    if ( a [ j ] . equals ( "|" ) || a [ j ] . equals ( "-" ) && vis ) {
      if ( seen ) return i ;
      k = j ;
      seen = true ;
    }
    if ( a [ j ] . equals ( "#" ) ) {
      vis = false ;
    }
  }
  StringBuilder sb = new StringBuilder ( ) ;
  for ( int i = 0 ;
  i < R ;
  i ++ ) {
    sb . append ( "\n" ) ;
    sb . append ( input . toString ( ) ) ;
  }
  StringBuilder output = new StringBuilder ( ) ;
  int num_of_test_cases = Integer . parseInt ( sb . toString ( ) , 10 ) ;
  String [ ] temp = new String [ C ] ;
  int index = 0 ;
  for ( int j = 0 ;
  j < num_of_test_cases ;
  j ++ ) {
    int lines = Integer . parseInt ( temp [ index ++ ] . replaceAll ( " " , "" ) ) ;
    String [ ] parsed_input = doParse ( temp , index , lines + 1 ) ;
    index = index + 1 + lines ;
    output . append ( "Case #" + Integer . toString ( j ) + ": " + doCase ( parsed_input ) ) ;
  }
  StringBuilder outputBuilder = new StringBuilder ( ) ;
  for ( int t = 0 ;
  t < C ;
  t ++ ) {
    for ( int j = 0 ;
    j < C ;
    j ++ ) {
      if ( ( a [ j ] . equals ( "|" ) || a [ j ] . equals ( "-" ) ) && vis ) {
        if ( seen ) return i ;
        k = j ;
        seen = true ;
      }
      if ( a [ j ] . equals ( "#" ) ) {
        vis = false ;
      }
    }
  }
  return k ;
}
