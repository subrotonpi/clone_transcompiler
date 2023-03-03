static final int INF = 1000000 ;
{
  int n = Integer . parseInt ( readLine ( ) . trim ( ) ) ;
  for ( int i = 0 ;
  i < n ;
  i ++ ) {
    Arrays . stream ( readLine ( ) . split ( " " ) ) . forEach ( i -> {
      int h = Integer . parseInt ( readLine ( ) . trim ( ) ) ;
      int w = Integer . parseInt ( readLine ( ) . trim ( ) ) ;
      int [ ] [ ] m = new int [ w + 2 ] [ h ] ;
      for ( int j = 0 ;
      j < h ;
      j ++ ) m [ j ] [ j ] = INF ;
      Map < Integer , List < Integer >> gr = new HashMap < > ( ) ;
      List < Integer > ss = new ArrayList < > ( ) ;
      for ( int r = 0 ;
      r < h ;
      r ++ ) {
        for ( int c = 0 ;
        c < w ;
        c ++ ) {
          int br = r ;
          int bc = c ;
          Iterator < Integer > dr = new Iterator < Integer > ( ) {
            int dc = ( r - 1 ) ;
            while ( dr . hasNext ( ) && c < c ) {
              if ( m [ br + 1 ] [ bc + 1 ] > m [ dr . next ( ) ] [ dc + 1 ] ) {
                br = dr . next ( ) ;
                bc = dc . next ( ) ;
              }
            }
          }
        }
        if ( br == r && bc == c ) ss . add ( new Integer ( r ) ) ;
        else gr . computeIfAbsent ( new Integer ( br ) , ( int ) bc ) . add ( new ArrayList < > ( ) ) ;
      }
      Map < Integer , List < Integer >> sm = new HashMap < > ( ) ;
      {
        do {
          sm . put ( ( int ) r , s ) ;
          for ( List < Integer > vv : gr . computeIfAbsent ( ( int ) r , ( int ) c ) ) {
            dosm ( ( int ) r , vv ) ;
          }
        }
        while ( ss . size ( ) > 0 ) ;
      }
    }
    ) ;
    char nl = 'a' ;
    Map < Integer , Character > smm = new HashMap < > ( ) ;
    System . out . print ( "Case #" + ( i + 1 ) + ":" ) ;
    for ( int r = 0 ;
    r < h ;
    r ++ ) {
      for ( int c = 0 ;
      c < w ;
      c ++ ) {
        int s = sm . get ( new