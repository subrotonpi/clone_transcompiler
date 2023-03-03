public static int N = Integer . parseInt ( input ) {
  int [ ] d = new int [ N ] ;
  for ( int i = 0 ;
  i < N ;
  i ++ ) d [ i ] = Integer . parseInt ( input ) ;
  Arrays . sort ( d ) ;
  int result1 = sum ( d ) ;
  int result2 = max ( d [ d . length - 1 ] - sum ( d , 0 , d . length - 1 ) , 0 ) ;
  System . out . println ( result1 ) ;
  System . out . println ( result2 ) ;
  return result1 ;
}
