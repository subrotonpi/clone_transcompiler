public static int x1 , y1 , int x2 , y2 , int x3 , y3 ;
x1 = map ( Integer . parseInt , input ) ;
y1 = map ( Integer . parseInt , input ) ;
return ( Math . abs ( ( x2 - x1 ) * ( y3 - y1 ) - ( y2 - y1 ) * ( x3 - x1 ) ) / 2 ) ;
}
