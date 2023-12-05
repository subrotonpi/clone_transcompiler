public static String YesNo ( String f ) {
  return Arrays . asList ( "Yes" , "No" ) . stream ( ) . filter ( ! f . equals ( "" ) ) . findFirst ( ) ;
}
