static final String solve ( ) throws Exception {
  final Scanner input = new Scanner ( System . in ) ;
  final Scanner output = new Scanner ( input ) ;
  class Solver {
    int size ;
    int index ;
    int index ;
    int result ;
    Solver ( int size , index , solution ) {
      size = input . nextInt ( ) ;
      System . out . println ( Integer . toString ( size ) ) ;
      for ( index = 0 ;
      index < size ;
      index ++ ) {
        BCase case = new BCase ( input ) ;
        result = case . solve ( ) ;
        System . out . println ( "Case #" + ( index + 1 ) + ": " + result ) ;
        output . println ( "Case #" + ( index + 1 ) + ": " + result ) ;
      }
    }
    type = "B" ;
    if ( ( index = input . nextInt ( ) ) == 0 ) {
      size = "-small-attempt0" ;
    }
    else {
      size = "-large" ;
    }
    String filename = "..\\" + type + ".in" ;
    input = new Scanner ( input ) ;
    output = new PrintWriter ( new FileWriter ( filename ) ) ;
    try {
      Solver ( input , output ) ;
    }
    catch ( Exception e ) {
      System . out . println ( "Unexpected error:" + e ) ;
      throw e ;
    }
    finally {
      input . close ( ) ;
      output . close ( ) ;
    }
  }
  class ACase {
    int amountOfPoints = Integer . parseInt ( input . nextLine ( ) ) ;
    int [ ] [ ] points = new int [ amountOfPoints ] [ ] ;
    for ( int i = 0 ;
    i < amountOfPoints ;
    i ++ ) {
      points [ i ] = Integer . parseInt ( input . nextLine ( ) . trim ( ) ) ;
    }
  }
  int [ ] current = {
    0 , 0 , 0 , 0 , 0 }
    ;
    for ( int i = 0 ;
    i < points . length ;
    i ++ ) {
      for ( int j = 0 ;
      j < points [ i ] . length ;
      j ++ ) {
        current [ j ] = current [ j ] + points [ i ] [ j ] ;
      }
    }
    for ( int j = 0 ;
    j < current . length ;
    j ++ ) {
      current [ j ] /= amountOfPoints ;
    }
    if ( ( ( current [ 3 ] * current [ 3 ] + current [ 4 ] * current [ 4 ] + current [ 5 ] * current [ 5 ] ) > 0 ) ) {
      double t