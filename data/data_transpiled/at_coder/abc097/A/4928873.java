public static int a , int b , int c , int d ;
a = Integer . parseInt ( input . readLine ( ) ) ;
b = Integer . parseInt ( input . readLine ( ) ) ;
return ( Math . abs ( a - c ) <= d || ( Math . abs ( a - b ) <= d && Math . abs ( b - c ) <= d ) ) ? 'Yes' : 'No' ;
}
