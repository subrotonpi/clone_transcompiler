public static int A = Integer . parseInt ( input ) {
  int B = Integer . parseInt ( input . nextLine ( ) ) ;
  int C = Integer . parseInt ( input . nextLine ( ) ) ;
  if ( A % 2 == 0 || B % 2 == 0 || C % 2 == 0 ) {
    System . out . println ( 0 ) ;
  }
  else {
    System . out . println ( Math . min ( A * B , A * C , B * C ) ) ;
  }
  return B ;
}
