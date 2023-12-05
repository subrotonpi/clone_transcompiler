public static List < Integer > convert ( ) {
  A = list ( map ( input -> Integer . parseInt ( input . nextLine ( ) ) ) ) ;
  int M = max ( A ) ;
  int S = sum ( A ) ;
  M += M % 2 != S % 2 ;
  System . out . println ( ( 3 * M - S ) / 2 ) ;
}
