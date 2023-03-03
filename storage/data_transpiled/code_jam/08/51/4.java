@ GwtIncompatible ( "java.lang.ref.WeakReference" ) public static void main ( ) throws IOException {
  final int MAXSIZE = 100 ;
  {
    final int [ ] [ ] board = new int [ 4 * MAXSIZE + 3 ] [ 4 * MAXSIZE + 3 ] ;
    final int [ ] pos = new int [ 2 ] ;
    final int [ ] dir = new int [ 2 ] ;
    for ( int i = 0 ;
    i <= L ;
    i ++ ) {
      final int S = Integer . parseInt ( input . readLine ( ) ) ;
      final int T = Integer . parseInt ( input . readLine ( ) ) ;
      Arrays . fill ( path , ( char ) ( S >>> 1 ) ) ;
      final int [ ] path = new int [ S ] ;
      Arrays . fill ( path , ( char ) ( S >>> 1 ) ) ;
      final int [ ] line = new int [ S ] ;
      System . arraycopy ( path , 0 , line , 0 , S ) ;
      final int end = System . currentTimeMillis ( ) ;
      System . out . println ( "Case #" + testCase . toString ( ) + ": " + res . toString ( ) + "\n" ) ;
      System . out . println ( "Took " + end - start ) ;
    }
    output . close ( ) ;
    final int [ ] [ ] result = new int [ 2 ] [ ] ;
    for ( int i = 0 ;
    i <= L ;
    i ++ ) {
      result [ i ] = result [ i ] [ 2 * i ] ;
    }
    System . arraycopy ( line , 0 , result , 0 , result . length ) ;
    final int [ ] [ ] result = new int [ 2 ] [ ] ;
    for ( int i = 0 ;
    i <= L ;
    i ++ ) {
      result [ i ] [ 0 ] = result [ i ] [ 1 ] ;
      result [ i ] [ 1 ] = result [ i ] [ 2 * i ] ;
    }
    System . arraycopy ( result , 0 , result , 0 , result . length ) ;
    for ( int i = 0 ;
    i <= L ;
    i ++ ) {
      final int S = Integer . parseInt ( result [ i ] [ 0 ] ) ;
      final int T = Integer . parseInt ( result [ i ] [ 1 ] ) ;
      result [ i ] [ 0 ] = result [ i ] [ 1 ] ;
      result [ i ] [ 1 ] = result [ i ] [ 2 * i ] ;
    }
    System . arraycopy ( result , 0 , result ,