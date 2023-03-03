public static int max ( ) {
  n = Integer . parseInt ( input . nextLine ( ) ) ;
  int [ ] p = new int [ n ] ;
  for ( int i = 0 ;
  i < n ;
  i ++ ) p [ i ] = Integer . parseInt ( input . nextLine ( ) ) ;
  int [ ] q = new int [ n ] ;
  for ( int i = 0 ;
  i < n ;
  i ++ ) q [ i ] = - 1 ;
  for ( int j = 0 ;
  j < p . length ;
  j ++ ) q [ j ] = - 1 ;
  return q [ i ] ;
}
