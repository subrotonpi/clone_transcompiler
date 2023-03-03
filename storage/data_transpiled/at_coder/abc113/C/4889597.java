private static void print ( int n , int m ) {
  List < Tuple > PY = new ArrayList < > ( ) ;
  for ( int i = 0 ;
  i < m ;
  i ++ ) {
    PY . add ( Tuple . parse ( input . nextLine ( ) ) ) ;
  }
  List < Tuple > sPY = new ArrayList < > ( PY ) ;
  Collections . sort ( sPY , new Comparator < Tuple > ( ) {
    @ Override public int compare ( Tuple o1 , Tuple o2 ) {
      return ( o1 . x ) - ( o2 . x ) ;
    }
  }
  ) ;
  Map < Object , Integer > ans = new HashMap < > ( ) ;
  Object key = 1 , cnt = 1 ;
  for ( Tuple p : sPY ) {
    if ( p != key ) {
      key = p ;
      cnt = 1 ;
    }
    ans . put ( o2 , cnt ++ ) ;
  }
  for ( Tuple p : PY ) {
    String a = p . toString ( ) . replaceAll ( " " , "" ) ;
    String b = ans . get ( p ) . toString ( ) . replaceAll ( " " , "" ) ;
    System . out . println ( a + b ) ;
  }
}
