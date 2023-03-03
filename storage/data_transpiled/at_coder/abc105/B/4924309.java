static final int N = Integer . parseInt ( input ) ;
int a = Math . floor ( N / 7 ) ;
boolean flag = false ;
for ( int i = a + 1 ;
i < a ;
i ++ ) {
  int N2 = N - i * 7 ;
  if ( N2 % 4 != 0 ) {
    continue ;
  }
  else {
    flag = true ;
    break ;
  }
}
if ( flag == true ) {
  System . out . println ( "Yes" ) ;
}
else {
  System . out . println ( "No" ) ;
}
return a ;
}
