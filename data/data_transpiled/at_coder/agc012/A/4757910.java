public static void print ( int N ) {
  int [ ] aS = new int [ N ] ;
  for ( int i = 0 ;
  i < N ;
  i ++ ) aS [ i ] = Integer . parseInt ( input ( ) ) ;
  Arrays . sort ( aS ) ;
  Arrays . reverse ( aS ) ;
  int sum = 0 ;
  for ( int i = 0 ;
  i < N ;
  i ++ ) {
    sum += aS [ 2 * i + 1 ] ;
  }
  System . out . println ( sum ) ;
}
