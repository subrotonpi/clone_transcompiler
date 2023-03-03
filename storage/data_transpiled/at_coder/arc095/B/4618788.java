input ;
a = list ( map ( Integer . parseInt , input ) ) ;
m = max ( a ) ;
b = [ Math . abs ( 2 * i - m + 0.1 ) for i in a ] ;
System . out . println ( m + " " + a [ b . index ( min ( b ) ) ] ) ;
}
