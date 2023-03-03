, N = Integer . parseInt ( new Scanner ( System . in ) . nextLine ( ) ) , * a = Integer . parseInt ( new Scanner ( System . in ) . nextLine ( ) ) ;
A [ ] = new A [ N ] ;
for ( int i = 0 ;
i < N ;
i ++ ) A [ i ] = new A [ N ] ;
Arrays . sort ( A , new Comparator < A > ( ) {
  @ Override public int compare ( A a , A b ) {
    return a . compareTo ( b ) ;
  }
}
) ;
for ( int i = 0 ;
i < N ;
i ++ ) System . out . println ( A [ i ] . toString ( ) ) ;
return A ;
}
