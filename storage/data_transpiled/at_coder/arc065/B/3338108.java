public static void main ( String [ ] args ) {
  int n = Integer . parseInt ( input . nextLine ( ) ) ;
  int k = Integer . parseInt ( input . nextLine ( ) ) ;
  int l = Integer . parseInt ( input . nextLine ( ) ) ;
  List < Edge > pq = getEdges ( k ) ;
  List < Edge > rs = getEdges ( l ) ;
  List < Integer > roadGroups = getGroup ( n , pq ) ;
  List < Integer > railGroups = getGroup ( n , rs ) ;
  Map < Integer , Integer > count = new HashMap < Integer , Integer > ( ) ;
  for ( int i = 0 ;
  i < n ;
  i ++ ) {
    Integer gp = new Integer ( find ( i , roadGroups ) ) ;
    if ( ! count . containsKey ( gp ) ) {
      count . put ( gp , 1 ) ;
    }
    else {
      count . get ( gp ) ++ ;
    }
  }
  Integer [ ] res = new Integer [ n ] ;
  for ( int i = 0 ;
  i < n ;
  i ++ ) {
    Integer gp = new Integer ( find ( i , roadGroups ) ) ;
    Integer q1 = new Integer ( find ( i , railGroups ) ) ;
    res [ i ] = count . get ( gp ) ;
  }
  System . out . println ( Arrays . toString ( res ) ) ;
}
