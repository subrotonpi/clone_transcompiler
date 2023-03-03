public static int x1 = input . nextInt ( ) ;
int y1 = input . nextInt ( ) ;
int x2 = input . nextInt ( ) ;
int y2 = input . nextInt ( ) ;
int dx = x2 - x1 ;
int dy = y2 - y1 ;
int x3 = x2 - dy ;
int y3 = y2 + dx ;
int x4 = x3 - dx ;
int y4 = y3 - dy ;
return x3 ;
}
