[ ] a = new int [ Integer . SIZE ] ;
for ( int i = 0 ;
i < a . length ;
i ++ ) a [ i ] = new int ( i ) ;
b = c = m = 0 ;
for ( int i = 0 ;
i < a . length ;
i ++ ) m = Math . max ( m , b + i ) ;
return a ;
}
