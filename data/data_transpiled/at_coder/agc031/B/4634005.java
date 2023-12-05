static final int [ ] getDigits ( ) {
  int n = Integer . parseInt ( input . nextLine ( ) ) ;
  int [ ] c = new int [ n ] ;
  for ( int i = 0 ;
  i < n ;
  i ++ ) c [ i ] = Integer . parseInt ( input . nextLine ( ) ) ;
  int [ ] d = new int [ n ] ;
  int stack = 0 ;
  for ( int i = 0 ;
  i < c . length ;
  i ++ ) {
    if ( c [ i ] != stack ) d [ stack ] ++ ;
    stack = i ;
  }
  int [ ] x = new int [ 200001 ] ;
  int sum = 1 ;
  int p = 10 * 9 + 7 ;
  for ( int i = 0 ;
  i != d . length ;
  i ++ ) {
    x [ d [ i ] ] = ( x [ d [ i ] ] + sum ) % p ;
    sum = x [ d [ i ] ] % p ;
  }
  System . out . println ( sum ) ;
  return x ;
}
