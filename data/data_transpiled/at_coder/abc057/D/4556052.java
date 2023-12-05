static final double cmb ( int n , int a , int b ) {
  final int n = Integer . parseInt ( input . nextLine ( ) ) ;
  final int a = Integer . parseInt ( input . nextLine ( ) ) ;
  final int b = Integer . parseInt ( input . nextLine ( ) ) ;
  final List < Integer > v = new LinkedList < Integer > ( ) ;
  for ( int i = 0 ;
  i < n ;
  i ++ ) v . add ( Integer . parseInt ( input . nextLine ( ) ) ) ;
  Collections . sort ( v ) ;
  final double res = Double . parseDouble ( v . get ( n - a ) ) ;
  final int x = Math . min ( v . get ( n - a ) , a ) ;
  final HashMap < Integer , Double > nCr = new HashMap < Integer , Double > ( ) ;
  /* if (n == 0 || n == 1) return 1; if (n == 1) return n; if (nCr.containsKey(new Integer(n))) return nCr.get(new Integer(n)); nCr.put(new Integer(n), cmb(n-1, r)+cmb(n-1, r-1)); return nCr.get(new Integer(n)); */
  if ( v . get ( n - 1 ) != x ) {
    System . out . println ( res ) ;
    final double c = v . get ( n - a ) . doubleValue ( ) ;
    final int m = v . stream ( ) . mapToDouble ( x -> x ) . sum ( ) ;
    System . out . println ( cmb ( m , c ) ) ;
  }
  else {
    System . out . println ( res ) ;
    double ans = 0 ;
    final int m = v . stream ( ) . mapToDouble ( x -> x ) . sum ( ) ;
    for ( int i = a ;
    i <= Math . min ( m , b ) ;
    i ++ ) ans += cmb ( m , i ) ;
    System . out . println ( ans ) ;
  }
  return res ;
}
