str = input ;
int n = Integer . parseInt ( input ) ;
String [ ] [ ] lr = new String [ n ] [ ] ;
for ( int i = 0 ;
i < n ;
i ++ ) {
  lr [ i ] = input . split ( "\\s+" ) ;
}
for ( int i = 0 ;
i < n ;
i ++ ) {
  lr [ i ] [ 0 ] = Integer . parseInt ( lr [ i ] [ 0 ] ) ;
  lr [ i ] [ 1 ] = Integer . parseInt ( lr [ i ] [ 1 ] ) ;
}
int [ ] num = new int [ n ] ;
for ( int i = 0 ;
i < num . length ;
i ++ ) {
  num [ i ] = Integer . parseInt ( num [ i ] ) ;
}
System . out . println ( "" ) ;
}
