public static int a , int b , int c , int d ;
int s ;
int f ;
int a = Integer . parseInt ( input . readLine ( ) ) ;
int b = Integer . parseInt ( input . readLine ( ) ) ;
int c = Integer . parseInt ( input . readLine ( ) ) ;
int d = Integer . parseInt ( input . readLine ( ) ) ;
s = Math . max ( a , c ) ;
f = Math . min ( b , d ) ;
if ( s < f ) {
  System . out . println ( f - s ) ;
}
else {
  System . out . println ( 0 ) ;
}
return s ;
}
