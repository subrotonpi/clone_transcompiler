@ Sys public static int [ ] getInts ( ) {
  return new int [ ] {
    Integer . parseInt ( stdin . readLine ( ) ) }
    ;
    final int T = stdin . nextInt ( ) ;
    for ( int tc = 0 ;
    tc < T ;
    ++ tc ) {
      final int N = stdin . nextInt ( ) ;
      final int P = stdin . nextInt ( ) ;
      final int [ ] Gs = getInts ( ) ;
      Arrays . sort ( Gs ) ;
      final int [ ] c = new int [ N ] ;
      for ( int i = 0 ;
      i < N ;
      ++ i ) {
        c [ i ] = Gs [ i ] % P ;
      }
      for ( int i = 0 ;
      i < Gs . length ;
      ++ i ) {
        if ( Gs [ i ] == i ) {
          c [ i ] = Gs [ i ] ;
        }
      }
      int ans ;
      if ( P == 2 ) {
        ans = c [ 0 ] + ( ( c [ 1 ] + 1 ) / 2 ) ;
      }
      else if ( P == 3 ) {
        ans = 1 + c [ 0 ] ;
        final int k = Math . min ( c [ 1 ] , c [ 2 ] ) ;
        ans += k ;
        c [ 1 ] -= k ;
        c [ 2 ] -= k ;
        ans += ( c [ 1 ] / 3 ) + ( c [ 2 ] / 3 ) ;
        if ( ( c [ 1 ] + 2 * c [ 2 ] ) % 3 == 0 ) ans -- ;
      }
      else if ( P == 4 ) {
        ans = 1 + c [ 0 ] ;
        int rec = 0 ;
        int d = 0 ;
        while ( d <= c [ 1 ] && d <= c [ 3 ] ) {
          int e = 0 ;
          while ( d + 2 * e <= c [ 1 ] && e <= c [ 2 ] ) {
            int f = 0 ;
            while ( d + 2 * f <= c [ 3 ] && e + f <= c [ 2 ] ) {
              final int a = ( c [ 1 ] - d - 2 * e ) / 4 ;
              final int b = ( c [ 3 ] - d - 2 * f ) / 4 ;
              final int cv = ( c [ 2 ] - e - f ) / 2 ;
              final int score = a + b + cv + d + e + f ;
              if ( score > rec ) {
                rec = score ;
              }
              ++ f ;
            }
            ++ e ;
          }
          ++ d ;
        }
        ans += rec ;
        if ( ( ( c [