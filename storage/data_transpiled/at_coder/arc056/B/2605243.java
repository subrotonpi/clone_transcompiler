static final Class < ? > array = Class . forName ( "java.util.Arrays" ) . getComponentType ( ) ;
class UnionFind implements Class < ? > {
  private int [ ] par = new int [ numberOfNodes ] ;
  private int [ ] rank = new int [ numberOfNodes ] ;
  @ Override public Object root ( Object node ) {
    if ( par [ node ] == node ) {
      return node ;
    }
    else {
      Object r = root ( par [ node ] ) ;
      par [ node ] = r ;
      return r ;
    }
  }
  @ Override public boolean isInTheSameSet ( Object node1 , Object node2 ) {
    return root ( node1 ) == root ( node2 ) ;
  }
  @ Override public void unite ( Object node1 , Object node2 ) {
    Object x = root ( node1 ) ;
    Object y = root ( node2 ) ;
    if ( x == y ) {
      // do nothing
    }
    else if ( rank [ x ] < rank [ y ] ) {
      par [ x ] = y ;
    }
    else {
      par [ y ] = x ;
      if ( rank [ x ] == rank [ y ] ) rank [ x ] ++ ;
    }
  }
}
int n = Integer . parseInt ( input ( ) ) ;
int m = Integer . parseInt ( input ( ) ) ;
int s = Integer . parseInt ( input ( ) ) ;
Map < Integer , Integer > g = new LinkedHashMap < > ( ) ;
for ( int i = 0 ;
i < m ;
i ++ ) {
  Integer u = Integer . parseInt ( input ( ) ) ;
  Integer v = Integer . parseInt ( input ( ) ) ;
  g . put ( u , v ) ;
  g . put ( v , u ) ;
}
UnionFind uf = new UnionFind ( n + 1 ) ;
List < Integer > ans = new ArrayList < > ( ) ;
for ( int i = n ;
i > 0 ;
i -- ) {
  for ( Integer vi : g . get ( i ) ) {
    if ( vi > i ) uf . unite ( i , vi ) ;
  }
  if ( uf . isInTheSameSet ( s , i ) ) ans . add ( i ) ;
}
Collections . sort ( ans ) ;
System . out . println ( StringUtils . join ( ans ) ) ;
return ans ;
}
