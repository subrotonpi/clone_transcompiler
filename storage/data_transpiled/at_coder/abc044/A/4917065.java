@ Sys public static int input ( ) {
  int a = Integer . parseInt ( input . readLine ( ) ) ;
  int b = Integer . parseInt ( input . readLine ( ) ) ;
  int c = Integer . parseInt ( input . readLine ( ) ) ;
  int d = Integer . parseInt ( input . readLine ( ) ) ;
  if ( a < b ) {
    System . out . println ( a * c ) ;
  }
  else {
    System . out . println ( b * c + d * ( a - b ) ) ;
  }
  return a ;
}
