public static int A , int B , int K = Integer . parseInt ( input . nextLine ( ) . trim ( ) ) ;
int [ ] res = new int [ A ] ;
for ( int a = A ;
a < Math . min ( A + K , B ) ;
a ++ ) res [ a ] = a ;
for ( int b = Math . max ( A , B - K + 1 ) ;
b <= B ;
b ++ ) res [ b ] = b ;
for ( int r : new ArrayList < > ( Arrays . asList ( res ) ) ) System . out . println ( r ) ;
return res [ 0 ] ;
}
