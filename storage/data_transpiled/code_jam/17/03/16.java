static final String getSortingString ( ) throws IOException {
  if ( __name__ == "__main__" ) {
    BufferedReader br = new BufferedReader ( new InputStreamReader ( System . in ) ) ;
    if ( args . length >= 2 ) {
      String fn = args [ 1 ] ;
      if ( fn != null ) {
        br = new BufferedReader ( new FileReader ( fn ) ) ;
      }
    }
    int T = Integer . parseInt ( br . readLine ( ) ) ;
    for ( int _T = xrange ( T ) ;
    _T < T ;
    _T ++ ) {
      int N = Integer . parseInt ( br . readLine ( ) ) ;
      int K = Integer . parseInt ( br . readLine ( ) ) ;
      Map < Integer , Integer > amounts = new HashMap < > ( ) ;
      amounts . put ( N , 1 ) ;
      K -- ;
      while ( K > 0 ) {
        int next = Collections . max ( amounts . keySet ( ) ) ;
        int num = amounts . get ( next ) ;
        if ( num > K ) {
          break ;
        }
        -- next ;
        amounts . remove ( next ) ;
        amounts . put ( ( next - 1 ) / 2 , amounts . getOrDefault ( ( next - 1 ) / 2 , 0 ) + num ) ;
        amounts . put ( next / 2 , amounts . getOrDefault ( next / 2 , 0 ) + num ) ;
        K -= num ;
      }
      next = Collections . max ( amounts . keySet ( ) ) ;
      System . out . println ( "Case #" + ( _T + 1 ) + ": " + next / 2 + " " + ( next - 1 ) / 2 ) ;
    }
  }
  return null ;
}
