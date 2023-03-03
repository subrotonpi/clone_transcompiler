public static Node compute ( String s ) throws IOException {
  Node root = new Node ( ) ;
  Node cur = root ;
  int i = 0 ;
  while ( i < s . length ( ) ) {
    char c = s . charAt ( i ) ;
    if ( c == ' ' ) {
      i ++ ;
      continue ;
    }
    if ( c == '(' ) {
      if ( cur . contains ( "r" ) ) {
        cur . setL ( new Node ( cur ) ) ;
        cur = cur . getL ( ) ;
      }
      else {
        cur . setR ( new Node ( cur ) ) ;
        cur = cur . getR ( ) ;
      }
      i ++ ;
      String p = "" ;
      while ( s . charAt ( i ) != ' ' && s . charAt ( i ) != ')' ) {
        p += s . charAt ( i ) ;
        i ++ ;
      }
      cur . setV ( Double . parseDouble ( p ) ) ;
      if ( s . charAt ( i ) != ')' ) {
        p = "" ;
        i ++ ;
        while ( s . charAt ( i ) != '(' ) {
          p += s . charAt ( i ) ;
          i ++ ;
        }
        cur . a = p ;
      }
    }
    if ( s . charAt ( i ) == ')' ) {
      cur = cur . getP ( ) ;
      i ++ ;
    }
  }
  return root ;
}
root = new Node ( ) ;
BufferedReader br = new BufferedReader ( new FileReader ( "p1.in" ) ) ;
int T = Integer . parseInt ( br . readLine ( ) ) ;
for ( int x = 0 ;
x < T ;
x ++ ) {
  System . out . println ( "Case #" + ( x + 1 ) + ":" ) ;
  int L = Integer . parseInt ( br . readLine ( ) ) ;
  String s = "" ;
  for ( int i = 0 ;
  i < L ;
  i ++ ) s += br . readLine ( ) . substring ( 0 , s . length ( ) - 1 ) ;
  String old ;
  do {
    old = s ;
    s = s . replace ( "  " , " " ) ;
  }
  while ( true ) ;
  s = s . replace ( " )" , ")" ) ;
  s = s . replace ( ") " , ")" ) ;
  s = s . replace ( "( " , "(" ) ;
  root = compute ( s ) ;
  int n = Integer . parseInt ( br . readLine ( )