public static int [ ] [ ] solve ( ) {
  int n = Integer . parseInt ( input . nextLine ( ) ) ;
  int [ ] x = new int [ n ] ;
  for ( int i = 0 ;
  i < n - 1 ;
  i ++ ) x [ i ] = Integer . parseInt ( input . nextLine ( ) ) ;
  int [ ] g = new int [ n ] ;
  for ( int i = 0 ;
  i < n - 1 ;
  i ++ ) g [ i ] = x [ i + 1 ] - x [ i ] ;
  int m = input . nextInt ( ) ;
  int k = input . nextInt ( ) ;
  int [ ] A = new int [ n ] ;
  for ( int i = 0 ;
  i < n ;
  i ++ ) A [ i ] = A [ i ] ;
  t = new int [ n ] ;
  for ( int i = 0 ;
  i < n ;
  i ++ ) t [ i ] = t [ i ] ;
  return g ;
}
