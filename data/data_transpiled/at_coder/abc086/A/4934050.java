public static int [ ] ints ( ) {
  int a = Integer . parseInt ( input . nextLine ( ) ) , b = Integer . parseInt ( input . nextLine ( ) ) ;
  int ans = a * b ;
  if ( ans % 2 == 0 ) {
    System . out . println ( "Even" ) ;
  }
  else {
    System . out . println ( "Odd" ) ;
  }
  return ans ;
}
