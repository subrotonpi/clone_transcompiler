public static boolean input ( ) {
  boolean flagNS = ( ( 'N' == S ) && ( 'S' == S ) ) ;
  boolean flagEW = ( ( 'E' == S ) && ( 'W' == S ) ) ;
  return ( flagNS && flagEW ) ? "Yes" : "No" ;
}
