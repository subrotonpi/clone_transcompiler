public static int a , int b , int c ;
int cnt = 0 ;
if ( a == b == c && a % 2 == 0 && b % 2 == 0 && c % 2 == 0 ) {
  cnt = - 1 ;
}
else {
  while ( a % 2 == 0 && b % 2 == 0 && c % 2 == 0 ) {
    a = b / 2 + c / 2 ;
    b = a / 2 + c / 2 ;
    c = a / 2 + b / 2 ;
    cnt ++ ;
  }
}
System . out . println ( cnt ) ;
return cnt ;
}
