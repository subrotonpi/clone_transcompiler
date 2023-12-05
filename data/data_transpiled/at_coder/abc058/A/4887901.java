= list ( ) ;
for ( int i = 0 ;
i < 1000 ;
i ++ ) {
  lis = Integer . parseInt ( input . nextLine ( ) ) ;
}
List < Integer > lis_1 = new ArrayList < > ( lis ) ;
Collections . sort ( lis_1 ) ;
if ( lis_1 . get ( 2 ) - lis_1 . get ( 1 ) == lis_1 . get ( 1 ) - lis_1 . get ( 0 ) ) {
  System . out . println ( "YES" ) ;
}
else {
  System . out . println ( "NO" ) ;
}
return lis_1 ;
}
