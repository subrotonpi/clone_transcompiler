static int x ( ) {
  int a , b ;
  a = map ( Integer . parseInt ( input . nextLine ( ) ) , b ) ;
  return x + ( b <= a ? "delicious" : "dangerous" ) + ( x + a < b ? "safe" : "" ) ;
}
