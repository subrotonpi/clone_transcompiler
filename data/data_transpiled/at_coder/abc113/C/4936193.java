private static void print ( int n , int m ) {
  List < Integer > pys = new ArrayList < > ( ) ;
  for ( int i = 0 ;
  i < m ;
  i ++ ) {
    pys . add ( Collections . singletonList ( Integer . parseInt ( input . nextLine ( ) ) ) ) ;
  }
  Map < Integer , List < Integer >> map_ = new HashMap < > ( ) ;
  for ( int i = 0 ;
  i < pys . size ( ) ;
  i ++ ) {
    final int p = i ;
    map_ . computeIfAbsent ( p , k -> new ArrayList < > ( ) ) ;
    map_ . get ( p ) . add ( i ) ;
  }
  for ( List < Integer > val : map_ . values ( ) ) {
    Collections . sort ( val , new Comparator < Integer > ( ) {
      @ Override public int compare ( Integer o1 , Integer o2 ) {
        return pys . get ( o1 ) . compareTo ( pys . get ( o2 ) ) ;
      }
    }
    ) ;
  }
  List < String > ans = new ArrayList < > ( m ) ;
  ans . add ( null ) ;
  for ( Map . Entry < Integer , List < Integer >> entry : map_ . entrySet ( ) ) {
    for ( int num = entry . getValue ( ) . size ( ) ;
    num < m ;
    num ++ ) {
      int i = entry . getValue ( ) . get ( num ) ;
      ans . add ( i + "" + ( num + 1 ) ) ;
    }
  }
  for ( String a : ans ) {
    System . out . println ( a ) ;
  }
}
