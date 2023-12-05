static final double [ ] [ ] read ( Reader in ) throws IOException {
  final int N = in . nextInt ( ) ;
  final int [ ] [ ] S = new int [ N ] [ N ] ;
  {
    readLetters ( in ) ;
  }
  {
    solveSmall ( in ) ;
  }
  {
    final int [ ] S = new int [ N ] ;
    Arrays . fill ( S , '+' ) ;
    return Arrays . copyOf ( S , S . length - 1 ) ;
  }
  {
    solveLarge ( in ) ;
  }
  {
    final int [ ] S = new int [ N ] ;
    Arrays . fill ( S , '-' ) ;
    for ( int i = 0 ;
    i < S . length ;
    i ++ ) {
      S [ i ] = '+' ;
    }
    for ( int i = 0 ;
    i < S . length ;
    i ++ ) {
      S [ i ] = '-' ;
    }
    for ( int i = 0 ;
    i < S . length ;
    i ++ ) {
      S [ i ] = '-' ;
    }
    for ( int i = 0 ;
    i < S . length ;
    i ++ ) {
      S [ i ] = '+' ;
    }
    for ( int i = 0 ;
    i < S . length ;
    i ++ ) {
      S [ i ] = '-' ;
    }
  }
  {
    final String readWord ( in ) . trim ( ) ;
  }
  {
    final int [ ] readInt = new int [ N ] ;
    final int b = in . nextInt ( ) ;
    return Integer . parseInt ( readWord ( in ) , b ) ;
  }
  {
    final List < String > readLetters = new LinkedList < > ( ) ;
    for ( int i = 0 ;
    i < N ;
    i ++ ) {
      readLetters . add ( readWord ( in ) ) ;
    }
    final int [ ] readDigits = new int [ N ] ;
    for ( int i = 0 ;
    i < N ;
    i ++ ) {
      readDigits [ i ] = readWord ( in ) . split ( " " ) ;
    }
    final int [ ] readInts = new int [ N ] ;
    for ( int i = 0 ;
    i < N ;
    i ++ ) {
      readInts [ i ] = readWord ( in ) . split ( " " ) ;
    }
    final int [ ] readFloats = new int [ N ] ;
    for ( int i = 0 ;
    i < N ;
    i ++ ) {
      readFloats [ i ] = readWord ( in ) . split ( " " ) ;
    }
  }
  @ Override public static