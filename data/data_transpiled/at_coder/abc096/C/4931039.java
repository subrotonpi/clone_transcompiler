public static boolean count ( int i , int j ) {
  int count = 0 ;
  if ( list [ i ] [ j - 1 ] == '#' ) count ++ ;
  if ( list [ i ] [ j + 1 ] == '#' ) count ++ ;
  if ( list [ i - 1 ] [ j ] == '#' ) count ++ ;
  if ( list [ i + 1 ] [ j ] == '#' ) count ++ ;
  if ( count >= 1 ) return true ;
  else return false ;
}
int h = Integer . parseInt ( input . readLine ( ) ) ;
int w = Integer . parseInt ( input . readLine ( ) ) ;
String sInit = "0" + ( w + 2 ) ;
boolean flag = true ;
StringBuilder sb = new StringBuilder ( ) ;
sb . append ( sInit ) ;
for ( int i = 0 ;
i < h ;
i ++ ) {
  String s = Integer . toString ( input . readLine ( ) ) ;
  sb . append ( "0" + s + "0" ) ;
}
sb . append ( sInit ) ;
for ( int i = 1 ;
i <= h ;
i ++ ) {
  for ( int j = 1 ;
  j <= w ;
  j ++ ) {
    if ( list [ i ] [ j ] == '#' ) {
      if ( ! ( count ( i , j ) ) ) flag = false ;
    }
  }
}
if ( flag ) System . out . println ( "Yes" ) ;
else System . out . println ( "No" ) ;
return false ;
}
