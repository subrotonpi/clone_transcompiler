public static int x , int y = map ( Integer . parseInt , input ( ) . split ( ) ) ;
return x + ( Math . abs ( x - y ) > 1 ? "Alice" : "Brown" ) ;
}
