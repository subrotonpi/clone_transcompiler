@ VisibleForTesting static < T > T solve ( ) {
  Range range = Range . range ( 0 , 2 ) ;
  final Collection < T > data = new Collection < T > ( ) ;
  class gcj {
    IN = Thread . currentThread ( ) ;
    buf = null ;
    identity = new Object ( ) {
      @ Override public boolean hasNext ( ) {
        return true ;
      }
      @ Override public T next ( ) {
        if ( hasNext ( ) ) {
          T res = buf ;
          buf = null ;
        }
        else {
          T res = IN . next ( ) ;
        }
        if ( hasNext ( ) ) {
          return res ;
        }
        int n = gcj . token ( Integer . MIN_VALUE ) ;
        int [ ] data = gcj . tokens ( n ) ;
        for ( int i = 0 ;
        i < data . length ;
        i ++ ) {
          int d2 = data [ i ] ;
          if ( ! ( data [ i ] & d2 ) ) {
            continue ;
          }
          int res = Math . min ( res , Integer . valueOf ( d ^ d2 ) . count ( "1" ) ) ;
          return res ;
        }
      }
      @ Override public T next ( ) {
        int n = gcj . token ( Integer . MIN_VALUE ) ;
        int [ ] data = gcj . tokens ( n ) ;
        for ( int i = 0 ;
        i < data . length ;
        i ++ ) {
          int d2 = data [ i ] ;
          if ( ! ( data [ i ] & d2 ) ) {
            continue ;
          }
          int res = Math . min ( res , Integer . valueOf ( d ^ d2 ) . count ( "1" ) ) ;
          return res ;
        }
      }
      @ Override public T next ( ) {
        int n = gcj . token ( Integer . MIN_VALUE ) ;
        int [ ] data = gcj . tokens ( n ) ;
        if ( data [ 0 ] == null ) {
          return null ;
        }
        return data [ 0 ] ;
      }
      @ Override public T next ( ) {
        int n = gcj . token ( Integer . MIN_VALUE ) ;
        int [ ] data = gcj . tokens ( n ) ;
        return conv ( data [ 0 ] . toString ( ) ) ;
      }
      @ Override public T [ ] splitLine ( ) {
        return data ;
      }
      @ Override public T [ ] split ( ) {
        return data ;
      }
      @ Override public T [ ] split ( ) {
        return data ;
      }
      @ Override public T [ ] split ( ) {
        return data ;
      }
      @ Override public T [ ] split ( ) {
        return data ;
      }
    }
    ;
  }
  