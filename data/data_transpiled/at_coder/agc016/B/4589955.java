public static int [ ] getNegativeInstances ( ) {
  int n = Integer . parseInt ( input . nextLine ( ) ) ;
  int [ ] a = new int [ n ] ;
  for ( int i = 0 ;
  i < n ;
  i ++ ) {
    a [ i ] = Integer . parseInt ( input . nextLine ( ) ) ;
  }
  int ma = max ( a ) ;
  for ( int ai : a ) {
    if ( ai == ma - 1 ) {
      flag = 1 ;
    }
  }
  if ( flag ) {
    int count = 0 ;
    for ( int ai : a ) {
      if ( ai == ma ) {
        count ++ ;
      }
    }
  }
  return a ;
}
