static final String getFilePath ( ) throws FileNotFoundException {
  System . nanoTime ( ) ;
  System . setIn ( new FileInputStream ( "B-small-attempt1.in" ) ) ;
  System . setOut ( new PrintStream ( "B-small-attempt1.out" ) ) ;
  /* Work in case of an input file */
  String [ ] inp = input . nextLine ( ) . split ( " " ) ;
  int n = Integer . parseInt ( inp [ 0 ] ) ;
  float X = Float . parseFloat ( inp [ 1 ] ) ;
  float C = Float . parseFloat ( inp [ 2 ] ) ;
  float [ ] [ ] ss = new float [ n ] [ 2 ] ;
  for ( int i = 0 ;
  i < n ;
  i ++ ) {
    ss [ i ] = new float [ 3 ] ;
    for ( int j = 0 ;
    j < 3 ;
    j ++ ) {
      ss [ i ] [ j ] = Float . parseFloat ( input . nextLine ( ) ) ;
    }
    if ( ss . length == 2 ) {
      float a = ss [ 0 ] [ 1 ] ;
      float b = ss [ 1 ] [ 1 ] ;
      if ( a == b ) {
        ss = new float [ 2 ] [ 2 ] ;
        for ( int j = 0 ;
        j < 3 ;
        j ++ ) {
          float alpha = ( C - b ) / ( a - b ) ;
          if ( ! 0 <= alpha && alpha <= 1 ) return "IMPOSSIBLE" ;
          return Math . max ( X * alpha / ss [ 0 ] [ 0 ] , X * ( 1 - alpha ) / ss [ 1 ] [ 0 ] ) ;
        }
      }
      else {
        float alpha = ( C - b ) / ( a - b ) ;
        if ( ! 0 <= alpha && alpha <= 1 ) return "IMPOSSIBLE" ;
        return String . format ( "%.12f" , Math . max ( X * alpha / ss [ 0 ] [ 0 ] , X * ( 1 - alpha ) / ss [ 1 ] [ 0 ] ) ) ;
      }
    }
    if ( ss . length == 1 ) {
      if ( ss [ 0 ] [ 1 ] != C ) return "IMPOSSIBLE" ;
      return String . format ( "%.12f" , X / ss [ 0 ] [ 0 ] ) ;
    }
    return "" ;
  }
  if ( className . equals ( "B-small-attempt1.in" ) ) {
    int T = Integer . parseInt