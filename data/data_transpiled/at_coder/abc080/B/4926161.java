public static int [ ] getDigit ( ) {
  int N = Integer . parseInt ( input . nextLine ( ) ) ;
  int [ ] result = new int [ N ] ;
  int memo = N ;
  while ( memo > 0 ) {
    result [ memo ] = memo % 10 ;
    memo /= 10 ;
  }
  if ( N % Integer . parseInt ( result [ 0 ] ) == 0 ) {
    System . out . println ( "Yes" ) ;
  }
  else {
    System . out . println ( "No" ) ;
  }
  return result ;
}
