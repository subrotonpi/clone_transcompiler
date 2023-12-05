public static int N = Integer . parseInt ( input . nextLine ( ) . trim ( ) ) ;
int [ ] y = new int [ N ] ;
for ( int i = 0 ;
i < y . length ;
i ++ ) y [ i ] = Integer . parseInt ( input . nextLine ( ) . trim ( ) ) ;
Arrays . sort ( y ) ;
int xl = y . length ;
for ( int i = 0 ;
i < y . length ;
i ++ ) {
  if ( y [ i ] < ( y [ xl / 2 ] ) ) System . out . println ( y [ ( xl / 2 ) ] ) ;
  else System . out . println ( y [ ( xl / 2 ) - 1 ] ) ;
}
return y [ i ] ;
}
