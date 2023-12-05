static void main ( String infilename , Class < ? extends Problem > problemclasstype , String outfilename ) {
  System . out . println ( "Parsing " + infilename + " to " + outfilename ) ;
  int i ;
  int j [ ] [ ] = new int [ 1 << this . R ] [ 2 ] ;
  BufferedReader infilereader = new BufferedReader ( new FileReader ( infilename ) ) ;
  PrintWriter outfilewriter = new PrintWriter ( outfilename ) ;
  int N = Integer . parseInt ( infilereader . readLine ( ) ) ;
  for ( i = 0 ;
  i < N ;
  i ++ ) {
    System . out . println ( "Case #" + ( i + 1 ) ) ;
    Problem problem = problemclasstype . cast ( infilereader . readLine ( ) ) ;
    String solution = problem . solution ( ) ;
    System . out . println ( solution ) ;
    outfilewriter . println ( "Case #" + ( i + 1 ) + ".in" ) ;
    outfilewriter . println ( "Case #" + ( i + 1 ) + ".out" ) ;
    CodeJamSolver . main ( infilename , problemd , outfilename ) ;
  }
  infilereader . close ( ) ;
  outfilewriter . close ( ) ;
  /* Run the code */
  if ( ( c + d ) % 3 != 0 ) {
    /* Run the code */
    int a = ( 2 * d - c ) / 3 ;
    int b = ( 2 * c - d ) / 3 ;
    int x = 1 ;
    for ( int y = 0 ;
    y < a ;
    y ++ ) {
      x *= ( a + b - y ) ;
      x /= ( y + 1 ) ;
    }
    return x ;
  }
  class ProblemD {
    int [ ] params = new int [ 2 ] ;
    int H = params [ 0 ] ;
    int W = params [ 1 ] ;
    int R = params [ 2 ] ;
    int [ ] [ ] rox = new int [ R ] [ 2 ] ;
    int [ ] [ ] rox = new int [ R ] [ 2 ] ;
    for ( int z = 0 ;
    z < R ;
    z ++ ) {
      rox [ z ] [ 0 ] = Integer . parseInt ( rox [ z ] [ 0 ] ) ;
    }
  }
  /* Run the code */
  int ans = 0 ;
  j = new int [ j . length ] [ 2 ] ;
  for ( i = 0