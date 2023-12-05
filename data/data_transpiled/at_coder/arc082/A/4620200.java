input ;
a = new int [ 100000 ] ;
for ( String i : input . split ( " " ) ) a [ Integer . parseInt ( i ) ] ++ ;
System . out . println ( max ( map ( sum , a ) ) ) ;
}
