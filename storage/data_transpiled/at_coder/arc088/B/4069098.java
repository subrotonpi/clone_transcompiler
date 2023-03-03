@ Parameters public static final Collection < Object [ ] > data ( ) {
  List < Object [ ] > list = new ArrayList < > ( ) ;
  List < Object [ ] > S = input ( ) ;
  int size = S . size ( ) ;
  if ( S . size ( ) % 2 == 0 ) {
    int ans = size / 2 ;
    Object base = S . get ( size / 2 ) ;
    for ( int i = 0 ;
    i < size / 2 ;
    i ++ ) {
      if ( S . get ( size / 2 - 1 - i ) . equals ( S . get ( size / 2 + i ) ) == base ) {
        ans ++ ;
      }
      else {
        break ;
      }
    }
    System . out . println ( ans ) ;
  }
  else {
    int ans = size / 2 + 1 ;
    Object base = S . get ( size / 2 ) ;
    for ( int i = 0 ;
    i < size / 2 ;
    i ++ ) {
      if ( S . get ( size / 2 - 1 - i ) . equals ( S . get ( size / 2 + 1 + i ) ) == base ) {
        ans ++ ;
      }
      else {
        break ;
      }
    }
    System . out . println ( ans ) ;
  }
  return list ;
}
