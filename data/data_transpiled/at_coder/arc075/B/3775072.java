public static void main ( String input , int n , int a , int b ) {
  int [ ] h = new int [ n ] ;
  for ( int i = 0 ;
  i < n ;
  i ++ ) {
    h [ i ] = Integer . parseInt ( input . nextLine ( ) ) ;
  }
  Arrays . sort ( h ) ;
  /* Check for k */
  int top = 0 ;
  int [ ] tmp = h . clone ( ) ;
  for ( int i = 0 ;
  i < n ;
  i ++ ) {
    int amari = tmp [ i ] - b * k ;
    if ( amari > 0 ) {
      top += - ( - amari / ( a - b ) ) ;
    }
  }
  /* Return top */
  int left = 0 ;
  int right = - ( - 1 * Integer . parseInt ( h [ left ] ) / b ) ;
  while ( ( right - left > 1 ) ) {
    int nextInd = ( left + right ) / 2 ;
    if ( check ( nextInd ) ) {
      right = nextInd ;
    }
    else {
      left = nextInd ;
    }
  }
  System . out . println ( right ) ;
}
