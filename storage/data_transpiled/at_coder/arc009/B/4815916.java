@ Scanner ( System . in ) public static int [ ] B = new int [ N ] ;
for ( int i = 0 ;
i < N ;
i ++ ) {
  System . out . println ( " " + i ) ;
}
int [ ] A = new int [ N ] ;
for ( int i = 0 ;
i < N ;
i ++ ) {
  A [ i ] = Integer . parseInt ( input . nextLine ( ) ) ;
}
Map < Integer , Integer > ct = new HashMap < > ( ) ;
for ( int i = 0 ;
i < N ;
i ++ ) {
  ct . put ( i , i ) ;
}
/* conv the number of numbers to the number of B */
int result = ct . get ( ( n / 10 * i ) % 10 ) * ( 10 * i ) ;
for ( int i = 0 ;
i < 9 ;
i ++ ) {
  result = result * ct . get ( ( n / 10 * i ) % 10 ) ;
}
Arrays . sort ( A , new Comparator < Integer > ( ) {
  @ Override public int compare ( Integer o1 , Integer o2 ) {
    return conv ( o1 , o2 ) ;
  }
}
) ;
for ( int a : A ) {
  System . out . println ( a ) ;
}
return A ;
}
