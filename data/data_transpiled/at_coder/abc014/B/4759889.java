, n = Integer . parseInt ( input . nextLine ( ) ) ) {
  List < Integer > l = Lists . newArrayList ( ) ;
  l . add ( Integer . parseInt ( input . nextLine ( ) ) ) ;
  String b = Integer . toBinaryString ( x ) . substring ( 2 , n + 2 ) ;
  if ( b . length ( ) + 1 == n ) b = "0" + b ;
  long sum = 0 ;
  for ( int i = 0 ;
  i < b . length ( ) ;
  i ++ ) sum += l . get ( b . length ( ) - i - 1 ) * Integer . parseInt ( b . substring ( i , i + 1 ) ) ;
  System . out . println ( sum ) ;
}
