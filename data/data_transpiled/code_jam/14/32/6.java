public static void input ( ) {
  long M = 1000000007 ;
  for ( int tt = 0 ;
  tt < T ;
  tt ++ ) {
    N = input . nextInt ( ) ;
    String [ ] l = readLine ( ) . split ( " " ) ;
    long ans = 0 ;
    boolean sirve = true ;
    ans = 1 ;
    int cc = 0 ;
    for ( int x = 0 ;
    x < 26 ;
    x ++ ) {
      long s = 0 ;
      long t = 0 ;
      long c = 0 ;
      long m = 0 ;
      for ( String y : l ) {
        if ( y . length ( ) > 1 && y . charAt ( 0 ) != ( char ) ( x + 97 ) && y . charAt ( y . length ( ) - 1 ) == ( char ) ( x + 97 ) ) s ++ ;
        if ( y . length ( ) > 1 && y . charAt ( 0 ) == ( char ) ( x + 97 ) && y . charAt ( y . length ( ) - 1 ) != ( char ) ( x + 97 ) ) t ++ ;
        if ( y . length ( ) > 2 && y . charAt ( 0 ) != ( char ) ( x + 97 ) && y . charAt ( y . length ( ) - 1 ) != ( char ) ( ( char ) ( x + 97 ) ) && ( ( char ) ( y . charAt ( 0 ) + 97 ) == ( char ) ( x + 97 ) ) ) m ++ ;
        if ( y . equals ( y . length ( ) * ( char ) ( x + 97 ) ) ) c ++ ;
      }
      if ( m > 0 && ( s > 0 || t > 0 || c > 0 ) ) {
        sirve = false ;
        break ;
      }
      if ( s > 1 || t > 1 ) {
        sirve = false ;
        break ;
      }
      for ( int z = 0 ;
      z < c ;
      z ++ ) ans = ( ans * ( z + 1 ) ) % M ;
      if ( ( ! s ) && ( t > 0 ) ) cc ++ ;
      for ( String x : l ) {
        for ( int i = 0 ;
        i < x . length ( ) ;
        i ++ ) {
          int j = i + 1 ;
          while ( j < x . length ( ) && x . charAt ( i ) != x . charAt ( j ) ) j ++ ;
          if ( j < x . length ( ) && j > i + 1 ) {
            sirve = false ;
            break ;
          }
        }
      }
    }
    if