, n = Integer . MAX_VALUE ) ;
String [ ] s = new String [ n ] ;
for ( int i = 0 ;
i < s . length ;
i ++ ) s [ i ] = String . valueOf ( input . charAt ( i ) ) ;
Arrays . sort ( s ) ;
return s ;
}
