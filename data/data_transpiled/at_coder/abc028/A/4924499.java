public static String evalTest ( @ Nonnegative int N ) {
  if ( N < 60 ) return "Bad" ;
  if ( N < 90 ) return "Good" ;
  if ( N < 100 ) return "Great" ;
  return "Perfect" ;
  if ( getClass ( ) . isEnum ( ) ) {
    N = Integer . parseInt ( input . nextLine ( ) ) ;
    String ans = evalTest ( N ) ;
    System . out . println ( ans ) ;
  }
  return "Bad" ;
}
