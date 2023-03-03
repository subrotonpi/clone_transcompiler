static final int [ ] [ ] getNegativeInstances ( ) {
  int R = Integer . parseInt ( input . readLine ( ) ) ;
  int C = Integer . parseInt ( input . readLine ( ) ) ;
  int K = Integer . parseInt ( input . readLine ( ) ) ;
  String [ ] s = new String [ R ] ;
  for ( int i = 0 ;
  i < R ;
  i ++ ) s [ i ] = input . readLine ( ) ;
  short [ ] cs = new short [ R + C + 1 ] ;
  for ( int i = 0 , j = 0 ;
  i < C ;
  i ++ ) {
    if ( s [ i ] . charAt ( j ) == 'x' ) cs [ C + i - j ] [ i + j + 1 ] = 1 ;
  }
  cs = new short [ R ] [ C ] ;
  cs = new short [ R ] ;
  cs = new short [ R ] ;
  cs = new short [ R ] ;
  cs = new short [ R ] ;
  cs = new short [ R ] ;
  cs = new short [ R ] ;
  cs = new short [ R ] ;
  cs = new short [ R ] ;
  cs = new short [ R ] ;
  cs = new short [ R ] ;
  cs = new short [ R ] ;
  cs = new short [ R ] ;
  cs = new short [ R ] ;
  cs = new short [ R ] ;
  cs = new short [ R ] ;
  cs = new short [ R ] ;
  cs = new short [ R ] ;
  cs = new short [ R ] ;
  cs = new short [ R ] ;
  cs = new short [ R ] ;
  cs = new short [ R ] ;
  cs = new short [ R ] ;
  for ( int i = 0 , j = 0 ;
  i < R ;
  j ++ ) {
    if ( s [ i ] . charAt ( j ) == 'x' ) {
      cs [ C + i ] [ j ] = 1 ;
    }
  }
  cs = new short [ R ] ;
  cs = new short [ R ] ;
  cs = new short [ R ] ;
  cs = new short [ R ] ;
  for ( int i = 0 ;
  i < R ;
  i ++ i , j = i + 1 ) {
    if ( s [ i ] . charAt ( j ) == 'x' ) {
      cs [ C + i ] [ j ] = 1 ;
    }
  }
  Arrays . sort ( cs ) ;
  ans = 0 ;
  for ( int i = 0 ;
  i < R ;
  i ++ ) {
    ans ++