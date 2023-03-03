public static int A , int B , int C , int K ;
int S , T ;
T = Integer . parseInt ( input . nextLine ( ) ) ;
amount = S * A + T * B ;
if ( ( S + T ) >= K ) {
  amount -= C * ( S + T ) ;
}
System . out . println ( amount ) ;
return 0 ;
}
