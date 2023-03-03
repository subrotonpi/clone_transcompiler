static final Queue < Integer > queue = new LinkedList < Integer > ( ) {
  final double INF = Double . MAX_VALUE ;
  class Bit {
    int size ;
    int [ ] tree = new int [ n + 1 ] ;
    public Bit ( int n ) {
      this . size = n ;
      this . tree = new int [ n + 1 ] ;
    }
    public int sum ( int i ) {
      int s = 0 ;
      while ( i > 0 ) {
        s += tree [ i ] ;
        i -= i & - i ;
      }
      return s ;
    }
    public void add ( int i , int x ) {
      while ( i <= size ) {
        tree [ i ] += x ;
        i += i & - i ;
      }
    }
  }
  ;
  /* solve N M M a List of integers */
  ArrayList < Integer > ab = new ArrayList < Integer > ( ) ;
  for ( int i = 0 ;
  i < size ;
  i ++ ) {
    ab . add ( i ) ;
  }
  Collections . sort ( ab , new Comparator < Integer > ( ) {
    public int compare ( Integer a , Integer b ) {
      int cut [ ] = new int [ a ] ;
      for ( int j = 0 ;
      j < b ;
      j ++ ) {
        if ( a <= cut [ j ] ) continue ;
        cut [ j ] = b - 1 ;
      }
      return cut [ j ] ;
    }
  }
  ) ;
  /* main loop */
  for ( String line : System . console ( ) . readLine ( ) . split ( " " ) ) {
    for ( String word : line . split ( " " ) ) {
      /* print word */
      System . out . println ( word ) ;
    }
  }
  final LinkedList < Integer > tokens = new LinkedList < Integer > ( ) ;
  final int N = Integer . parseInt ( ( String ) tokens . get ( 0 ) ) ;
  final int M = Integer . parseInt ( ( String ) tokens . get ( 1 ) ) ;
  final int [ ] a = new int [ M ] ;
  final int [ ] b = new int [ M ] ;
  for ( int i = 0 ;
  i < M ;
  i ++ ) {
    a [ i ] = Integer . parseInt ( ( String ) tokens . get ( 2 ) ) ;
    b [ i ] = Integer . parseInt ( ( String ) tokens . get ( 3 ) ) ;
  }
  /* print word */
  System . out . println ( " " + tokens . get ( 0 ) ) ;
  return tokens . get ( 1 )