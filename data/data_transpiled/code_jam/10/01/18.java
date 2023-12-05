static final class Reader {
  private final InputStream is ;
  public Reader ( File file ) throws IOException {
    this . is = new FileInputStream ( file ) ;
  }
  public List < Integer > read ( ) throws IOException {
    return Arrays . asList ( Integer . decode ( is ) ) ;
  }
  public Reader ( ) throws IOException {
    return new Reader ( System . in ) ;
  }
  public int [ ] read ( ) throws IOException {
    int cases = reader . read ( ) ;
    for ( int case = 0 ;
    case < cases ;
    case ++ ) {
      int n = reader . read ( ) ;
      int k = reader . read ( ) ;
      int mask = ( 1 << n ) - 1 ;
      boolean on = ( ( ( k + 1 ) & mask ) == 0 ) ;
      System . out . println ( "Case #" + ( case + 1 ) + ": " + ( on ? "ON" : "OFF" ) ) ;
    }
    return new BufferedReader ( new InputStreamReader ( is ) ) ;
  }
}
