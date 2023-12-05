[ ] a = new int [ Integer . SIZE ] ;
for ( int i = 0 ;
i < a . length ;
i ++ ) a [ i ] = i ;
m = 0 ;
c = 0 ;
f = 2 ;
for ( int i = 0 ;
i < a . length ;
i ++ ) c = f != i || - ~ c ;
return a [ i ] ;
}
