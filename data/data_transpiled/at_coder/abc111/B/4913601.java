public static int N = Integer . parseInt ( input ) {
  int rev1 = ( N / 100 ) * 100 + ( N / 100 ) * 10 + ( N / 100 ) ;
  int rev2 = ( N / 100 + 1 ) * 100 + ( N / 100 + 1 ) * 10 + ( N / 100 + 1 ) ;
  if ( N <= rev1 && rev1 <= rev2 ) {
    System . out . println ( rev1 ) ;
  }
  else {
    System . out . println ( rev2 ) ;
  }
  return rev1 ;
}
