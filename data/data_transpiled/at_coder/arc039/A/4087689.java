public static int getA ( ) {
  int A = Integer . parseInt ( input . nextLine ( ) ) ;
  int B = Integer . parseInt ( input . nextLine ( ) ) ;
  int a = A ;
  int b = B ;
  if ( a < 900 ) {
    a = 900 + A % 100 ;
  }
  else if ( a % 100 < 90 ) {
    a = 990 + A % 10 ;
  }
  else {
    a = 999 ;
  }
  return a ;
}
