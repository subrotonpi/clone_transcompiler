public static void main ( String [ ] args ) {
  int N = Integer . parseInt ( input . nextLine ( ) ) ;
  int [ ] a = new int [ N ] ;
  for ( int i = 0 ;
  i < N ;
  i ++ ) {
    a [ i ] = Integer . parseInt ( input . nextLine ( ) ) ;
  }
  Arrays . sort ( a ) ;
  int r = 0 ;
  int i = 0 , j = 0 ;
  while ( i < N ) {
    while ( j < N ) {
      if ( a [ j ] - a [ i ] <= 2 ) {
        j ++ ;
      }
      else {
        break ;
      }
    }
    r = Math . max ( r , j - i ) ;
    if ( j == N ) {
      break ;
    }
    i ++ ;
  }
  System . out . println ( r ) ;
}
