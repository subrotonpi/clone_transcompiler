public static int x , y ;
x = Integer . parseInt ( input . readLine ( ) ) ;
y = Integer . parseInt ( input . readLine ( ) ) ;
x = x - 1 ;
y = y - 1 ;
long mod = 1000000007 ;
long c = 1 ;
for ( int i = 0 ;
i < Math . min ( x , y ) ;
i ++ ) {
  c = ( c * ( x + y - i ) * Math . pow ( i + 1 , mod - 2 , mod ) % mod ) ;
}
System . out . println ( c % mod ) ;
return 0 ;
}
