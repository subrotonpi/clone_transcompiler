public static int [ ] [ ] readIntList ( ) {
  int n = Integer . parseInt ( input . nextLine ( ) ) ;
  int c = Integer . parseInt ( input . nextLine ( ) ) ;
  int [ ] [ ] xv = new int [ n ] [ ] ;
  int [ ] go = new int [ n ] ;
  int [ ] goback = new int [ n ] ;
  int [ ] back = new int [ n ] ;
  int [ ] backgo = new int [ n ] ;
  int max1 = 0 ;
  int sumt = 0 ;
  for ( int i = 0 ;
  i < n ;
  i ++ ) {
    xv [ i ] = Integer . parseInt ( input . nextLine ( ) ) ;
    sumt += xv [ i ] [ 1 ] ;
    max1 = Math . max ( max1 , sumt - xv [ i ] [ 0 ] ) ;
    go [ i ] = max1 ;
    goback [ i ] = sumt - 2 * xv [ i ] [ 0 ] ;
  }
  max1 = 0 ;
  sumt = 0 ;
  for ( int i = n ;
  i > 0 ;
  i -- ) {
    sumt += xv [ i ] [ 1 ] ;
    max1 = Math . max ( max1 , sumt - ( c - xv [ i ] [ 0 ] ) ) ;
    back [ i ] = max1 ;
    backgo [ i ] = sumt - 2 * ( c - xv [ i ] [ 0 ] ) ;
  }
  int res = 0 ;
  for ( int i = 0 ;
  i < n - 1 ;
  i ++ ) res = Math . max ( res , backgo [ i ] + go [ n - 1 ] , back [ n - 1 ] , 0 ) ;
  System . out . println ( res ) ;
  return xv ;
}
