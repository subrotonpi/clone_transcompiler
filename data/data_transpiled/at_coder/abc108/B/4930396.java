public static int x1 = 0 , y1 = 0 , x2 = 0 , y2 = 0 ;
int x3 = x2 - ( y2 - y1 ) , y3 = y2 + ( x2 - x1 ) ;
int x4 = x3 - ( x2 - x1 ) , y4 = y3 - ( y2 - y1 ) ;
return x3 ;
}
