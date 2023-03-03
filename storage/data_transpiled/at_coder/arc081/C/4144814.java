private static String abc = "abcdefghijklmnopqrstuvwxyz" ;
String A = String . valueOf ( input ) ;
int n = A . length ( ) ;
int [ ] [ ] word_pos = new int [ n ] [ 26 ] ;
int [ ] ct = new int [ 26 ] ;
int orda = ord ( "a" ) ;
for ( int i = n - 1 ;
i >= 0 ;
i -- ) {
  ct [ ord ( A . charAt ( i ) ) - orda ] = i ;
  word_pos [ i ] = ct . clone ( ) ;
}
Arrays . reverse ( word_pos ) ;
int [ ] dp = new int [ n + 1 ] ;
dp [ 0 ] = 1 ;
dp [ 1 ] = 0 ;
int j = n ;
ArrayList < Integer > sep = new ArrayList < Integer > ( ) ;
for ( int i = n - 1 ;
i >= 0 ;
i -- ) {
  ct = word_pos [ i ] ;
  if ( ( max ( ct ) < j ) && ( j < n ) ) {
    sep . add ( i ) ;
    j = min ( ct ) ;
  }
}
if ( ( j == n ) && ( j == n ) ) {
  for ( int i = 0 ;
  i < abc . length ;
  i ++ ) {
    if ( ( ! A . contains ( abc [ i ] ) ) && ( i < dp [ j ] ) ) {
      System . out . println ( abc [ i ] + "\n" ) ;
      break ;
    }
  }
}
else {
  Collections . reverse ( sep ) ;
  String ans = "" ;
  for ( int i = 0 ;
  i < abc . length ;
  i ++ ) {
    if ( ( ! A . contains ( abc [ i ] ) ) && ( i < dp [ j ] ) ) {
      ans += abc [ i ] ;
      break ;
    }
  }
  for ( int i = 0 ;
  i <= sep . size ( ) ;
  i ++ ) {
    int start = sep . get ( i ) ;
    int end ;
    try {
      end = sep . get ( i + 1 ) ;
    }
    catch ( Exception e ) {
      end = n ;
    }
    int next = word_pos [ start ] [ ord ( ans . charAt ( ans . length ( ) - 1 ) ) - orda ] ;
    for ( int i = 0 ;
    i <= 26 ;
    i ++ ) {
      if ( ( word_pos [ next + 1 ] [ i ] > end - 1 ) && ( i < ( end + 1 ) ) ) {
        ans += ( char