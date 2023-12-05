public static int [ ] readIntList ( ) {
  int n = Integer . parseInt ( input . nextLine ( ) ) ;
  int [ ] list = new int [ n ] ;
  int count = 1 ;
  for ( int i = 0 ;
  i < n ;
  i ++ ) {
    list [ i ] = Integer . parseInt ( input . nextLine ( ) ) ;
  }
  Arrays . sort ( list ) ;
  int tmp = list [ 0 ] ;
  for ( int i = 1 ;
  i < n ;
  i ++ ) {
    if ( tmp == list [ i ] ) {
      continue ;
    }
    else {
      count ++ ;
    }
    tmp = list [ i ] ;
  }
  return list ;
}
