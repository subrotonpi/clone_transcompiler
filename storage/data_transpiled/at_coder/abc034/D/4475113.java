public static boolean C ( int n , int k ) {
  int [ ] wp = new int [ n ] ;
  for ( int i = 0 ;
  i < n ;
  i ++ ) {
    wp [ i ] = Integer . parseInt ( input . nextLine ( ) ) ;
  }
  /* C */
  int [ ] wp1 = new int [ n ] ;
  for ( int i = 0 ;
  i < n ;
  i ++ ) {
    wp1 [ i ] = ( wpi [ 1 ] - wp [ i ] ) * wpi [ 0 ] ;
  }
  Arrays . sort ( wp1 ) ;
  if ( Arrays . binarySearch ( wp1 , n - k ) >= 0 ) {
    return true ;
  }
  return false ;
}
