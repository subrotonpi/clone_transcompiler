@ Sys public static String main ( String [ ] args ) {
  int k = Integer . parseInt ( stdin . readLine ( ) ) ;
  List < List < Integer >> a = new ArrayList < > ( ) ;
  for ( int i = 0 ;
  i < xrange ( k ) ;
  i ++ ) {
    List < Integer > v = map . get ( stdin . readLine ( ) ) ;
    int z = i < k ? 0 : i + 1 - k ;
    for ( int j = 0 ;
    j < v . size ( ) ;
    j ++ ) {
      a . get ( j + z ) . add ( v . get ( j ) ) ;
    }
  }
  /* sprPtw(List<Integer> b) {
  if (k == 1) return 0;
  for (int ll = k; ll < k) {
  int l = k - ll;
  boolean ok = true;
  for (int x = k; x < l; x++) {
  for (int y = k ; y < l; y++) {
  if (b.get(x).get(y) != b.get(l-1-y).get(l-1-x)) {
  ok = false;
  }
  }
  if (ok) return ll;
  }
  }
  int x1 = sprPtw(a);
  a.reverse();
  int x2 = sprPtw(a);
  for (List<Integer> c : a) {
  c.reverse();
  }
  int x3 = sprPtw(a);
  a.reverse();
  int x4 = sprPtw(a);
  int kk = k+Math.min(x1,x3)+Math.min(x2,x4);
  return String.valueOf(kk*kk-k*k);
  }*/
  int tno = Integer . parseInt ( stdin . readLine ( ) ) ;
  for