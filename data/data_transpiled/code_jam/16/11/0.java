@ VisibleForTesting static < T > T solve ( ) {
  Range range = Range . range ( ) ;
  final Collection < T > c = new Collection < T > ( ) ;
  class gcj {
    final InputStream IN = System . in ;
    final byte [ ] buf = null ;
    final Function < T , String > identity = new Function < T , String > ( ) {
      @ Override public String apply ( T t ) {
        return t . toString ( ) ;
      }
    }
    ;
    @ Override public String readLineRaw ( ) {
      String res ;
      if ( buf != null ) {
        res = buf ;
        buf = null ;
      }
      else {
        res = IN . readLine ( ) ;
      }
      if ( res == null ) {
        throw new EOFException ( ) ;
      }
      return res ;
    }
    @ Override public String readLineView ( ) {
      String line = readLineRaw ( ) ;
      if ( line == null ) {
        throw new EOFException ( ) ;
      }
      return line ;
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
    @ Override public String [ ] toString ( ) {
      return new String [ ] {
        "" ;
      }
    }
    ;
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
