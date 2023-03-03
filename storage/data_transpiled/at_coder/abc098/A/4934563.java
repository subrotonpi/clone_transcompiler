public static int A , int B = Integer . parseInt ( input . nextLine ( ) ) {
  int a = A + B ;
  if ( A * B > a ) {
    a = A * B ;
  }
  if ( A - B > a ) {
    a = A - B ;
  }
  return a ;
}
