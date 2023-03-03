static final long MAX = Double . MAX_VALUE ;
final int N = Integer . parseInt ( input . nextLine ( ) ) ;
final long [ ] Ss = new long [ N ] ;
for ( int i = 0 ;
i < N ;
i ++ ) {
  Ss [ i ] = input . nextDouble ( ) ;
}
final long counter = new LongCounter ( Ss ) . most_common ( ) ;
System . out . println ( counter [ 0 ] [ 0 ] ) ;
}
