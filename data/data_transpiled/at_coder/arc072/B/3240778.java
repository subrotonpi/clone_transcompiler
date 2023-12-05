public static int x , int y ;
x = map ( Integer . parseInt , input ( ) . split ( ) ) ;
return x + ( Math . abs ( x - y ) < 2 ? "Brown" : "Alice" ) ;
}
