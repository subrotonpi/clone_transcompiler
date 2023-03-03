static final List < Integer > getInts ( ) throws IOException {
  final BufferedReader br = new BufferedReader ( new InputStreamReader ( System . in ) ) ;
  String line ;
  while ( ( line = br . readLine ( ) ) != null ) {
    for ( String word : line . split ( " " ) ) {
      br . readLine ( ) ;
    }
  }
  return ints ;
  final List < Integer > ints = getInts ( ) ;
  final List < Double > doubles = getDoubles ( ) ;
  Comparator < Integer > comparator = new Comparator < Integer > ( ) {
    public int compare ( Integer myCompare , Integer o1 ) {
      class K implements Comparable < Integer > {
        private final long serialVersionUID = 1L ;
        @ Override public int compare ( Integer o1 , Integer o2 ) {
          return myCompare . compare ( o1 , o2 ) ;
        }
      }
      public int compare ( Integer o1 , Integer o2 ) {
        return myCompare . compare ( o1 , o2 ) ;
      }
      public int compare ( Integer o1 , Integer o2 ) {
        return myCompare . compare ( o1 , o2 ) ;
      }
      public int compare ( Integer o1 , Integer o2 ) {
        final long q = p1 . compareTo ( o2 ) ;
        final long a = p1 . hashCode ( ) ;
        final long c = p1 . compareTo ( o2 ) ;
        final long w = p2 . hashCode ( ) ;
        final long b = p2 . hashCode ( ) ;
        final long d = p2 . compareTo ( o1 ) ;
        int x = a * d - b * c ;
        if ( x == 0 ) {
          x = q - w ;
        }
        return x ;
      }
    }
  }
  ;
  int T = ( Integer ) ints . get ( 0 ) ;
  for ( int t = 0 ;
  t < T ;
  t ++ ) {
    /* solve */
    final int N = ( Integer ) ints . get ( t ) ;
    final List < List < Integer >> pairs = ( List < List < Integer >> ) new ArrayList < List < Integer >> ( N ) ;
    for ( int i = 0 ;
    i < N ;
    i ++ ) {
      pairs . add ( null ) ;
    }
    for ( int i = 0 ;
    i < N ;
    i ++ ) {
      pairs . add ( i , ( Integer ) ints . get ( i ) ) ;
    }
    for ( int i = 0 ;
    i < N ;
    i ++ ) {
      pairs . get ( i ) . add ( ( Integer ) ints . get ( i ) ) ;
    }
    System . out . println ( ( ( Integer ) pairs . get ( 0 ) ) . toString ( ) ) ;
    