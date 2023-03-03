public static int getA ( ) {
  int B = Integer . parseInt ( input . nextLine ( ) ) ;
  int ans = 0 ;
  for ( int i = A ;
  i <= B ;
  i ++ ) {
    if ( String . valueOf ( i ) . equals ( String . valueOf ( i ) . substring ( 0 , i ) ) ) {
      ans ++ ;
    }
  }
  return ans ;
}
