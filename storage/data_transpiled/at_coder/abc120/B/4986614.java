public static int A , int B , int K ;
int n = Integer . parseInt ( input . nextLine ( ) ) ;
int count = 0 ;
for ( int i = n ;
i > 0 ;
i -- ) {
  if ( i == 0 ) {
    break ;
  }
  if ( A % i == 0 && B % i == 0 ) {
    count = count + 1 ;
    if ( count == K ) {
      break ;
    }
  }
}
System . out . println ( i ) ;
return count ;
}
