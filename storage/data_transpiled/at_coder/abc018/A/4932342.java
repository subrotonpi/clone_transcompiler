[ 3 ] ;
for ( int i = 0 ;
i <= 3 ;
i ++ ) {
  abc [ i ] = Integer . parseInt ( input . nextLine ( ) ) ;
}
List < Integer > tmp = new ArrayList < > ( abc ) ;
Collections . sort ( tmp ) ;
for ( int i : abc ) {
  System . out . println ( tmp . indexOf ( i ) + 1 ) ;
}
