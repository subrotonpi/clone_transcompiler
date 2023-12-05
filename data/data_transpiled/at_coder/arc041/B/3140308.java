public static void main ( String input ) {
  int n = Integer . parseInt ( input ) ;
  int m = Integer . parseInt ( input ) ;
  List < List < Integer >> b = new ArrayList < > ( ) ;
  for ( int i = 0 ;
  i < n ;
  i ++ ) b . add ( Collections . singletonList ( Integer . parseInt ( input ) ) ) ;
  int [ ] [ ] a = new int [ n ] [ m ] ;
  for ( int i = 0 ;
  i < n ;
  i ++ ) a [ i ] = new int [ m ] ;
  for ( int i = 0 ;
  i < n ;
  i ++ ) a [ i ] [ 0 ] = 0 ;
  for ( int i = 0 ;
  i < m ;
  i ++ ) for ( int j = 1 ;
  j < m - 1 ;
  j ++ ) {
    int x = Math . min ( b . get ( i + 1 ) [ j ] , b . get ( i - 1 ) [ j ] , b . get ( i ) [ j + 1 ] , b . get ( i ) [ j - 1 ] ) ;
    a [ i ] [ j ] += x ;
    b . get ( i + 1 ) [ j ] -= x ;
    b . get ( i - 1 ) [ j ] -= x ;
    b . get ( i + 1 ) [ j ] -= x ;
    b . get ( i ) [ j + 1 ] -= x ;
    b . get ( i ) [ j - 1 ] -= x ;
  }
  for ( int i = 0 ;
  i < a . length ;
  i ++ ) System . out . println ( Arrays . toString ( a [ i ] ) ) ;
}
