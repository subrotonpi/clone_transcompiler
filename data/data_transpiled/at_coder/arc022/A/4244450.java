public static void input ( Scanner s ) {
  int [ ] I = new int [ s . length ( ) ] ;
  int [ ] C = new int [ s . length ( ) ] ;
  int [ ] T = new int [ s . length ( ) ] ;
  for ( int j = 0 ;
  j < s . length ( ) ;
  j ++ ) {
    switch ( s . charAt ( j ) ) {
      case 'I' : case 'i' : I [ j ] = s . charAt ( j ) ;
      break ;
      case 'C' : case 'c' : C [ j ] = s . charAt ( j ) ;
      break ;
      case 'T' : case 't' : T [ j ] = s . charAt ( j ) ;
      break ;
      default : null ;
    }
  }
  boolean flag = false ;
  Arrays . sort ( I ) ;
  Arrays . sort ( C ) ;
  Arrays . sort ( T ) ;
  if ( I . length == 0 || C . length == 0 || T . length == 0 ) {
    System . out . println ( "NO" ) ;
  }
  else {
    for ( int i = 0 ;
    i < I . length ;
    i ++ ) {
      for ( int j = 0 ;
      j < C . length ;
      j ++ ) {
        if ( I [ i ] < C [ j ] < T [ T . length - 1 ] ) {
          flag = true ;
          break ;
        }
        else {
          null ;
        }
      }
    }
    if ( flag ) {
      System . out . println ( "YES" ) ;
    }
    else {
      System . out . println ( "NO" ) ;
    }
  }
}
