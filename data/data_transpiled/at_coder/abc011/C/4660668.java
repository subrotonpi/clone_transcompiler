, n = new eval ( "int(input)+4," ) ;
d = new int [ 500 ] ;
for ( int i = 5 ;
i <= n ;
i ++ ) d [ i ] = 100 * ( i >= 0 ? i : i ) - ~ min ( d [ i - 3 ] ) ;
return d ;
}
