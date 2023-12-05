static final public void input ( ) {
  int N = Integer . parseInt ( input . nextLine ( ) ) ;
  String C = input . nextLine ( ) ;
  double minCost = Double . MAX_VALUE ;
  char [ ] seq = {
    'A' , 'B' , 'X' , 'Y' }
    ;
    List < Character > Comb = new LinkedList < Character > ( ) ;
    Comb . add ( seq ) ;
    Comb . add ( seq ) ;
    for ( int i = 0 ;
    i < Comb . size ( ) ;
    i ++ ) {
      int [ ] tmp = new int [ 3 ] ;
      Comb . get ( i ) . list ( tmp ) ;
      String s1 = tmp [ 0 ] + tmp [ 1 ] , s2 = tmp [ 2 ] + tmp [ 3 ] ;
      String C1 = C . replace ( s1 , 'L' ) . replace ( s2 , 'R' ) ;
      String C2 = C . replace ( s2 , 'L' ) . replace ( s1 , 'R' ) ;
      minCost = Math . min ( C1 . length ( ) , C2 . length ( ) , minCost ) ;
    }
    System . out . println ( minCost ) ;
  }
  