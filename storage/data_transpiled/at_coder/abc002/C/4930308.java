public static int xa , int ya , int xb , int yb , int xc , int yc ;
xb = Integer . parseInt ( input . nextLine ( ) ) ;
yb = Integer . parseInt ( input . nextLine ( ) ) ;
xc = Integer . parseInt ( input . nextLine ( ) ) ;
yc = Integer . parseInt ( input . nextLine ( ) ) ;
xa = 0 ;
ya = 0 ;
int S = Math . abs ( xb * yc - yb * xc ) / 2 ;
System . out . println ( S ) ;
return S ;
}
