public static void print ( ) {
  n = Integer . parseInt ( input . nextLine ( ) ) ;
  l = list ( input . nextLine ( ) ) ;
  System . out . println ( ( l . count ( 'A' ) * 4 + l . count ( 'B' ) * 3 + l . count ( 'C' ) * 2 + l . count ( 'D' ) * 1 ) / n ) ;
}
