public static int ans = 0 ;
int num = Integer . parseInt ( input . nextLine ( ) ) ;
for ( int i = 1 ;
i <= num ;
i ++ ) {
  ans += i * 10000 / num ;
}
System . out . println ( ( int ) ans ) ;
return ans ;
}
