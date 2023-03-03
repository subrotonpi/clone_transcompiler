public static List < Integer > convert ( ) {
  A = list ( map ( input -> Integer . parseInt ( input . nextLine ( ) ) ) ) ;
  A = new ArrayList < > ( ) ;
  A . sort ( ) ;
  String B = String . valueOf ( A . get ( 2 ) ) + String . valueOf ( A . get ( 1 ) ) ;
  B = Integer . parseInt ( B ) ;
  return B + A . get ( 0 ) ;
}
