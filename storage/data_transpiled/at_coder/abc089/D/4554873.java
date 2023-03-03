public static int [ ] [ ] getDistance ( String input ) {
  int h = Integer . parseInt ( input ) ;
  int w = Integer . parseInt ( input ) ;
  int d = Integer . parseInt ( input ) ;
  HashMap < Integer , Integer > amd = new HashMap < > ( ) ;
  for ( int i = 0 ;
  i < h ;
  i ++ ) {
    ArrayList < Integer > al = map . get ( input ) ;
    for ( int j = 0 ;
    j < al . size ( ) ;
    j ++ ) {
      int a = al . get ( j ) ;
      amd . put ( a , new Integer ( j + 1 ) ) ;
    }
  }
  int [ ] [ ] dsum = new int [ d + 1 ] [ h * w + 1 ] ;
  for ( int i = d + 1 ;
  i < h * w + 1 ;
  i ++ ) {
    dsum [ i ] = dsum [ i - d ] + Math . abs ( amd . get ( i ) . x - amd . get ( i - d ) . x ) + Math . abs ( amd . get ( i ) . y - amd . get ( i - d ) . y ) ;
  }
  int q = Integer . parseInt ( input ) ;
  for ( int i = 0 ;
  i < q ;
  i ++ ) {
    int ans = 0 ;
    int l = Integer . parseInt ( input ) ;
    int r = Integer . parseInt ( input ) ;
    System . out . println ( dsum [ r ] - dsum [ l ] ) ;
  }
  return dsum ;
}
