public static List < Integer > temp = Lists . newArrayList ( ) ;
for ( int i = 0 ;
i < input . length ( ) ;
i ++ ) {
  temp . add ( input . nextInt ( ) ) ;
}
temp . sort ( ) ;
int a = temp . get ( 0 ) , b = temp . get ( 1 ) , c = temp . get ( 2 ) ;
if ( ( 2 * c - a - b ) % 2 == 0 ) {
  System . out . println ( ( 2 * c - a - b ) / 2 ) ;
}
else {
  System . out . println ( ( 2 * c - a - b + 3 ) / 2 ) ;
}
return temp ;
}
