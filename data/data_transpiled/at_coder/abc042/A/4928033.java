A = list ;
for ( int i = 0 ;
i < input . length ;
i ++ ) {
  A [ i ] = Integer . parseInt ( input . nextLine ( ) ) ;
}
Collections . sort ( A ) ;
if ( A [ 0 ] == 5 && A [ 1 ] == 5 && A [ 2 ] == 7 ) {
  System . out . println ( "YES" ) ;
}
else {
  System . out . println ( "NO" ) ;
}
return A ;
}
