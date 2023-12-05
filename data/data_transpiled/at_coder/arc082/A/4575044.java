input ;
a = new int [ 100000 ] ;
for ( int i : map ( input ) . split ( ) ) a [ i ] ++ ;
System . out . println ( max ( map ( sum , a ) ) ) ;
}
