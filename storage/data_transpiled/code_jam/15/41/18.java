private static String LINES_PARAM = 0 ;
final String INPUT_FILE_NAME = "A-large.in" ;
final String OUTPUT_FILE_NAME = "A-large.out" ;
{
  String [ ] [ ] parsedInput ;
  {
    int result = 0 ;
    for ( int i = 0 ;
    i < parsedInput . length ;
    i ++ ) {
      for ( int j = 0 ;
      j < parsedInput [ 0 ] . length ;
      j ++ ) {
        if ( parsedInput [ i ] [ j ] != '.' ) {
          boolean up = false ;
          boolean down = false ;
          boolean right = false ;
          boolean left = false ;
          for ( int k = 0 ;
          k < i ;
          k ++ ) {
            if ( parsedInput [ k ] [ j ] != '.' ) {
              up = true ;
            }
          }
          for ( int k = i + 1 ;
          k < parsedInput . length ;
          k ++ ) {
            if ( parsedInput [ k ] [ j ] != '.' ) {
              down = true ;
            }
          }
          for ( int k = 0 ;
          k < j ;
          k ++ ) {
            if ( parsedInput [ i ] [ k ] != '.' ) {
              left = true ;
            }
          }
          for ( int k = j + 1 ;
          k < parsedInput [ 0 ] . length ;
          k ++ ) {
            if ( parsedInput [ i ] [ k ] != '.' ) {
              right = true ;
            }
          }
          if ( ! up && ! down && ! left && ! right ) {
            return "IMPOSSIBLE" ;
          }
          else if ( ( parsedInput [ i ] [ j ] == 'v' && ! down ) || ( parsedInput [ i ] [ j ] == '^' && ! up ) || ( parsedInput [ i ] [ j ] == '>' && ! right ) || ( parsedInput [ i ] [ j ] == '<' && ! left ) ) {
            result ++ ;
          }
        }
      }
    }
    return String . valueOf ( result ) ;
  }
  private List < List < String >> doParse ( String input ) {
    return Arrays . asList ( input . substring ( 1 ) . split ( "\\s+" ) ) ;
  }
  public static void main ( String [ ] args ) {
    FileReader inputReader = new FileReader ( INPUT_FILE_NAME ) ;
    StringBuilder output = new StringBuilder ( ) ;
    int numOfTestCases = Integer . parseInt ( inputReader . readLine ( ) , 10 ) ;
    BufferedReader temp = new BufferedReader ( inputReader ) ;
    int index = 0 ;
    for ( int test_case = 0