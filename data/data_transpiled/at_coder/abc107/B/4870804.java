public static void print ( int H , int W ) {
  int [ ] A = null ;
  int [ ] indh = new int [ H ] ;
  int [ ] indw = new int [ W ] ;
  Arrays . fill ( A , Collections . nCopies ( W , "" ) ) ;
  for ( int i = 0 ;
  i < H ;
  i ++ ) {
    if ( new HashSet < > ( A [ i ] ) . contains ( new HashSet < > ( "." ) ) ) {
      A [ i ] = 0 ;
    }
  }
  final ArrayList < Integer > AT = new ArrayList < > ( ) ;
  for ( int i = 0 ;
  i < W ;
  i ++ ) {
    AT . add ( A [ i ] ) ;
  }
  final ArrayList < Integer > ansT = new ArrayList < > ( ) ;
  for ( int i = 0 ;
  i < W ;
  i ++ ) {
    if ( new HashSet < > ( AT . get ( i ) ) . contains ( new HashSet < > ( "." ) ) ) {
      ansT . add ( AT . get ( i ) ) ;
    }
  }
  for ( int a : Collections . list ( ansT ) ) {
    System . out . println ( new String ( a ) ) ;
  }
}
