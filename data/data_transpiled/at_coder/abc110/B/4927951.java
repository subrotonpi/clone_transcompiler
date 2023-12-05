public static int n ( int m , int X , int Y ) {
  int x = Integer . parseInt ( input . nextLine ( ) ) ;
  int y = Integer . parseInt ( input . nextLine ( ) ) ;
  x = X ;
  y = Y ;
  if ( max ( x ) < min ( y ) ) System . out . println ( "No War" ) ;
  else System . out . println ( "War" ) ;
  return 0 ;
}
