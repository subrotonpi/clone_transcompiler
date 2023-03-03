public static String input ( ) {
  String s = input + "T" ;
  int x , y ;
  boolean dire = true ;
  ArrayList < Integer > xi = new ArrayList < Integer > ( ) ;
  ArrayList < Integer > yi = new ArrayList < Integer > ( ) ;
  int ctr = 0 ;
  for ( int i = 0 ;
  i < s . length ( ) ;
  i ++ ) {
    if ( s . charAt ( i ) == 'F' ) {
      ctr ++ ;
      continue ;
    }
    if ( dire ) {
      xi . add ( ctr ) ;
    }
    else {
      yi . add ( ctr ) ;
    }
    ctr = 0 ;
    dire = ! dire ;
  }
  String ans = "Yes" ;
  int X = ( Integer . parseInt ( s ) - x ) / 2 ;
  int x0 = xi . remove ( 0 ) ;
  Hashtable < Integer , Boolean > Hx = new Hashtable < Integer , Boolean > ( ) ;
  for ( int i = 0 ;
  i < xi . size ( ) ;
  i ++ ) {
    for ( int j : Hx . keySet ( ) ) {
      Hx . put ( j + i , true ) ;
    }
  }
  int Y = ( Integer . parseInt ( s ) - y ) / 2 ;
  Hashtable < Integer , Boolean > Hy = new Hashtable < Integer , Boolean > ( ) ;
  if ( ( x0 + Integer . parseInt ( s ) - x ) % 2 != 0 || ( Integer . parseInt ( s ) - y ) % 2 != 0 ) ans = "No" ;
  return ans ;
}
