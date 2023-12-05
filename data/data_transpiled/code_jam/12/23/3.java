public static List < Integer > readLineInts ( ) throws IOException {
  return Arrays . stream ( fin . readLine ( ) . trim ( ) . split ( " " ) ) . map ( num -> Integer . parseInt ( num ) ) . collect ( Collectors . toList ( ) ) ;
  final List < Integer > orderedSubsetsSums = new ArrayList < > ( ) ;
  final List < Integer > S = new ArrayList < > ( ) ;
  final int lim = Integer . SIZE / 2 ;
  for ( int i = 1 ;
  i < S . size ( ) ;
  i ++ ) {
    for ( int subset : new int [ S . size ( ) ] ;
    subset > 0 ;
    subset -- ) {
      final int subSum = Integer . valueOf ( subset ) ;
      if ( subSum > lim ) {
        break ;
      }
      Collections . addAll ( S , subset , subSum ) ;
    }
  }
  final Comparator < Integer > findCollision = new Comparator < Integer > ( ) {
    public int compare ( Integer o1 , Integer o2 ) {
      final Map < Integer , Integer > sums = new HashMap < > ( ) ;
      for ( int sub : orderedSubsetsSums ) {
        final int subSum = Integer . valueOf ( sub ) ;
        if ( sums . containsKey ( subSum ) ) {
          return sums . get ( subSum ) + sub ;
        }
        sums . put ( subSum , sub ) ;
      }
      return 0 ;
    }
  }
  ;
  final String fileName = "C-large" ;
  try ( BufferedReader fin = new BufferedReader ( new FileReader ( fileName + ".in" ) ) ;
  BufferedWriter fout = new BufferedWriter ( new FileWriter ( fileName + ".out" ) ) ) {
    int numcases = readLineInts ( ) . intValue ( ) ;
    System . out . println ( numcases + " cases" ) ;
    for ( int caseno = 1 ;
    caseno <= numcases ;
    caseno ++ ) {
      final int N = readLineInts ( ) ;
      final int [ ] S = new int [ N ] ;
      Arrays . sort ( S ) ;
      final int [ ] coll = findCollision . compare ( S , N ) ;
      final String result ;
      if ( coll == null ) {
        result = "Impossible" ;
      }
      else {
        final int [ ] s1 = coll [ 0 ] ;
        final int [ ] s2 = coll [ 1 ] ;
        result = Arrays . toString ( s1 ) + "\n" + Arrays . toString ( s2 ) ;
      }
      final String outStr = "Case #" + caseno + ":\n"