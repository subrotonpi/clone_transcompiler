public static int A , int B , int C = Integer . parseInt ( input ) ;
if ( A % 2 == 0 || B % 2 == 0 || C % 2 == 0 ) System . out . println ( 0 ) ;
else System . out . println ( min ( A * B , B * C , C * A ) ) ;
return 0 ;
}
