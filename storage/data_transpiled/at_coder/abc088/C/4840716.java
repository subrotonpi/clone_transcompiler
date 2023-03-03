[ 3 ] ;
a [ 2 ] = new int [ 3 ] ;
for ( int i = 0 ;
i < 3 ;
i ++ ) {
  a [ 0 ] = Integer . parseInt ( input . nextLine ( ) ) ;
}
for ( int i = 0 ;
i < 2 ;
i ++ ) {
  if ( ! a [ 0 ] [ i ] - a [ 0 ] [ i + 1 ] == a [ 1 ] [ i ] - a [ 1 ] [ i + 1 ] == a [ 2 ] [ i ] - a [ 2 ] [ i + 1 ] ) System . out . println ( "No" ) ;
  exit ( ) ;
}
return a [ 2 ] ;
}
