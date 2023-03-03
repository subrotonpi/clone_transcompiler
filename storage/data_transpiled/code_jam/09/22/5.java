static final String getUpper ( ) {
  final String rl = "" ;
  final int T = Integer . parseInt ( rl . trim ( ) ) ;
  for ( int cas : xrange ( 1 , T + 1 ) ) {
    final String n = rl . trim ( ) . concat ( "0" ) . substring ( 0 , rl . length ( ) - 1 ) ;
    final int [ ] cnt = new int [ n . length ( ) ] ;
    final int [ ] need = new int [ n . length ( ) ] ;
    for ( int i = 0 ;
    i < "0123456789" . length ( ) ;
    i ++ ) {
      cnt [ "0123456789" . charAt ( i ) ] = 0 ;
      need [ "0123456789" . charAt ( i ) ] = 0 ;
    }
    for ( int i = 0 ;
    i < n . length ( ) ;
    i ++ ) {
      cnt [ "0123456789" . charAt ( i ) ] ++ ;
    }
    final String used = "0123456789" . substring ( i ) ;
    String ans = "Blah" ;
    for ( int i : xrange ( n . length ( ) ) ) {
      if ( ans != "Blah" . charAt ( i ) ) break ;
      cnt [ "0123456789" . charAt ( i ) ] -- ;
      need [ "0123456789" . charAt ( i ) ] ++ ;
      int j = used . indexOf ( "0123456789" . charAt ( i ) ) + 1 ;
      while ( j < used . length ( ) ) {
        if ( need [ "0123456789" . charAt ( j ) ] >= 1 ) {
          final char c = used . charAt ( j ) ;
          need [ c ] -- ;
          if ( Ints . checkedCast ( need [ "0123456789" . charAt ( j ) ] ) <= i ) {
            ans = n . substring ( 0 , i ) + c + "0" . substring ( i - Integer . parseInt ( need [ "0123456789" . charAt ( j ) ] ) ) ;
            for ( int v = 0 ;
            v < "0123456789" . length ( ) ;
            v ++ ) ans += v * need [ v ] ;
            break ;
          }
          need [ c ] ++ ;
        }
        j ++ ;
      }
    }
    if ( ans . equals ( "Blah" ) ) {
      if ( used . substring ( 0 , 1 ) . equals ( "0" ) ) used = used . substring ( 1 ) ;
      ans = used . substring ( 0 , 1 ) + "0" . substring ( n . length ( ) - Integer . parseInt ( need [ "0123456789" . charAt ( j ) ] ) + 1 ) ;
      need [ used . charAt ( 0 ) ] --