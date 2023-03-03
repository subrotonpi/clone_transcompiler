public static int a , int b , int k , int l = map ( Integer . parseInt , input ) ;
return min ( a * k , ( k / l ) * b + ( k % l ) * a , ( k / l + 1 ) * b ) ;
}
