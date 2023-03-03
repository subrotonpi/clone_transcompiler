static final List < Integer > solve ( int n ) {
  final BufferedReader stdin = new BufferedReader ( new InputStreamReader ( System . in ) ) ;
  return new ArrayList < Integer > ( ) {
    {
      for ( String s : stdin . readLine ( ) . split ( " " ) ) {
        return Integer . parseInt ( s ) ;
      }
    }
  }
  ;
}
