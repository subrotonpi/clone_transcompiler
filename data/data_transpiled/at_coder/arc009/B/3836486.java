public static String bWonderland ( String [ ] B , int N , String [ ] A ) {
  HashMap < String , Integer > mapToAtcoder = new HashMap < String , Integer > ( ) ;
  HashMap < String , String > mapToour = new HashMap < String , String > ( ) ;
  for ( int k = 0 ;
  k < B . length ;
  k ++ ) {
    String k = B [ k ] ;
    k = k . toString ( ) ;
    mapToAtcoder . put ( k , k ) ;
    mapToour . put ( k , B [ k ] ) ;
  }
  ArrayList < Integer > aAtcoder = new ArrayList < Integer > ( ) ;
  for ( String a : A ) {
    String tmp = "" ;
    for ( int i = 0 ;
    i < a . length ( ) ;
    i ++ ) {
      tmp += mapToAtcoder . get ( a . charAt ( i ) ) ;
    }
    aAtcoder . add ( Integer . parseInt ( tmp ) ) ;
  }
  Collections . sort ( aAtcoder ) ;
  ArrayList < String > anTmp = new ArrayList < String > ( ) ;
  for ( int i = 0 ;
  i < aAtcoder . size ( ) ;
  i ++ ) {
    String tmp = aAtcoder . get ( i ) ;
    for ( int j = 0 ;
    j < a . length ( ) ;
    j ++ ) {
      tmp += mapToour . get ( a . charAt ( j ) ) ;
    }
    anTmp . add ( tmp ) ;
  }
  String ans = anTmp . toString ( ) ;
  return ans ;
}
