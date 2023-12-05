public static String [ ] [ ] C_1 = new String [ 3 ] [ ] ;
for ( int i = 0 ;
i < 3 ;
i ++ ) {
  C_1 [ i ] = Integer . parseInt ( input . nextLine ( ) ) ;
}
String [ ] [ ] C_2 = new String [ 3 ] [ ] ;
for ( int i = 0 ;
i < 3 ;
i ++ ) {
  C_2 [ i ] = C_1 [ 0 ] [ i ] ;
}
String res = null ;
for ( String [ ] C : C_1 , C_2 ) {
  for ( int i = 0 ;
  i < 3 ;
  i ++ ) {
    String [ ] diff = C_1 [ i ] [ j ] - C_1 [ ( i + 1 ) % 3 ] [ j ] ;
    for ( int j = 0 ;
    j < 3 ;
    j ++ ) {
      diff [ j ] = C_1 [ i ] [ j ] ;
    }
    for ( int d : diff ) {
      if ( ! d . equals ( C [ i ] ) ) {
        res = "No" ;
        break ;
      }
    }
    if ( res != null ) break ;
  }
}
if ( res == null ) res = "Yes" ;
System . out . println ( res ) ;
return res ;
}
