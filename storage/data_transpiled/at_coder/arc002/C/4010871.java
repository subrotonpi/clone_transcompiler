public static int N = Integer . parseInt ( input ) {
  String C = String . valueOf ( input ) ;
  String c = "ABXY" ;
  int ans = N ;
  for ( int la = 0 ;
  la < 4 ;
  la ++ ) {
    for ( int lb = 0 ;
    lb < 4 ;
    lb ++ ) {
      String L = c . substring ( la , la + 1 ) + c . substring ( lb , lb + 1 ) ;
      for ( int ra = 0 ;
      ra < 4 ;
      ra ++ ) {
        for ( int rb = 0 ;
        rb < 4 ;
        rb ++ ) {
          String R = c . substring ( ra , ra + 1 ) + c . substring ( rb , rb + 1 ) ;
          if ( L != R ) {
            String lc = C . replace ( L , "L" ) ;
            String rc = lc . replace ( R , "R" ) ;
            ans = Math . min ( ans , rc . length ( ) ) ;
          }
        }
      }
    }
  }
  System . out . println ( ans ) ;
  return ans ;
}
