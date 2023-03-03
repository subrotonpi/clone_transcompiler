@ GwtIncompatible ( "java.util.regex.Pattern" ) public static < T > String print ( final T ... args ) {
  return Arrays . stream ( args ) . map ( value -> String . join ( "," , value -> value . toString ( ) , value -> value . toString ( ) + "=" + value . toString ( ) ) ) . collect ( Collectors . joining ( "," ) ) ;
}
