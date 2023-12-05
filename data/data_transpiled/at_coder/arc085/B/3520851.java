public static int N = Integer . parseInt ( input ) {
  int Z = Integer . parseInt ( input . nextLine ( ) ) ;
  int W = Integer . parseInt ( input . nextLine ( ) ) ;
  int [ ] a = Arrays . stream ( input . nextLine ( ) . split ( " " ) ) . mapToInt ( Integer :: parseInt ) . toArray ( ) ;
  if ( N == 1 ) {
    System . out . println ( Math . abs ( a [ a . length - 1 ] - W ) ) ;
  }
  else {
    int ans = Math . max ( Math . abs ( a [ a . length - 1 ] - W ) , Math . abs ( a [ a . length - 2 ] - a [ a . length - 1 ] ) ) ;
    System . out . println ( ans ) ;
  }
  return N ;
}
