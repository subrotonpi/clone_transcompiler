public static int [ ] getNum ( ) {
  n = Integer . parseInt ( input . nextLine ( ) ) ;
  C = Integer . parseInt ( input . nextLine ( ) ) ;
  c = new int [ n ] ;
  for ( int i = 0 ;
  i < n ;
  i ++ ) {
    c [ i ] = C % 10 ;
  }
  num = new int [ 5 ] ;
  return num ;
}
