public static int A , int B , int C ;
int can ;
C = Integer . parseInt ( input . nextLine ( ) ) ;
can = Math . min ( A + B , C ) ;
eat = 0 ;
C -= can ;
eat += can * 2 - A ;
B = A + B - can ;
if ( C > 0 ) {
  eat ++ ;
}
return eat ;
}
