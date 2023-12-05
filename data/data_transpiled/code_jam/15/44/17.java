@ GwtIncompatible ( "java.util.concurrent.atomic.AtomicInteger" ) public static String inputFile = "sample_input.txt" ;
String inputFile = "D-small-attempt6.in" ;
@ SuppressWarnings ( "resource" ) Scanner in = new Scanner ( inputFile ) ;
String line = in . nextLine ( ) ;
Class < ? > _type = String . class ;
StringBuilder sb = new StringBuilder ( ) ;
while ( in . hasNextLine ( ) ) {
  sb . append ( _type . getSimpleName ( ) ) ;
  sb . append ( in . nextLine ( ) . trim ( ) ) ;
}
int i ;
String f_star = in . nextLine ( ) ;
/* Use the "__main__" method to get the answer */
Class < ? > c = null ;
try {
  Field f = f . getDeclaredField ( "__main__" ) ;
  f . setAccessible ( true ) ;
  Field [ ] args = new Class < ? > [ ] {
  }
  ;
  for ( i = 0 ;
  i < T ;
  i ++ ) {
    String ri = line . get ( in , Integer . class ) ;
    int ci = line . get ( in , Integer . class ) ;
    r [ ci ] = line . get ( in , ci ) ;
  }
  Object [ ] answers = new Object [ i ] ;
  for ( i = 0 ;
  i < answers . length ;
  i ++ ) {
    Object [ ] ways = new Object [ i ] ;
    ways [ i ] = f . get ( r [ i ] , 0 ) ;
    System . out . println ( r [ i ] + ": " + c [ i ] + "\n" ) ;
    System . out . println ( s ) ;
  }
}
catch ( Exception e ) {
  e . printStackTrace ( ) ;
}
finally {
  if ( in != null ) {
    try {
      in . close ( ) ;
    }
    catch ( IOException e ) {
      e . printStackTrace ( ) ;
    }
  }
}
return sb . toString ( ) ;
}
