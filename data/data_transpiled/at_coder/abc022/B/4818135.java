public static void main ( ) {
  n = Integer . parseInt ( input ( ) ) ;
  flower = [ int [ ] . valueOf ( input ( ) ) ] ;
  System . out . println ( flower . length - new HashSet ( flower ) . size ( ) ) ;
}
