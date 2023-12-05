static final void main ( String [ ] args ) {
  final int i ;
  final double INF = Double . MAX_VALUE ;
  /* TODO Auto-generated method stub */
  if ( args [ 0 ] . charAt ( 0 ) != 'A' ) {
    System . out . println ( "WA" ) ;
    return ;
  }
  if ( args [ 2 ] . substring ( 2 , args . length - 1 ) . indexOf ( "C" ) != 1 ) {
    System . out . println ( "WA" ) ;
    return ;
  }
  boolean flag = false ;
  for ( i = 0 ;
  i < args . length ;
  i ++ ) {
    final char c = args [ i ] . charAt ( 0 ) ;
    if ( i == 0 ) {
      continue ;
    }
    if ( ( 'a' <= c && c <= 'z' ) ) {
      continue ;
    }
    else if ( 1 < i && i < args . length - 1 && c == 'C' && flag == false ) {
      flag = true ;
      continue ;
    }
    else {
      System . out . println ( "WA" ) ;
      return ;
    }
  }
  System . out . println ( "AC" ) ;
  /* TODO Auto-generated method stub */
  final Iterator < String > tokens = new Iterator < String > ( ) {
    @ Override public boolean hasNext ( ) {
      return i < args . length ;
    }
    @ Override public String next ( ) {
      final String s = args [ i + 1 ] ;
      final int length = s . length ( ) ;
      final int index = 0 ;
      final int len = s . length ( ) ;
      final int length = s . length ( ) ;
      final int i = index + 1 ;
      final int j = 0 ;
      while ( j < len ) {
        final int k = s . indexOf ( ' ' , j ) ;
        if ( k < 0 ) {
          j ++ ;
        }
        else {
          System . out . println ( "WA" ) ;
        }
      }
      return true ;
    }
  }
  ;
  /* TODO Auto-generated method stub */
  final Iterator < String > tokens = tokens . iterator ( ) ;
  final String S = tokens . next ( ) ;
  solve ( S ) ;
}
