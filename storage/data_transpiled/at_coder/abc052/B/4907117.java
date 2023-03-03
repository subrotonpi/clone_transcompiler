public static int [ ] ints ( ) {
  n = Integer . parseInt ( input . nextLine ( ) ) ;
  String s = input . nextLine ( ) ;
  int x = 0 ;
  int [ ] list = new int [ n ] ;
  for ( int i = 0 ;
  i < n ;
  i ++ ) {
    if ( s . charAt ( i ) == 'I' ) {
      x ++ ;
    }
    else {
      x -- ;
    }
  }
  return list ;
}
