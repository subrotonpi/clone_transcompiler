public static void print ( int n ) {
  int [ ] p = new int [ n ] ;
  for ( int i = 0 ;
  i < n ;
  i ++ ) {
    p [ i ] = Integer . parseInt ( input . nextLine ( ) ) ;
  }
  int sum = 0 ;
  Arrays . sort ( p , 0 , n ) ;
  p [ 0 ] = p [ 0 ] / 2 ;
  for ( int i = 0 ;
  i < n ;
  i ++ ) {
    sum += p [ i ] ;
  }
  System . out . println ( sum ) ;
}
