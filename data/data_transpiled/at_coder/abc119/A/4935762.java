public static void main ( String input ) {
  int a , b , c ;
  a = Integer . parseInt ( input . substring ( 0 , input . length ( ) - 1 ) ) ;
  b = Integer . parseInt ( input . substring ( input . length ( ) - 1 , input . length ( ) - 1 ) ) ;
  c = Integer . parseInt ( input . substring ( input . length ( ) - 1 , input . length ( ) - 1 ) ) ;
  if ( b > 4 ) System . out . println ( "TBD" ) ;
  else System . out . println ( "Heisei" ) ;
}
