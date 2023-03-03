private static boolean solve ( ) {
  int n = Integer . parseInt ( input . nextLine ( ) ) ;
  int [ ] a = new int [ n ] ;
  for ( int i = 0 ;
  i < a . length ;
  i ++ ) {
    a [ i ] = Integer . parseInt ( input . nextLine ( ) ) ;
  }
  Arrays . sort ( a ) ;
  int mina = a [ 0 ] ;
  int maxa = a [ a . length - 1 ] ;
  if ( ( a [ a . length - 1 ] + 1 ) / 2 != mina ) {
    return false ;
  }
  int [ ] b = new int [ n ] ;
  for ( int v = 0 ;
  v < b . length ;
  v ++ ) {
    b [ v ] ++ ;
  }
  if ( ( maxa & 1 ) > 0 ) {
    if ( b [ mina ] != 2 ) {
      return false ;
    }
  }
  else if ( b [ mina ] != 1 ) {
    return false ;
  }
  return true ;
}
