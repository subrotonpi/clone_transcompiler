static final double [ ] [ ] [ ] C = new double [ 2 ] [ 3 ] ;
for ( int i = 0 ;
i < 2 ;
i ++ ) C [ i ] [ 0 ] = input . nextDouble ( ) ;
double [ ] [ ] C_r = new double [ 2 ] [ 3 ] ;
for ( int i = 0 ;
i < 2 ;
i ++ ) for ( int j = 0 ;
j < 3 ;
j ++ ) C_r [ 1 - i ] [ 2 - j ] = C [ i ] [ j ] ;
if ( Arrays . equals ( C , C_r ) ) System . out . println ( "YES" ) ;
else System . out . println ( "NO" ) ;
return C_r ;
}
