@ MoreRequires public static int countPatti ( int level , int index ) {
  int n = Integer . parseInt ( input ( ) ) ;
  int x = Integer . parseInt ( input ( ) ) ;
  int [ ] sizes = new int [ 50 ] ;
  for ( int i = 0 ;
  i < 50 ;
  i ++ ) {
    sizes [ i ] = sizes [ i ] * 2 + 3 ;
  }
  @ SuppressWarnings ( "unused" ) int countPatti = 0 ;
  for ( int i = 0 ;
  i < n ;
  i ++ ) {
    if ( level == 0 ) {
      return 1 ;
    }
    if ( index == 0 ) {
      return 0 ;
    }
    if ( 1 <= index < ( sizes [ i ] - 1 ) / 2 ) {
      return countPatti ++ ;
    }
  }
  return 0 ;
}
