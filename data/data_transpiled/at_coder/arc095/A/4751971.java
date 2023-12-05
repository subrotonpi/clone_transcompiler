, n = Integer . parseInt , * a = Integer . parseInt , n = Integer . parseInt ( new String ( 0 ) ) ) ;
int d = 0 ;
List < Pair > l = new ArrayList < > ( ) ;
a = new ArrayList < > ( Arrays . asList ( a ) ) ;
a . sort ( Comparator . comparing ( a :: get ) ) ;
int b = a . get ( n / 2 ) . getSecond ( ) ;
int c = a . get ( n / 2 - 1 ) . getSecond ( ) ;
Iterator < Pair > it = a . iterator ( ) ;
while ( it . hasNext ( ) ) {
  d ++ ;
  if ( d < n / 2 + 1 ) {
    l . add ( new Pair ( it . next ( ) , b ) ) ;
  }
  else {
    l . add ( new Pair ( it . next ( ) , c ) ) ;
  }
}
it = new ArrayList < > ( l ) ;
System . out . println ( it . next ( ) ) ;
return l ;
}
