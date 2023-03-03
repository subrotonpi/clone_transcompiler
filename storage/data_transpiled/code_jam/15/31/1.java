static final Scanner IO = new Scanner ( System . in ) {
  private final String in = "" ;
  private final String out = "" ;
  @ Override public int [ ] readCase ( final BufferedReader in ) throws IOException {
    return readInts ( in ) ;
  }
  @ Override public int [ ] solveSmall ( final int [ ] testCase ) {
    final int R = testCase [ 0 ] ;
    final int C = testCase [ 1 ] ;
    final int W = testCase [ 2 ] ;
    return ( C / W ) * R + W - ( C % W == 0 ? 1 : 0 ) ;
  }
  @ Override public int [ ] solveLarge ( final int [ ] testCase ) {
    return solveLarge ( testCase ) ;
  }
  @ Override public void writeCase ( final PrintWriter out , final int i , final int res ) {
    out . print ( "Case #" + i + ": " ) ;
    out . print ( res ) ;
    out . println ( ) ;
  }
  @ Override public String readWord ( final BufferedReader in ) throws IOException {
    return ( String ) in . readLine ( ) . trim ( ) ;
  }
  @ Override public int [ ] readInt ( final BufferedReader in , final int b ) throws IOException {
    return Integer . parseInt ( in . readLine ( ) , b ) ;
  }
  @ Override public Iterable < String > readLetters ( final BufferedReader in ) throws IOException {
    return Collections . singleton ( in . readLine ( ) ) ;
  }
  @ Override public Iterable < String > readDigits ( final BufferedReader in , final int b ) throws IOException {
    return Arrays . asList ( readLetters ( in ) ) ;
  }
  @ Override public Iterable < String > readWords ( final BufferedReader in , final char d ) throws IOException {
    return in . readLine ( ) . split ( d ) ;
  }
  @ Override public int [ ] readInts ( final BufferedReader in , final int b , final char d ) throws IOException {
    return Arrays . asList ( readInts ( in , b , d ) ) ;
  }
  @ Override public float [ ] readFloats ( final BufferedReader in , final int b , final char d ) throws IOException {
    return Arrays . asList ( readFloats ( in , b , d ) ) ;
  }
  @ Override public int [ ] readArr ( final int R , final IntReader reader , final int ... args ) throws IOException {
    return Arrays . asList ( readArr ( in , R , args ) ) ;
  }
  @ Override public void solve ( final Solver solver , final String fn , final String out ) throws IOException {
    final String in = fn + "