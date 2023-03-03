@ GwtIncompatible ( "java.util.Arrays" ) private static < T > void solve ( T [ ] s ) {
  /* List<Pair<T,Integer>> lst = new ArrayList<Pair<T,Integer>>(); int p = s[0], c = 1;
  for (int e = s[1]; e < s[2]; e++) {
  if (p != e) {
  lst.add(new Pair<T,Integer>(p, c));
  p = e;
  c = 1;
  }
  else c ++;
  }*/
  lst . add ( new Pair < T , Integer > ( p , c ) ) ;
  /* List<Pair<T,Integer>> lst = new ArrayList<Pair<T,Integer>>();
  for (Pair<T,Integer> tpl : lst) {
  for (Pair<T,Integer> e : tpl.getSecond()) {
  for (Pair<T,Integer> e : e.getSecond()) {
  for (Pair<T,Integer> e : tpl.getSecond()) {
  if (de.equals(de2)) return;
  }
  }
  }
  }*/
  /* List<Pair<T,Integer>> lst = new ArrayList<Pair<T,Integer>>();
  for (int i : xrange(1, max(lst))) {
  int tmp = 0;
  for (Pair<T,Integer> e : lst) {
  tmp += Math.abs(e.first() - e.second());
  }
  res = Math.min(res, tmp);
  }
  solve(lst);
  */
  int n = Integer . parseInt ( input . nextLine ( ) ) ;
  lst = new ArrayList < Pair < T ,