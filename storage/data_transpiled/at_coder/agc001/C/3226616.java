public static int search ( int before , int now , int depth ) {
  int n = Integer . parseInt ( input . nextLine ( ) ) , k = Integer . parseInt ( input . nextLine ( ) ) ;
  final int [ ] [ ] l = new int [ n ] [ n ] ;
  final int [ ] [ ] e = new int [ n ] [ n ] ;
  for ( int i = 0 ;
  i < n - 1 ;
  i ++ ) {
    int a = Integer . parseInt ( input . nextLine ( ) ) ;
    int b = Integer . parseInt ( input . nextLine ( ) ) ;
    l [ a - 1 ] [ b ] = b - 1 ;
    l [ b - 1 ] [ a ] = a - 1 ;
    e [ i ] [ a - 1 ] = b - 1 ;
  }
  return n - 1 ;
}
