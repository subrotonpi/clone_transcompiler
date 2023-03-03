static final int [ ] [ ] solve ( int n , int m , int X , int Y ) {
  final int [ ] x = new int [ n ] ;
  final int [ ] y = new int [ m ] ;
  for ( int i = 0 ;
  i < 101 ;
  i ++ ) {
    x [ i ] = Integer . parseInt ( input . nextLine ( ) ) ;
    y [ i ] = Integer . parseInt ( input . nextLine ( ) ) ;
  }
  for ( int z = 0 ;
  z < 101 ;
  z ++ ) {
    if ( X < z * ( - 1 ) <= Y && Arrays . asList ( x [ i ] < z * ( - 1 ) ) . contains ( y ) ) {
      System . out . println ( "No War" ) ;
      System . exit ( ) ;
    }
  }
  return x ;
}
