@ Test ( description = "A-large.in" ) public static void fi ( final PrintStream fo , final int n ) throws IOException {
  final int [ ] [ ] Hor = new int [ ] [ ] ;
  for ( int i = xrange ( 6002 ) ;
  i < li ;
  i ++ ) {
    Hor [ i ] = new int [ li ] ;
  }
  final int [ ] [ ] Ver = new int [ ] [ ] ;
  for ( int i = xrange ( 6002 ) ;
  i < li ;
  i ++ ) {
    int L = Integer . parseInt ( li . readLine ( ) ) ;
    int x = 3000 ;
    int y = 3000 ;
    int dir = 1 ;
    while ( L > 0 ) {
      final String [ ] lis = li . split ( " " ) ;
      L -= lis . length / 2 ;
      int i = 0 ;
      while ( i < lis . length ) {
        for ( int j = xrange ( Integer . parseInt ( lis [ i + 1 ] ) ) ;
        j < li ;
        j ++ ) {
          final char c = lis [ i ] . charAt ( j ) ;
          switch ( c ) {
            case 'F' : switch ( dir ) {
              case 0 : Ver [ x ] [ y ] = ++ x ;
              break ;
              case 1 : Hor [ y ] [ x ] = ++ y ;
              break ;
              case 2 : Ver [ x - 1 ] [ y ] = ++ x ;
              break ;
              case 3 : Hor [ y - 1 ] [ x ] = -- y ;
              break ;
            }
          }
          break ;
          case 'L' : dir = ( dir + 1 ) % 4 ;
          break ;
          case 'R' : dir = ( dir + 3 ) % 4 ;
          break ;
        }
      }
      i += 2 ;
    }
    int res = 0 ;
    final int [ ] [ ] Horints = new int [ ] [ ] ;
    for ( int i = xrange ( 6002 ) ;
    i < li ;
    i ++ ) {
      Horints [ i ] = new int [ li . length ] ;
      for ( int j = 0 ;
      j < li . length ;
      j ++ ) {
        Horints [ i ] [ j ] = li [ j ] ;
      }
    }
    for ( int j = 0 ;
    j < li . length ;
    j ++ ) {
      Horints [ i ] [ j ] = Horints [ j ] ;
    }
    for ( int j = 0 ;
    j < li . length ;
    j ++ ) {
      Horints [ j ] [ j ] = Horints [ j ] ;
    }
  }
  