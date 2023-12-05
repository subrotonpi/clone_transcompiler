public static String X ( ) {
  String s = input ( ) ;
  String result = "" . join ( [ c for c in s if c not in X ] ) ;
  return print ( result ) ;
}
