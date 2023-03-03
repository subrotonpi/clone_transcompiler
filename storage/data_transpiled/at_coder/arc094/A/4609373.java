;
tin = new int [ 3 ] ;
for ( int i = 0 ;
i < tin . length ;
i ++ ) tin [ i ] = ( int ) i ;
int A = tin [ 0 ] , B = tin [ 1 ] , C = tin [ 2 ] ;
if ( ( A + B + C - max ( A , B , C ) ) % 2 == 0 ) System . out . println ( ( int ) ( ( 3 * max ( A , B , C ) - A - B - C ) / 2 ) ) ;
else System . out . println ( ( int ) ( ( 3 * max ( A , B , C ) - A - B - C - 1 ) / 2 + 2 ) ) ;
}
