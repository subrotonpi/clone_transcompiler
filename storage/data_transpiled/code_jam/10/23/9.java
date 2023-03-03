static final double solve ( int d , int n ) {
  if ( FF [ n ] == 0 ) {
    FF [ n ] = Math . factorial ( n ) ;
  }
  return FF [ n ] ;
}
