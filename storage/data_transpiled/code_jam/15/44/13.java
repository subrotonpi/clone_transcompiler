public static int [ ] [ ] adj ( int [ ] [ ] drum , int i0 , int j0 ) {
  for ( int di = 0 , dj = - 1 ;
  di < drum [ 0 ] . length ;
  di ++ ) {
    int i = i0 + di , j = j0 + dj ;
    if ( i < 0 || i >= drum . length ) continue ;
    j = ( j + drum [ 0 ] . length ) % drum [ 0 ] . length ;
    System . arraycopy ( drum [ 0 ] , 0 , acc , 0 , drum [ i0 ] . length ) ;
  }
  int nCases = input ( ) ;
  for ( int i = 1 ;
  i < nCases ;
  ++ i ) {
    int r = Integer . parseInt ( input ( ) ) ;
    int c = Integer . parseInt ( input ( ) ) ;
    int solution = solve ( r , c ) ;
    System . out . println ( "Case #" + ( i + 1 ) + ": " + solution ) ;
    System . arraycopy ( drum [ i0 ] , 0 , acc , 0 , drum [ i0 ] . length ) ;
  }
  return drum [ i0 ] [ j0 ] ;
}
