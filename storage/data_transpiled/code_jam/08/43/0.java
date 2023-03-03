static final String getUsage ( ) {
  System . out . println ( "Parsing " + infilename + " to " + outfilename ) ;
  BufferedReader infilereader = new BufferedReader ( new FileReader ( infilename ) ) ;
  PrintWriter outfilewriter = new PrintWriter ( outfilename ) ;
  int N = Integer . parseInt ( infilereader . readLine ( ) ) ;
  for ( int i = 0 ;
  i < N ;
  i ++ ) {
    String o = infilereader . readLine ( ) ;
    if ( ( o = infilereader . readLine ( ) ) . contains ( "-h" ) || ( o = infilereader . readLine ( ) ) . contains ( "--help" ) ) {
      usage ( ) ;
      System . exit ( 2 ) ;
    }
    else if ( ( o = infilereader . readLine ( ) ) . contains ( "-s" ) || ( o = infilereader . readLine ( ) ) . contains ( "--small" ) ) {
      type = "small" ;
    }
    else if ( ( o = infilereader . readLine ( ) ) . contains ( "-l" ) || ( o = infilereader . readLine ( ) ) . contains ( "--large" ) ) {
      type = "large" ;
    }
  }
  infilereader . close ( ) ;
  outfilewriter . close ( ) ;
  class ProblemC {
    public int i ;
  }
  public ProblemC ( String fileName , String line ) {
    int N = Integer . parseInt ( line ) ;
    int [ ] [ ] xyzp = new int [ N ] [ 3 ] ;
    for ( int k = 0 ;
    k < N ;
    k ++ ) {
      xyzp [ k ] = Integer . parseInt ( line ) ;
    }
  }
  public double solution ( ) {
    double upper = 0.0 ;
    double lower = 0.0 ;
    for ( int k = 0 ;
    k < N ;
    k ++ ) {
      double power = ( 0.0 + xyzp [ k ] [ 0 ] + xyzp [ k ] [ 1 ] + xyzp [ k ] [ 2 ] ) ;
      power /= xyzp [ k ] [ 3 ] ;
      if ( ( power > upper ) && ( power > lower ) ) upper = power ;
    }
    int [ ] xyzp = xyzp ;
    int [ ] pp = new int [ N ] ;
    for ( int k = 0 ;
    k < N ;
    k ++ ) {
      pp [ k ] = T * pows [ k ] ;
    }
    int [ ] mp = new int [ N ]