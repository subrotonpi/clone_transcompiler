public static int tc = Integer . parseInt ( input . nextLine ( ) . trim ( ) ) ;
for ( int t = 0 ;
t < tc ;
t ++ ) {
  int r = Integer . parseInt ( input . nextLine ( ) . trim ( ) ) ;
  int c = Integer . parseInt ( input . nextLine ( ) . trim ( ) ) ;
  String [ ] [ ] m = r * new String [ r ] [ c ] ;
  for ( int i = 0 ;
  i < r ;
  i ++ ) {
    String [ ] a = input . split ( " " ) ;
    m [ i ] = new String [ c ] ;
    for ( int j = 0 ;
    j < c ;
    j ++ ) {
      a [ j ] = a [ j ] ;
    }
  }
  Map < Integer , List < String >> result = new HashMap < Integer , List < String >> ( ) ;
  for ( int i = 0 ;
  i < r ;
  i ++ ) {
    if ( m [ i ] . indexOf ( '.' ) == c ) continue ;
    boolean lb = true ;
    boolean rb = true ;
    for ( int j = 0 ;
    j < c ;
    j ++ ) {
      if ( lb && m [ i ] [ j ] != '.' ) {
        result . computeIfAbsent ( new Integer ( i ) , j -> new ArrayList < String > ( ) ) . add ( "<" ) ;
        lb = false ;
      }
      if ( rb && m [ i ] [ c - 1 - j ] != '.' ) {
        result . computeIfAbsent ( new Integer ( i ) , j -> new ArrayList < String > ( ) ) . add ( ">" ) ;
        rb = false ;
      }
    }
  }
  for ( int j = 0 ;
  j < c ;
  j ++ ) {
    if ( Arrays . asList ( m [ i ] ) . indexOf ( '.' ) == r ) continue ;
    boolean tb = true ;
    boolean bb = true ;
    for ( int i = 0 ;
    i < r ;
    i ++ ) {
      if ( tb && m [ i ] [ j ] != '.' ) {
        result . computeIfAbsent ( new Integer ( i ) , j -> new ArrayList < String > ( ) ) . add ( "^" ) ;
        tb = false ;
      }
      if ( bb && m [ r - 1 - i ] [ j ] != '.' ) {
        result . computeIfAbsent ( new Integer ( r - 1 - i ) , j -> new ArrayList < String > ( ) ) . add ( "