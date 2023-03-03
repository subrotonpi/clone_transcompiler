static final Scanner getScanner ( final Scanner input , final PrintWriter output ) {
  final int [ ] current = new int [ 5 ] ;
  final int t ;
  final int [ ] [ ] temp = new int [ 5 ] [ 5 ] ;
  int [ ] [ ] temp = new int [ 5 ] [ 5 ] ;
  int [ ] [ ] temp = new int [ 5 ] [ 5 ] ;
  for ( int i = 0 ;
  i < temp . length ;
  i ++ ) {
    temp [ i ] = input . nextLine ( ) . trim ( ) ;
  }
  final int [ ] [ ] solution = new int [ 2 ] [ 3 ] ;
  int nextIndex = 1 ;
  final HashMap < String , Integer > indexedLetters = new HashMap < > ( ) ;
  for ( int i = 0 ;
  i < temp . length ;
  i ++ ) {
    for ( int j = 0 ;
    j < temp [ i ] . length ;
    j ++ ) {
      current [ i ] [ j ] = temp [ i ] [ j ] ;
    }
  }
  for ( int j = 0 ;
  j < temp . length ;
  j ++ ) {
    if ( ( temp [ i ] [ j ] == 1 ) && ( temp [ i ] [ j ] == 0 ) ) {
      nextIndex = 0 ;
    }
    else {
      if ( ( temp [ i ] [ j ] == 0 ) && ( temp [ i ] [ j ] == 0 ) ) {
        nextIndex = 2 ;
      }
      else {
        nextIndex ++ ;
      }
    }
  }
  final String type = "C" ;
  if ( ( nextIndex = 1 ) && ( temp [ i ] [ j ] == 0 ) ) {
    size = "-small-attempt0" ;
  }
  else {
    size = "-large" ;
  }
  final String filename = "..\\" + type + ".in" ;
  final Scanner input = new Scanner ( new File ( filename ) ) ;
  final PrintWriter output = new PrintWriter ( new BufferedWriter ( new OutputStreamWriter ( new FileWriter ( output ) ) ) ) ;
  try {
    new Solver ( input , output ) ;
  }
  catch ( final Exception e ) {
    System . err . println ( "Unexpected error:" + e ) ;
    throw e ;
  }
  finally {
    input . close ( ) ;
    output . close ( ) ;
  }
  return new Scanner ( new File ( filename ) ) ;
}
