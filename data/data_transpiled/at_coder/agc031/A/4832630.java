public static int [ ] cnt = new int [ 26 ] ;
int n = Integer . parseInt ( input . nextLine ( ) ) ;
String s = input . nextLine ( ) ;
for ( int i = 0 ;
i < s . length ( ) ;
i ++ ) {
  cnt [ ( int ) s . charAt ( i ) - 'a' ] ++ ;
}
