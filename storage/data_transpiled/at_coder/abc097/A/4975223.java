public static int a , int b , int c , int d ;
int diff ;
a = Integer . parseInt ( input . readLine ( ) ) ;
b = Integer . parseInt ( input . readLine ( ) ) ;
c = Integer . parseInt ( input . readLine ( ) ) ;
d = Integer . parseInt ( input . readLine ( ) ) ;
diff = Math . max ( Math . abs ( a - b ) , Math . abs ( b - c ) ) ;
if ( diff <= d || Math . abs ( a - c ) <= d ) {
  System . out . println ( "Yes" ) ;
}
else {
  System . out . println ( "No" ) ;
}
return diff ;
}
