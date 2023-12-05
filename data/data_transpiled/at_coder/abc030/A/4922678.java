public static String winRate ( @ Nonnegative int A , @ Nonnegative int B , @ Nonnegative int C , @ Nonnegative int D ) {
  if ( B * C < A * D ) return "AOKI" ;
  if ( B * C > A * D ) return "TAKAHASHI" ;
  return "DRAW" ;
}
if ( className . equals ( "org.apache.commons.lang3.StringUtils.LongToBoolean" ) ) {
  A = Integer . parseInt ( input . nextLine ( ) ) ;
  B = Integer . parseInt ( input . nextLine ( ) ) ;
  C = Integer . parseInt ( input . nextLine ( ) ) ;
  D = Integer . parseInt ( input . nextLine ( ) ) ;
  String ans = winRate ( A , B , C , D ) ;
  System . out . println ( ans ) ;
}
