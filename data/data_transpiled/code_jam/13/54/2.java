static final String getUsage ( ) throws IOException {
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
      String _o = br . readLine ( ) . trim ( ) ;
      int N = _o . length ( ) ;
      long occupied = 0 ;
      for ( int i : xrange ( N ) ) {
        if ( _o . charAt ( i ) == 'X' ) occupied += ( 1L << i ) ;
      }
      HashMap < Integer , Double > mem = new HashMap < Integer , Double > ( ) ;
      {
        double bm ;
        {
          if ( mem . containsKey ( _T ) ) return mem . get ( _T ) ;
          if ( _T == ( 1 << N ) - 1 ) return 0.0 ;
          double total = 0.0 ;
          for ( int i = xrange ( N ) ;
          i < N ;
          i ++ ) {
            for ( int wait = xrange ( N ) ;
            wait > 0 ;
            wait -- ) {
              bm = ( 1 << ( ( i + wait ) % N ) ) ;
              if ( ( _T & bm ) == 0 ) break ;
            }
            else throw new IllegalStateException ( ) ;
            total += N - wait + ( _T | bm ) ;
          }
          mem . put ( _T , total / N ) ;
          return total / N ;
        }
      }
      System . out . println ( "Case #" + ( _T + 1 ) + ": " + ex ( occupied ) + " " + " " + mem ) ;
    }
  }
  return null ;
}
