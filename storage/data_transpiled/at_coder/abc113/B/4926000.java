public static int n = Integer . parseInt ( input ) {
  int t = Integer . parseInt ( input . nextLine ( ) ) ;
  int a = Integer . parseInt ( input . nextLine ( ) ) ;
  int h = Integer . parseInt ( input . nextLine ( ) ) ;
  int x [ ] = new int [ n ] ;
  for ( int i = 0 ;
  i < n ;
  i ++ ) x [ i ] = Math . abs ( t - h - a ) ;
  return x [ i ] ;
}
