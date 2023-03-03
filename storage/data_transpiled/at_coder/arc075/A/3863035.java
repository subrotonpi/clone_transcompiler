static final int [ ] getNegativeInstances ( ) {
  int a = Integer . parseInt ( input . nextLine ( ) ) ;
  int [ ] k = new int [ a ] ;
  int [ ] k10 = new int [ a ] ;
  int s = 0 ;
  for ( int j = 0 ;
  j < a ;
  j ++ ) {
    int i = Integer . parseInt ( input . nextLine ( ) ) ;
    if ( i % 10 == 0 ) {
      k10 [ j ] = i ;
      s += i ;
    }
    else {
      k [ j ] = i ;
    }
  }
  Arrays . sort ( k ) ;
  return k10 ;
}
