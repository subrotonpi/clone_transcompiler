static final String input = "Enter a number (in words) of the form of a (n is 1)." ;
String a = input ;
a = a . split ( "\\s+" ) ;
int n = Math . abs ( Integer . parseInt ( a [ 1 ] ) - Integer . parseInt ( a [ 0 ] ) ) ;
int [ ] x = {
  1 , 2 , 3 , 2 , 1 , 2 , 3 , 3 , 2 , 1 }
  ;
  int b = n / 10 ;
  int c = n % 10 ;
  if ( ( n != 0 ) && ( c != 0 ) ) {
    if ( ( c != 0 ) && ( x [ c - 1 ] == 0 ) ) {
      System . out . println ( x [ c - 1 ] + b ) ;
    }
    else {
      System . out . println ( b ) ;
    }
  }
  else if ( ( n == 0 ) && ( x [ c - 1 ] == 0 ) ) {
    System . out . println ( 0 ) ;
  }
  return a ;
}
