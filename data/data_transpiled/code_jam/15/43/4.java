static void solve ( int tt ) {
  final int n = Integer . parseInt ( input . nextLine ( ) ) ;
  String [ ] [ ] data = new String [ n ] [ ] ;
  for ( int i = 0 ;
  i < n ;
  i ++ ) {
    data [ i ] = input . nextLine ( ) . split ( " " ) ;
  }
  final int S = 0 ;
  final int T = 1 ;
  final int [ ] [ ] g = new int [ 2 ] [ ] ;
  final int [ ] [ ] m = new int [ 2 ] [ ] ;
  {
    edge ( u , v , c ) ;
    g [ u ] [ v ] = new int [ c ] ;
    g [ v ] [ v ] = new int [ c ] ;
    g [ v ] [ u ] = new int [ c ] ;
    g [ u ] [ v ] = new int [ c ] ;
    g [ u ] [ v ] = new int [ c ] ;
    g [ u ] [ v ] = new int [ c ] ;
    g [ u ] [ v ] = new int [ c ] ;
    g [ u ] [ v ] = new int [ c ] ;
    g [ u ] [ v ] = new int [ c ] ;
    g [ u ] [ v ] = new int [ c ] ;
    g [ u ] [ v ] = new int [ c ] ;
    g [ u ] [ v ] = new int [ c ] ;
    g [ u ] [ v ] = new int [ c ] ;
    g [ u ] [ v ] = new int [ c ] ;
    g [ u ] [ v ] = new int [ c ] ;
    g [ u ] [ v ] = new int [ c ] ;
    g [ u ] [ v ] = new int [ c ] ;
    g [ u ] [ v ] = new int [ c ] ;
    g [ u ] [ v ] = new int [ c ] ;
    g [ u ] [ v ] = new int [ c ] ;
    for ( int i = 0 ;
    i < c . length ;
    i ++ ) {
      int x = g [ u ] . length ;
      g [ u ] [ v ] [ x ] = new int [ c [ i ] ] ;
      g [ u ] [ v ] [ x ] = new int [ c [ i ] ] ;
      g [ u ] [ v ] [ x ] = new int [ c [ i ] ] ;
      g [ u ] [ v ] [ x ] = new int [ c [ i