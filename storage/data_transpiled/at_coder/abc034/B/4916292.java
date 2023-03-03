public static int n ( ) {
  int n = Integer . parseInt ( input . nextLine ( ) ) ;
  switch ( n % 10 ) {
    case 1 : case 3 : case 5 : case 7 : case 9 : System . out . println ( n + 1 ) ;
    break ;
    default : System . out . println ( n - 1 ) ;
    break ;
  }
  return n ;
}
