input ;
a = list ( map ( Integer :: parseInt , input ) ) ;
m = max ( a ) ;
a . remove ( m ) ;
b = [ Math . abs ( 2 * i - m ) ] ;
System . out . println ( m + " " + a [ b . index ( min ( b ) ) ] ) ;
}
