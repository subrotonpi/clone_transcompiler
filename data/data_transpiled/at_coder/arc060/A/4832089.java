public static int n ( ) {
  int a = Integer . parseInt ( input . nextLine ( ) ) ;
  int [ ] x = new int [ n ] ;
  for ( int i = 0 ;
  i < x . length ;
  i ++ ) {
    x [ i ] = i - a ;
  }
  return x [ 0 ] ;
}
