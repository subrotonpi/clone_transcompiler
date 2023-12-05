static final int [ ] getMath ( ) {
  int i [ ] = new int [ 3 ] ;
  for ( int j = 0 ;
  j < 3 ;
  j ++ ) {
    i [ j ] = Integer . parseInt ( input . nextLine ( ) ) ;
  }
  int A = i [ 0 ] ;
  int B = i [ 1 ] ;
  int C = i [ 2 ] ;
  if ( ( A * C <= B ) && ( B <= C ) ) {
    System . out . println ( C ) ;
  }
  if ( ( A * C > B ) && ( B <= C ) ) {
    if ( ( B >= A ) && ( C <= B ) ) {
      System . out . println ( Math . floor ( B / A ) ) ;
    }
    else {
      System . out . println ( 0 ) ;
    }
  }
  return i ;
}
