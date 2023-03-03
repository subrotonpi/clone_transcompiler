public static int a , int b , int k ;
int c = Integer . parseInt ( input . nextLine ( ) ) ;
int count = 0 ;
for ( int i = 1 ;
i <= c ;
i ++ ) {
  if ( a % i == 0 && b % i == 0 ) {
    count ++ ;
    if ( k == count ) {
      System . out . println ( i ) ;
    }
  }
}
return c ;
}
