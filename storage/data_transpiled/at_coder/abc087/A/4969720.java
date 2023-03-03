public static int X = Integer . parseInt ( input ) ;
int A = Integer . parseInt ( input ) ;
int B = Integer . parseInt ( input ) ;
int tmp = X - A ;
tmp = tmp - B * ( tmp / B ) ;
return tmp ;
}
