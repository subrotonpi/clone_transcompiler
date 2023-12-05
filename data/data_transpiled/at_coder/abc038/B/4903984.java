public static int H_1 , int W_1 ;
int H_2 , W_2 ;
H_1 = Integer . parseInt ( input . nextLine ( ) ) ;
W_1 = Integer . parseInt ( input . nextLine ( ) ) ;
H_2 = Integer . parseInt ( input . nextLine ( ) ) ;
W_2 = Integer . parseInt ( input . nextLine ( ) ) ;
if ( H_1 == H_2 || H_1 == W_2 || W_1 == H_2 || W_1 == W_2 ) {
  System . out . println ( "YES" ) ;
}
else {
  System . out . println ( "NO" ) ;
}
return H_1 ;
}
