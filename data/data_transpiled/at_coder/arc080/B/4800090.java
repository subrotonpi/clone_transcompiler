public static void main ( String input , int height , int wide ) {
  int n = Integer . parseInt ( input ) ;
  ArrayList < Integer > ansList = new ArrayList < > ( ) ;
  int [ ] a = new int [ n ] ;
  for ( int i = 0 ;
  i < n ;
  i ++ ) {
    a [ i ] = Integer . parseInt ( input ) ;
  }
  for ( int i = 0 ;
  i < a . length ;
  i ++ ) {
    for ( int l = 0 ;
    l < a [ i ] ;
    l ++ ) {
      ansList . add ( i + 1 ) ;
    }
  }
  for ( int k = 0 ;
  k < height ;
  k ++ ) {
    ArrayList < Integer > t = new ArrayList < > ( ) ;
    t . add ( ansList . get ( k * wide ) ) ;
    if ( k % 2 == 1 ) {
      t . reverse ( ) ;
    }
    System . out . println ( StringUtils . toString ( t ) ) ;
  }
}
