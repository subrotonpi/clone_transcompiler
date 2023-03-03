public static void main ( String input ) {
  n = Integer . parseInt ( input ) ;
  s = new BigInteger ( 0 ) ;
  for ( int i = 1 ;
  i <= ( int ) ( n * 0.5 ) ;
  i ++ ) {
    if ( n % i < 1 ) s |= new BigInteger ( i , n ) ;
  }
}
