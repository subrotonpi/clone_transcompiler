public static int count ( int i , int j ) {
  int count = 0 ;
  if ( list [ i - 1 ] [ j - 1 ] == '#' ) count ++ ;
  if ( list [ i - 1 ] [ j ] == '#' ) count ++ ;
  if ( list [ i - 1 ] [ j + 1 ] == '#' ) count ++ ;
  if ( list [ i ] [ j - 1 ] == '#' ) count ++ ;
  if ( list [ i ] [ j + 1 ] == '#' ) count ++ ;
  if ( list [ i + 1 ] [ j - 1 ] == '#' ) count ++ ;
  if ( list [ i + 1 ] [ j ] == '#' ) count ++ ;
  if ( list [ i + 1 ] [ j + 1 ] == '#' ) count ++ ;
  return count ;
}
int h = Integer . parseInt ( input . nextLine ( ) ) ;
int w = Integer . parseInt ( input . nextLine ( ) ) ;
String sInit = "0" + ( w + 2 ) ;
StringBuilder sb = new StringBuilder ( ) ;
sb . append ( sInit ) ;
for ( int j = 0 ;
j < h ;
j ++ ) {
  String s = String . valueOf ( input . nextLine ( ) ) ;
  sb . append ( "0" + s ) . append ( "0" ) ;
}
sb . append ( sInit ) ;
for ( int i = 1 ;
i <= h ;
i ++ ) {
  for ( int j = 1 ;
  j <= w ;
  j ++ ) {
    if ( sb . charAt ( i ) == '.' ) {
      sb . setCharAt ( i , sb . charAt ( i ) . charAt ( 0 ) ) ;
      sb . append ( count ( i , j ) ) ;
      sb . append ( sb . charAt ( i ) . charAt ( j + 1 ) ) ;
    }
  }
}
for ( int i = 0 ;
i < h ;
i ++ ) {
  System . out . println ( sb . substring ( i + 1 , 1 ) . substring ( 1 , sb . length ( ) - 1 ) ) ;
}
return h ;
}
