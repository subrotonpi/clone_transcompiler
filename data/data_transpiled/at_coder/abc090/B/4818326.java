public static int getA ( ) {
  int B = Integer . parseInt ( input . nextLine ( ) ) ;
  int cnt = 0 ;
  for ( int i = A ;
  i <= B ;
  i ++ ) {
    if ( String . valueOf ( i ) . equals ( String . valueOf ( i ) . substring ( 0 , i ) ) ) {
      cnt ++ ;
    }
  }
  return cnt ;
}
