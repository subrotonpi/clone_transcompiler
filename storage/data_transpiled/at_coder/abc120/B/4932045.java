public static int A , int B , int K ;
int myList = Integer . parseInt ( input . nextLine ( ) ) ;
for ( int i = 1 ;
i <= Math . max ( A , B ) ;
i ++ ) {
  if ( A % i == 0 && B % i == 0 ) {
    myList . add ( i ) ;
  }
}
