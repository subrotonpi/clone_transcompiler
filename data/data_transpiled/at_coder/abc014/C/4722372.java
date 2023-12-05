public static int [ ] getIntegerArray ( ) {
  int n = Integer . parseInt ( input . nextLine ( ) ) ;
  int [ ] yayo = new int [ 1000010 ] ;
  for ( int i = 0 ;
  i < n ;
  i ++ ) {
    int a = Integer . parseInt ( input . nextLine ( ) ) ;
    int b = Integer . parseInt ( input . nextLine ( ) ) ;
    yayo [ a ] ++ ;
  }
  for ( int i = 0 ;
  i < 1000000 ;
  i ++ ) {
    yayo [ i + 1 ] ++ ;
  }
  return yayo ;
}
