public static int getA ( ) {
  int B = Integer . parseInt ( input . nextLine ( ) ) ;
  int count = 0 ;
  for ( int n = A ;
  n <= B ;
  n ++ ) {
    if ( n == Integer . parseInt ( String . valueOf ( n ) . substring ( 0 , n ) ) ) {
      count ++ ;
    }
  }
  return count ;
}
