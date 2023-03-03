public static int a ( ) {
  int a = 0 ;
  for ( int i = 0 ;
  i < 3 ;
  i ++ ) {
    int [ ] ls = new int [ 3 ] ;
    for ( int j = 0 ;
    j < 3 ;
    j ++ ) ls [ j ] = Integer . parseInt ( input . nextLine ( ) ) ;
    a += ( int ) ( ls [ 0 ] * ls [ 1 ] / 10 ) ;
  }
  return a ;
}
