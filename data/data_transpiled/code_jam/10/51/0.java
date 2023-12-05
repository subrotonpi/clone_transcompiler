static void Ps ( int [ ] args ) {
  int p = 0 ;
  int [ ] Ps = new int [ 1000001 ] ;
  for ( int i = 0 ;
  i < 1000 ;
  i ++ ) {
    if ( ( Ps [ i ] = StdIn . read ( ) ) != - 1 ) {
      System . arraycopy ( args , 0 , Ps , i * p , 1 ) ;
    }
    p ++ ;
  }
  Arrays . sort ( Ps ) ;
  String dunno = "I don't know." ;
  for ( int casenum : xrange ( 1 , 1 + Integer . parseInt ( readLine ( ) ) ) ) {
    Arrays . sort ( Ps ) ;
    int [ ] s = new int [ Ps . length ] ;
    for ( int i = 0 ;
    i < s . length ;
    i ++ ) {
      s [ i ] = StdIn . read ( ) ;
    }
    String ans = dunno ;
    if ( K > 1 ) {
      if ( s [ s . length - 1 ] >= 0 ) {
        for ( int z : xrange ( K ) ) {
          if ( s [ s . length - 1 ] == s [ z ] ) {
            ans = s [ z + 1 ] ;
            break ;
          }
        }
      }
      else {
        if ( K > 2 ) {
          List < Integer > pl = new ArrayList < Integer > ( ) ;
          for ( int z : Ps ) {
            if ( z < ( 10 * D ) ) {
              for ( int p : pl ) {
                if ( p <= max ( s ) ) continue ;
                int x = ( s [ 1 ] - s [ 0 ] ) ;
                if ( ( x < 0 ) || ( x > max ( s ) ) ) x += p ;
                int y = ( s [ 2 ] - s [ 1 ] ) ;
                if ( ( y < 0 ) || ( y > max ( s ) ) ) y += p ;
                int A = 0 ;
                while ( ( A < p ) ) {
                  if ( ( ( A * x ) % p ) == y ) break ;
                  A ++ ;
                }
                int B = ( s [ 1 ] - ( ( A * s [ 0 ] ) % p ) ) ;
                if ( ( B < 0 ) || ( B > max ( s ) ) ) B += p ;
                valid = true ;
                for ( int k = 0 ;
                k < s . length - 1 ;
                k ++ ) {
                  if ( s [ k + 1 ] != ( ( A * s [ k ] + B ) % p ) ) {
                    valid = false