public static String A , String B , String C ;
int [ ] As = new int [ 100 ] ;
for ( int i = 1 ;
i <= 100 ;
i ++ ) As [ i ] = A * i ;
if ( Arrays . equals ( As , A ) ) System . out . println ( "NO" ) ;
else System . out . println ( "YES" ) ;
return A ;
}
