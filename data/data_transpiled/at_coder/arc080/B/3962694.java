public static void main ( String input ) {
  int H = Integer . parseInt ( input ) ;
  int W = Integer . parseInt ( input ) ;
  int N = Integer . parseInt ( input ) ;
  int [ ] A = new int [ N ] ;
  for ( int i = 0 ;
  i < N ;
  i ++ ) {
    A [ i ] = Integer . parseInt ( input ) ;
  }
  int [ ] B = new int [ N ] ;
  for ( int i = 0 ;
  i < N ;
  i ++ ) {
    B [ i ] = i + 1 ;
  }
  for ( int j = 0 ;
  j < H ;
  j ++ ) {
    System . out . println ( StringUtils . toString ( B , j * W , ( j + 1 ) * W , 0 , ( - 1 ) * ( 1 & j ) ) ) ;
  }
}
