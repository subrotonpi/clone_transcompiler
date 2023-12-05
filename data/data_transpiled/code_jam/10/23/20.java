static int [ ] [ ] getCount ( int n ) throws IOException {
  final BufferedReader reader = new BufferedReader ( new InputStreamReader ( System . in ) ) ;
  final int cases = Integer . parseInt ( reader . readLine ( ) ) ;
  final int base = 100003 ;
  final int [ ] [ ] count = {
    {
      0 , 0 , new int [ ] {
        0 , 1 }
      }
    }
    ;
    final int [ ] [ ] cnk = new int [ 2 ] [ ] ;
    cnk [ 0 ] [ 0 ] = 1 ;
    for ( int i : xrange ( 501 ) ) {
      cnk [ 0 ] = new int [ ] {
        1 }
        ;
        for ( int j : xrange ( 1 , i ) ) cnk [ i ] [ j ] = ( cnk [ i - 1 ] [ j - 1 ] + cnk [ i - 1 ] [ j ] ) % base ;
        cnk [ i ] [ j ] = 1 ;
      }
      for ( int n : xrange ( 3 , 501 ) ) {
        count [ n ] = new int [ ] {
          0 , 1 }
          ;
          for ( int k : xrange ( 2 , n ) ) {
            int c = 0 ;
            for ( int j : xrange ( Math . max ( 1 , 2 * k - n ) , k ) ) c += ( count [ k ] [ j ] * cnk [ n - k - 1 ] [ k - j - 1 ] ) % base ;
            count [ n ] [ k ] = c ;
          }
        }
        final int [ ] [ ] count = new int [ n ] [ cases + 1 ] ;
        int total = 0 ;
        for ( int k : xrange ( 1 , n ) ) total += count [ n ] [ k ] ;
        return total % base ;
      }
      