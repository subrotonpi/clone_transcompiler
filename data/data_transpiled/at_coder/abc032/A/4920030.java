public static int a = Integer . parseInt ( input ) ;
int b = Integer . parseInt ( input ) ;
int n = Integer . parseInt ( input ) ;
for ( int i = n ;
i < 10000000 ;
i ++ ) {
  if ( i == 0 ) {
    continue ;
  }
  if ( i % a == 0 && i % b == 0 ) {
    System . out . println ( i ) ;
    break ;
  }
}
return a ;
}
