public static int A , int B , int C ;
int i ;
int j ;
j = Integer . parseInt ( input . nextLine ( ) ) ;
if ( A % 2 == 0 || B % 2 == 0 || C % 2 == 0 ) {
  System . out . println ( 0 ) ;
}
else {
  System . out . println ( Math . min ( B * C , C * A , A * B ) ) ;
}
return j ;
}
