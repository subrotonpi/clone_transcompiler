static final int [ ] [ ] getRelationships ( ) {
  int N = Integer . parseInt ( input . readLine ( ) . replaceAll ( " " , "" ) ) ;
  int M = Integer . parseInt ( input . readLine ( ) . replaceAll ( " " , "" ) ) ;
  boolean [ ] [ ] relationships = new boolean [ N + 1 ] [ N + 1 ] ;
  for ( int i = 0 ;
  i < M ;
  i ++ ) {
    int a = Integer . parseInt ( input . readLine ( ) . replaceAll ( " " , "" ) ) ;
    int b = Integer . parseInt ( input . readLine ( ) . replaceAll ( " " , "" ) ) ;
    relationships [ a ] [ b ] = true ;
    relationships [ b ] [ a ] = true ;
  }
  for ( int i = 1 ;
  i <= N ;
  i ++ ) {
    relationships [ i ] [ i ] = true ;
  }
  return new AbstractList < Integer > ( ) {
    @ Override public Integer get ( int lst1 , int lst2 ) {
      Integer [ ] array = new Integer [ lst1 ] ;
      return array . get ( lst2 ) ;
    }
  }
  ;
}
