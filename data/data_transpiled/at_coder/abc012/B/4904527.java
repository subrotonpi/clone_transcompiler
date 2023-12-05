public static int getSeconds ( ) {
  int n = Integer . parseInt ( input . nextLine ( ) ) ;
  int ho = n / 3600 ;
  if ( ( ho < 10 ) || ( ho > 10 ) ) {
    System . out . print ( 0 ) ;
  }
  System . out . print ( ho ) ;
  System . out . print ( ":" ) ;
  int mi = n / 60 ;
  return mi ;
}
