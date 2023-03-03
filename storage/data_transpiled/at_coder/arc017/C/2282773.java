@ Function public static List < Integer > inpl ( ) {
  return Lists . newArrayList ( input ( ) . split ( " " ) ) ;
  int N = input ( ) . nextInt ( ) ;
  int X = input ( ) . nextInt ( ) ;
  int [ ] W = new int [ N ] ;
  for ( int i = 0 ;
  i < N ;
  i ++ ) W [ i ] = Integer . parseInt ( input ( ) . nextLine ( ) ) ;
  int A = N / 2 ;
  int B = N - A ;
  Map < Integer , Integer > C = new HashMap < > ( ) ;
  Map < Integer , Integer > D = new HashMap < > ( ) ;
  for ( int i = 0 ;
  i < 2 * A ;
  i ++ ) C . put ( Integer . parseInt ( W [ a ] ) * ( i >> a & 1 ) , 1 ) ;
  for ( int j = 0 ;
  j < 2 * B ;
  j ++ ) D . put ( Integer . parseInt ( W [ b + A ] ) * ( j >> b & 1 ) , 1 ) ;
  int ans = 0 ;
  for ( Map . Entry < Integer , Integer > e : C . entrySet ( ) ) ans += e . getValue ( ) * D . get ( X - e . getKey ( ) ) ;
  System . out . println ( ans ) ;
  return C ;
}
