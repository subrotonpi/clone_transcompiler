static final String lin ( ) {
  final String s = System . console ( ) . readLine ( ) ;
  final int N = s . length ( ) ;
  final int T = Integer . parseInt ( s ) ;
  final int [ ] dx = {
    0 , 1 , 1 , 1 }
    ;
    final int [ ] dy = {
      1 , 0 , 1 , - 1 }
      ;
      String [ ] S ;
      {
        int i , j , k ;
        boolean ok ;
        for ( int d = 0 ;
        d < 4 ;
        d ++ ) {
          ok = true ;
          for ( int i = 0 ;
          i < K ;
          i ++ ) {
            int xx = x + i * dx [ d ] ;
            int yy = y + i * dy [ d ] ;
            if ( ! ( xx < S . length && yy < S [ i ] . length ( ) && S [ xx ] . charAt ( yy ) == S [ i ] . charAt ( y ) ) ) {
              ok = false ;
              break ;
            }
          }
          if ( ok ) {
            return true ;
          }
        }
        return false ;
      }
      for ( int casenum = 0 ;
      casenum < T ;
      casenum ++ ) {
        final int N = s . length ( ) ;
        final int K = s . length ( ) ;
        s = Arrays . asList ( s ) . toString ( ) ;
        final String [ ] t = new String [ N ] ;
        for ( int i = 0 ;
        i < s . length ;
        i ++ ) {
          final String l = s . substring ( i , i + 1 ) ;
          final char [ ] ll = new char [ l . length ( ) ] ;
          for ( int j = l . length ( ) - 2 ;
          j >= 0 ;
          j -- ) {
            int k = i + 1 ;
            while ( k < l . length ( ) && ll [ k ] == '.' ) {
              ll [ k ] = ll [ k - 1 ] ;
              ll [ k - 1 ] = '.' ;
              k ++ ;
            }
          }
          l = new String ( ll ) ;
          t [ i ] = l ;
        }
        S = t ;
        ok = new boolean [ N ] ;
        ok [ 0 ] = false ;
        ok [ 1 ] = false ;
        for ( int x = 0 ;
        x < N ;
        x ++ ) {
          for ( int y = 0 ;
          y < N ;
          y ++ ) {
            if ( S [ x ] . charAt ( y ) == 'R' || S [ x ] . charAt ( y ) == 'B' && line ( x , y , K