public static int N = Integer . parseInt ( input ) {
  int [ ] [ ] T = new int [ N ] [ ] ;
  int i = 0 ;
  for ( int j = 0 ;
  j < T . length ;
  j ++ ) {
    T [ j ] = new int [ K ] ;
  }
  int v = input . nextInt ( ) ;
  if ( T . length == 0 ) {
    return v == 0 ;
  }
  int [ ] tt = T [ 0 ] ;
  int [ ] newT = Arrays . copyOf ( T , T . length ) ;
  newT [ 0 ] = a ;
  for ( int j = 0 ;
  j < tt . length ;
  j ++ ) {
    if ( func ( tt [ j ] ^ v , newT ) ) {
      return true ;
    }
  }
  return false ;
}
