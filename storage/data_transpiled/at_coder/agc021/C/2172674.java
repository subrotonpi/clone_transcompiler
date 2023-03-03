public static int getNextInt ( ) {
  return ( int ) Double . parseDouble ( input . nextLine ( ) ) ;
}
{
  int n = Integer . parseInt ( input . nextLine ( ) ) ;
  int m = Integer . parseInt ( input . nextLine ( ) ) ;
  int a = Integer . parseInt ( input . nextLine ( ) ) ;
  int b = Integer . parseInt ( input . nextLine ( ) ) ;
  if ( b > 0 ) {
    result . set ( ( i ++ ) , "^" ) ;
    result . set ( ( i ++ ) , "v" ) ;
    b -- ;
  }
  else {
    break ;
  }
}
if ( ( a + b ) > 0 ) {
  System . out . println ( "NO" ) ;
}
else {
  System . out . println ( "YES" ) ;
  for ( int i = 1 ;
  i <= n ;
  i ++ ) {
    StringBuilder buffer = new StringBuilder ( ) ;
    for ( int j = 1 ;
    j <= m ;
    j ++ ) {
      buffer . append ( result . get ( new Integer ( i ) , j ) ) . append ( "." ) ;
    }
    System . out . println ( buffer . toString ( ) ) ;
  }
}
if ( Class . isPrimitive ( "java.lang.Integer" ) ) {
  Main . main ( ) ;
}
else {
  int n = getNextInt ( ) ;
  int m = getNextInt ( ) ;
  int a = getNextInt ( ) ;
  int b = getNextInt ( ) ;
  Map < Integer , String > result = new HashMap < Integer , String > ( ) ;
  if ( n % 2 == 1 ) {
    for ( int j = 1 ;
    j <= m ;
    j += 2 ) {
      if ( a == 0 ) {
        break ;
      }
      result . put ( new Integer ( n ) , "<" ) ;
      result . put ( new Integer ( j ) , ">" ) ;
      a -- ;
    }
  }
  if ( m % 2 == 1 ) {
    for ( int i = 1 ;
    i <= n ;
    i += 2 ) {
      if ( b == 0 ) {
        break ;
      }
      result . put ( new Integer ( i ) , "^" ) ;
      result . put ( new Integer ( j ) , "v" ) ;
      b -- ;
    }
  }
  if ( n % 2 == 1 && a % 2 == 1 && m % 2 == 1 && b % 2 == 1 ) {
    result . put ( new Integer ( n ) , "<" ) ;
    result . put ( new Integer ( m ) , "