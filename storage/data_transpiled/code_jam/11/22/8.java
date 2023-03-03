@ VisibleForTesting static boolean solve ( ) {
  final int d = 0 ;
  final int x = 0 ;
  final GCJ gcj = new GCJ ( ) {
    final InputStream IN = System . in ;
    final StringBuffer buf = new StringBuffer ( ) ;
    int curCase = 0 ;
    @ Override public int id ( ) {
      return x ;
    }
    @ Override public String readLine ( ) {
      return buf . toString ( ) ;
    }
    @ Override public String toString ( ) {
      return "gcj.token(int)" ;
    }
    @ Override public String toString ( ) {
      StringBuilder sb ;
      int t = gcj . tokens ( t ) ;
      int c = gcj . tokens ( 2 , Integer . MAX_VALUE ) ;
      int d = gcj . tokens ( c ) ;
      String [ ] data = new String [ c ] ;
      for ( int i = 0 ;
      i < c ;
      i ++ ) {
        int p = gcj . tokens ( 2 , Integer . MAX_VALUE ) ;
        int v = gcj . tokens ( 2 , Integer . MAX_VALUE ) ;
        data [ i ] = new String ( 2 * p ) ;
        sb . append ( v ) ;
      }
      print ( gcj . case ( ) , format ( ".1f" ) ) ;
      return true ;
    }
    @ Override public String toString ( ) {
      return "" ;
    }
    @ Override public String toString ( ) {
      return "" ;
    }
  }
  ;
  @ Override public String [ ] splitLine ( ) {
    StringBuilder sb = new StringBuilder ( ) ;
    sb = new StringBuilder ( ) ;
    for ( int i = 0 ;
    i < c ;
    i ++ ) {
      sb . append ( " " ) ;
      sb . append ( format ( "%s" , i ) ) ;
    }
    sb . append ( "\n" ) ;
    sb . append ( "" ) ;
    return sb . toString ( ) . trim ( ) ;
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
int a = 0 ;
int b = 1 ;
while ( ! check ( sb , d , b ) ) b *= 2 ;
assert ! check ( sb , d , a ) ;
assert check ( sb , d , b ) ;
while ( a + 5 < b ) {
  int x = ( a + b ) / 2 ;
  if ( check