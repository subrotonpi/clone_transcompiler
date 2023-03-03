static final int [ ] solve ( int n , int m , int nr , int mr ) throws IOException {
  BufferedReader in = new BufferedReader ( new InputStreamReader ( System . in ) ) ;
  int T = Integer . parseInt ( in . readLine ( ) ) ;
  for ( int ci = 0 ;
  ci < T ;
  ci ++ ) {
    Arrays . fill ( N , Integer . valueOf ( in . readLine ( ) ) ) ;
    Arrays . fill ( M , Integer . valueOf ( in . readLine ( ) ) ) ;
    int [ ] boxs = new int [ N ] ;
    Arrays . fill ( boxs , 0 ) ;
    int [ ] toys = new int [ M ] ;
    Map < Integer , Integer > map = new HashMap < Integer , Integer > ( ) ;
    {
      int q ;
      int nq ;
      int nt ;
      int mq ;
      int mt ;
      int n ;
      int m ;
      int m ;
      int nr ;
      int mr ;
      int m ;
      int m ;
      int n ;
      int m ;
      int m ;
      int m ;
      int m ;
      m = in . read ( ) ;
      n = in . read ( ) ;
      m = in . read ( ) ;
      m = in . read ( ) ;
      if ( m == 0 || m == 0 ) {
        m = in . read ( ) ;
        m = in . read ( ) ;
        n = in . read ( ) ;
        m = in . read ( ) ;
        if ( m == 0 ) {
          m = in . read ( ) ;
        }
        key = new Integer ( n ) ;
        m = in . read ( ) ;
        if ( map . containsKey ( key ) ) {
          return map . get ( key ) ;
        }
        nq = 2 * n - 2 ;
        nt = 2 * n - 1 ;
        mq = 2 * m - 2 ;
        mt = 2 * m - 1 ;
        if ( boxs [ nt ] == toys [ mt ] ) {
          q = boxs [ nq ] - nr ;
          qt = toys [ mq ] - mr ;
          q = Math . min ( qb , qt ) ;
          if ( ( qb > qt ) && ( mr > 0 ) ) {
            v = q + new Integer ( n ) ;
            v = 0 ;
          }
          else {
            v = q + new Integer ( n ) ;
            v = 0 ;
          }
        }
        else {
          v = Math . max ( new Integer ( n ) , m ) ;
        }
        map . put ( key , v ) ;
        return v ;
      }
    }
  }
  System . out . println ( "Case #" + ( ci + 1