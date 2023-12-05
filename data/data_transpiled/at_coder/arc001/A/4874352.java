{
  a = new int [ N ] ;
}
int N = Integer . parseInt ( input . nextLine ( ) ) ;
String row = input . nextLine ( ) ;
for ( int i = 0 ;
i < N ;
i ++ ) {
  a [ ( int ) row . charAt ( i ) - 1 ] ++ ;
}
