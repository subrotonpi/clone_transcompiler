public static int N = Integer . parseInt ( input ) {
  String S = input . nextLine ( ) ;
  int l = S . length ( ) ;
  int [ ] ans = new int [ l - 1 ] ;
  for ( int i = 0 ;
  i < l - 1 ;
  i ++ ) {
    ans [ i ] = Sets . intersection ( S . substring ( 0 , i + 1 ) , S . substring ( i + 1 , l ) ) . size ( ) ;
  }
  System . out . println ( max ( ans ) ) ;
  return N ;
}
