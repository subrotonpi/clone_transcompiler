static final String input = "Enter a number of elements in the graph." ;
Function < Integer , List < IntTuple >> f = new Function < Integer , List < IntTuple >> ( ) {
  @ Override public List < IntTuple > apply ( Integer input ) {
    return ContainerUtil . newArrayList ( ) ;
  }
}
;
int n = Integer . parseInt ( input ) ;
List < IntTuple > g = new ArrayList < IntTuple > ( n + 1 ) ;
int [ ] z = new int [ n ] ;
int [ ] d = new int [ n + 1 ] ;
int [ ] q = new int [ n + 1 ] ;
String r = "" ;
List < IntTuple > Q = new ArrayList < IntTuple > ( ) ;
heapify ( Q , 0 , - 2 , n ) ;
for ( int i = 0 ;
i < n - 1 ;
i ++ ) {
  int a = f . apply ( ) ;
  int b = f . apply ( ) ;
  a -- ;
  b -- ;
  g . add ( a ) ;
  g . add ( new IntTuple ( 1 , a , b ) ) ;
  g . add ( new IntTuple ( 1 , b , a ) ) ;
}
for ( int i = 0 ;
i < Integer . MAX_VALUE ;
i ++ ) {
  int e = heapify ( Q ) ;
  if ( q [ e [ 2 ] ] != - 1 ) continue ;
  q [ e [ 2 ] ] = e [ 1 ] ;
  for ( IntTuple f : g . get ( e [ 2 ] ) ) if ( d [ f . ordinal ( ) ] > e [ 0 ] + f . ordinal ( ) ) d [ f . ordinal ( ) ] = e [ 0 ] ;
  heapify ( Q ) ;
}
for ( int i = 0 ;
i < n ;
i ++ ) if ( g . get ( i ) . size ( ) > 0 && Math . abs ( d [ i ] - d [ i ] ) != 1 ) r = "No" ;
if ( Math . abs ( z [ i ] ) >= 0 && z [ i ] != d [ i ] ) r = "No" ;
System . out . println ( r . isEmpty ( ) ? "Yes\n" + Arrays . toString ( g ) : r ) ;
return r ;
}
