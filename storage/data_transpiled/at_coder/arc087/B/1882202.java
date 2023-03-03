public static boolean f ( int [ ] m , int s , int g ) {
  for ( int i = 0 ;
  i < m . length ;
  i ++ ) {
    if ( s > g ) s -= m [ i ] ;
    else s += m [ i ] ;
  }
  return s == g ;
  String s = input . nextLine ( ) ;
  int x = Integer . parseInt ( input . nextLine ( ) ) ;
  int y = Integer . parseInt ( input . nextLine ( ) ) ;
  int len = s . length ( ) ;
  if ( ( f ( new ArrayList < > ( m , 0 , len , m , 0 , x ) ) ) && ( f ( new ArrayList < > ( m , 1 , len , m , 0 , y ) ) ) ) System . out . println ( "Yes" ) ;
  else System . out . println ( "No" ) ;
  return false ;
}
