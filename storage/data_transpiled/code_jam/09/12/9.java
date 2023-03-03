static public void main ( String [ ] argv ) throws IOException {
  String ifilename = argv [ 0 ] ;
  String ofilename = argv [ 1 ] ;
  BufferedReader ireader = new BufferedReader ( new FileReader ( ifilename ) ) ;
  PrintWriter ofile = new PrintWriter ( new BufferedWriter ( new FileWriter ( ofilename ) ) ) ;
  String numlines = ireader . readLine ( ) . trim ( ) ;
  Solver solver = new Solver ( ) ;
  for ( int i = 0 ;
  i < numlines ;
  i ++ ) {
    String nm [ ] = ireader . readLine ( ) . trim ( ) . split ( "\\s+" ) ;
    int N = Integer . parseInt ( nm [ 0 ] ) ;
    int M = Integer . parseInt ( nm [ 1 ] ) ;
    if ( minimum == - 1 || crossingt < minimum ) {
      minimum = crossingt ;
      xn = x + 2 ;
      yn = y - 1 ;
    }
    int crossingt = times [ y ] [ x ] + intersections [ m ] . nextGreenEW ( times [ y ] [ x ] ) + 1 ;
    if ( minimum == - 1 || crossingt < minimum ) {
      minimum = crossingt ;
      xn = x ;
      yn = y ;
    }
    for ( int j = 0 ;
    j < N ;
    j ++ ) {
      int [ ] interrow = new int [ j ] ;
      String row [ ] = ireader . readLine ( ) . trim ( ) . split ( "\\s+" ) ;
      for ( int k = 0 ;
      k < M * 3 ;
      k += 3 ) {
        int inter = new Intersection ( Integer . parseInt ( row [ k ] ) , Integer . parseInt ( row [ k + 1 ] ) , Integer . parseInt ( row [ k + 2 ] ) ) ;
        if ( minimum == - 1 || crossingt < minimum ) {
          minimum = crossingt ;
          xn = x ;
          yn = y - 1 ;
        }
      }
    }
    times [ yn ] [ xn ] = minimum ;
  }
  class Intersection {
    int S = 0 ;
    int W = 0 ;
    int T = 0 ;
  }
  {
    int t = 0 ;
    int N = 0 ;
    int M = 0 ;
    /* solve */
    int N = t - T ;
    if ( t < 0 ) {
      t = ( t % - ( S + W ) ) + ( S + W ) ;
    }
    if ( t < 0 ) {
      return ;
    }
    else {
      return ( S + W ) - t ;
    }
  }
  /* nextGreenEW() */
  