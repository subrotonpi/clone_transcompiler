public static void main ( String input ) {
  l = list ( map ( Integer . parseInt ( input ) , 10 ) ) ;
  K = Integer . parseInt ( input ) ;
  l . sort ( ) ;
  System . out . println ( sum ( l , 0 , 2 ) + l [ l . length - 1 ] * 2 * * K ) ;
}
