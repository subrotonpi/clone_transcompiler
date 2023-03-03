public static int f ( int x ) {
  int res = 0 ;
  for ( String a : String . valueOf ( x ) . split ( " " ) ) {
    res += Integer . parseInt ( a ) ;
  }
  return res ;
}
