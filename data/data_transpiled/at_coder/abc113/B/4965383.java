public static int n = Integer . parseInt ( input ) {
  int t = Integer . parseInt ( input . nextLine ( ) ) ;
  int a = Integer . parseInt ( input . nextLine ( ) ) ;
  int h = Integer . parseInt ( input . nextLine ( ) ) ;
  int [ ] f = new int [ n ] ;
  for ( int i = 0 ;
  i < n ;
  i ++ ) f [ i ] = Math . abs ( a - ( t - h ) ) ;
  return f [ i ] ;
}
