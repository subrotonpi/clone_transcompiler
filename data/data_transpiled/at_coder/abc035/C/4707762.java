public static void print ( String input ) {
  int n = Integer . parseInt ( input ) ;
  int q = input . length ( ) ;
  int [ ] L = new int [ n ] ;
  int [ ] R = new int [ n + 1 ] ;
  for ( int i = 0 ;
  i < q ;
  i ++ ) {
    L [ l - 1 ] ++ ;
    R [ r ] ++ ;
  }
  String ans [ ] = new String [ n ] ;
  int temp = 0 ;
  for ( int i = 0 ;
  i < n ;
  i ++ ) {
    temp += L [ i ] - R [ i ] ;
    ans [ i ] = String . valueOf ( temp % 2 ) ;
  }
  System . out . println ( ans ) ;
}
