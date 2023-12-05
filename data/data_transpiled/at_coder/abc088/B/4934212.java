public static void main ( String input ) {
  int n = Integer . parseInt ( input ) ;
  ArrayList < Integer > a = new ArrayList < > ( Collections . nCopies ( n , input ) ) ;
  int result = 0 ;
  boolean isEven = true ;
  for ( Integer x : a ) {
    result += isEven ? x : - x ;
    isEven = ! isEven ;
  }
  System . out . println ( result ) ;
}
