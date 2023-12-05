public static int a , int b , int c ;
int a = Integer . parseInt ( input . readLine ( ) ) ;
a = Integer . parseInt ( input . readLine ( ) ) ;
b = Integer . parseInt ( input . readLine ( ) ) ;
c = Integer . parseInt ( input . readLine ( ) ) ;
Set < Integer > parity = Collections . bitSet ( ) ;
if ( parity . size ( ) == 1 ) {
  System . out . println ( ( int ) ( ( 3 * Math . max ( a , b , c ) - a - b - c ) / 2 ) ) ;
}
else {
  int ex ;
  if ( ( b - a ) % 2 == 0 ) {
    ex = 1 ;
  }
  else {
    ex = 2 ;
  }
  System . out . println ( ( int ) ( ( Math . max ( a , b , c ) - a ) / 2 ) + ( int ) ( ( Math . max ( a , b , c ) - b ) / 2 ) + ( int ) ( ( Math . max ( a , b , c ) - c ) / 2 ) + ex ) ;
}
return ex ;
}
