@ VisibleForTesting static < T > T solve ( ) {
  final Range < T > range = xrange ;
  final Collection < String > list = new Collection < String > ( ) ;
  final Class < T > gcj = T . class ;
  final InputStream IN = System . in ;
  final StringBuilder buf = null ;
  final Function < T , String > identity = new Function < T , String > ( ) {
    @ Override public String apply ( T t ) {
      return t . toString ( ) ;
    }
  }
  ;
  @ Override public String readLineRaw ( ) {
    if ( buf != null ) {
      buf . append ( buf . toString ( ) ) ;
      buf = null ;
    }
    else {
      buf = IN . readLine ( ) ;
    }
    if ( buf == null ) {
      throw new EOFException ( ) ;
    }
    return buf . toString ( ) ;
  }
  @ Override public String readLineView ( ) {
    String line = readLineRaw ( ) ;
    if ( line == null ) {
      throw new NullPointerException ( ) ;
    }
    return line ;
  }
  @ Override public String line ( T t ) {
    return "" ;
  }
  @ Override public String toString ( ) {
    return "" ;
  }
  @ Override public String toString ( ) {
    return "" ;
  }
  @ Override public String toString ( ) {
    return "" ;
  }
  @ Override public String toString ( ) {
    return "" ;
  }
  @ Override public String toString ( ) {
    return "" ;
  }
  @ Override public String toString ( ) {
    return "" ;
  }
  @ Override public String toString ( ) {
    return "" ;
  }
  @ Override public String toString ( ) {
    return "" ;
  }
  @ Override public String toString ( ) {
    return "" ;
  }
  @ Override public String toString ( ) {
    return "" ;
  }
  @ Override public String toString ( ) {
    return "" ;
  }
  @ Override public String toString ( ) {
    return "" ;
  }
  @ Override public String toString ( ) {
    return "" ;
  }
  @ Override public String toString ( ) {
    return "" ;
  }
  @ Override public String toString ( ) {
    return "" ;
  }
  @ Override public String toString ( ) {
    return "" ;
  }
  @ Override public String toString ( ) {
    return "" ;
  }
  @ Override public String toString ( ) {
    return "" ;
  }
  @ Override public String toString ( ) {
    return "" ;
  }
}
;
return new String [ ] {
  gcj . token ( int . class ) , gcj . token ( int . class ) }
  ;
}
