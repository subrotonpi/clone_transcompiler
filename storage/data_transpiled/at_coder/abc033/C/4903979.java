public static int [ ] S ( Scanner input ) {
  List = new ArrayList < Integer > ( ) ;
  int key = 0 ;
  for ( int i = 0 ;
  i < S . length ( ) ;
  i ++ ) {
    int times = 1 ;
    if ( S . charAt ( i ) == '*' ) {
      S . charAt ( i ) ;
    }
    else if ( i == S . length ( ) - 1 ) {
      for ( int j = key ;
      j < S . length ( ) ;
      j ++ ) {
        times = times * Integer . parseInt ( S . substring ( j ) ) ;
      }
      List . add ( times ) ;
      key = i + 1 ;
    }
  }
  int count = 0 ;
  for ( int i : List ) {
    if ( i != 0 ) {
      count ++ ;
    }
  }
  System . out . println ( count ) ;
  return list ;
}
