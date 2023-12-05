public static int A , int B , int C , int K ;
int S , T ;
S = Integer . parseInt ( input . nextLine ( ) ) ;
T = Integer . parseInt ( input . nextLine ( ) ) ;
if ( S + T >= K ) {
  A -= C ;
  B -= C ;
}
System . out . println ( S * A + T * B ) ;
return S ;
}
