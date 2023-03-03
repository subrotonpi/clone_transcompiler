static final String [ ] [ ] copy ( int n ) {
  int i , j ;
  n = Integer . parseInt ( input . nextLine ( ) ) ;
  String [ ] [ ] p = new String [ n ] [ n ] ;
  String [ ] [ ] q = new String [ n ] [ n ] ;
  for ( i = 0 ;
  i < n ;
  i ++ ) p [ i ] = new String [ n ] ;
  for ( i = 0 ;
  i < n ;
  i ++ ) for ( j = 0 ;
  j < n ;
  j ++ ) q [ i ] [ j ] = p [ n - 1 - j ] [ i ] ;
  for ( i = 0 ;
  i < n ;
  i ++ ) for ( j = 0 ;
  j < n ;
  j ++ ) {
    System . out . print ( p [ n - 1 - j ] [ i ] ) ;
    if ( j == n - 1 ) System . out . println ( "" ) ;
  }
  return q ;
}
