public static int N ( ) {
  int A = Integer . parseInt ( input . nextLine ( ) ) ;
  int B = Integer . parseInt ( input . nextLine ( ) ) ;
  boolean flag = true ;
  while ( N > 0 ) {
    if ( flag ) N -= A ;
    else N -= B ;
    flag = ! flag ;
  }
  return ( ! flag ? "Ant" : "Bug" ) ;
}
