public static int a = Integer . parseInt ( input ) ;
int b = Integer . parseInt ( input ) ;
int c = Integer . parseInt ( input ) ;
int i = c ;
while ( true ) {
  if ( i % a == 0 && i % b == 0 ) {
    System . out . println ( i ) ;
    break ;
  }
  else {
    i ++ ;
  }
}
