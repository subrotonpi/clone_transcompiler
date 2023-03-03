public static String run ( ) {
  int n = Integer . parseInt ( input . nextLine ( ) ) ;
  int l = Integer . parseInt ( input . nextLine ( ) ) ;
  String G = input . nextLine ( ) ;
  String B = input . nextLine ( ) . trim ( ) ;
  if ( G . contains ( B ) ) return "IMPOSSIBLE" ;
  String p1 ;
  String p2 ;
  if ( l == 1 ) {
    p1 = "?" ;
    p2 = "0" ;
  }
  else {
    p1 = "?" ;
    p2 = "10?" + "10" * l ;
  }
  return p1 + " " + p2 ;
}
