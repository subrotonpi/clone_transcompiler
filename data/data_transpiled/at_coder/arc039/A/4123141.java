public static int A , B ;
A = input . split ( " " ) ;
B = input . split ( " " ) ;
int a = Math . max ( Integer . parseInt ( "9" + A [ 1 ] + A [ 2 ] ) , Integer . parseInt ( A [ 0 ] + "9" + A [ 2 ] ) , Integer . parseInt ( A [ 0 ] + A [ 1 ] + "9" ) ) ;
int b = Math . min ( Integer . parseInt ( "1" + B [ 1 ] + B [ 2 ] ) , Integer . parseInt ( B [ 0 ] + "0" + B [ 2 ] ) ) ;
return a ;
}
