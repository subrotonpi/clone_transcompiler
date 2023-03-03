public static void main ( String [ ] input ) {
  L = Integer . parseInt ( input [ 0 ] ) ;
  R = Integer . parseInt ( input [ 1 ] ) ;
  l = Integer . parseInt ( input [ 2 ] ) ;
  r = Integer . parseInt ( input [ 3 ] ) ;
  int [ ] left = new int [ 44 ] ;
  int [ ] right = new int [ 44 ] ;
  for ( int i = 0 ;
  i < 44 ;
  i ++ ) {
    left [ i ] ++ ;
  }
  for ( int i = 0 ;
  i < 44 ;
  i ++ ) {
    right [ i ] ++ ;
  }
  int res = 0 ;
  for ( int i = 0 ;
  i < 44 ;
  i ++ ) {
    res += Math . min ( left [ i ] , right [ i ] ) ;
  }
  System . out . println ( res ) ;
}
