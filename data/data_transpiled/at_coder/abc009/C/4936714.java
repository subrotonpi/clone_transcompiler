@ GwtIncompatible ( "java.util.Arrays" ) public static void copyOfRange ( List < Integer > dc ) {
  final int [ ] s = dc . toArray ( l ) ;
  s [ a ] = s [ b ] ;
  s [ b ] = s [ a ] ;
  s [ a ] = s [ b ] ;
  s [ b ] = s [ a ] ;
  s [ a ] = s [ b ] ;
  s [ b ] = s [ a ] ;
  s [ a ] = s [ a ] ;
  s [ b ] = s [ b ] ;
  s [ a ] = s [ a ] ;
  s [ b ] = s [ b ] ;
  int cnt = 0 ;
  for ( int i = 0 ;
  i < s . length ;
  i ++ ) {
    if ( s [ i ] != s [ i ] ) {
      cnt ++ ;
    }
  }
  final Scanner input = new Scanner ( System . in ) ;
  final int n = Integer . parseInt ( input . nextLine ( ) ) ;
  final int k = Integer . parseInt ( input . nextLine ( ) ) ;
  final int [ ] m = new int [ n ] ;
  for ( int i = 0 ;
  i < m . length ;
  i ++ ) {
    m [ i ] = s [ i ] ;
  }
  c = Arrays . copyOf ( m , n ) ;
  for ( int i = 0 ;
  i < m . length ;
  i ++ ) {
    c [ i ] = m [ i ] ;
  }
  for ( int i = 0 ;
  i < m . length ;
  i ++ ) {
    c [ i ] = i ;
  }
  System . out . println ( Arrays . toString ( c ) ) ;
}
