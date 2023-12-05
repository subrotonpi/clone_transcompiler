public static void print ( int l ) {
  l = list ( map ( Integer . parseInt ( input ( ) ) , 2 ) ) ;
  l . sort ( ) ;
  System . out . println ( ( int ) ( l [ 0 ] * l [ 1 ] / 2 ) ) ;
}
