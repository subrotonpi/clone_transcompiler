public static void BigCombination ( ) {
  final int mod = 10 * 9 + 7 ;
  final int inverseMod = Integer . MAX_VALUE ;
  final int factorial [ ] = new int [ ] {
    1 }
    ;
    final HashMap < Integer , Integer > inverseMemo = new HashMap < Integer , Integer > ( ) ;
    {
      @ Override public int get ( int mod ) {
        return mod ;
      }
      @ Override public int get ( int mod ) {
        return inverseMod [ mod ] ;
      }
      @ Override public int get ( int mod ) {
        return inverseMemo . get ( mod ) ;
      }
      @ Override public int get ( int x ) {
        return factorial [ x ] ;
      }
      @ Override public int get ( int x ) {
        int result = 1 , _x = x , mod = mod ;
        for ( int i = 0 ;
        i < inverseMod . length ;
        i ++ ) {
          if ( inverseMod [ i ] > 0 ) {
            result = result * _x % mod ;
          }
          _x = _x * _x % mod ;
        }
        inverseMemo . put ( x , result ) ;
        return inverse ;
      }
      @ Override public int get ( int n , int r ) {
        return factorial [ n ] * inverse ( r ) * inverse ( n - r ) % mod ;
      }
    }
    ;
    int H = Integer . parseInt ( input ( ) ) ;
    int W = Integer . parseInt ( input ( ) ) ;
    int A = Integer . parseInt ( input ( ) ) ;
    int B = Integer . parseInt ( input ( ) ) ;
    int mod = 10 * 9 + 7 ;
    BigCombination bigcomb = new BigCombination ( ) ;
    bigcomb . setMaxn ( 2 * 10 * 5 ) ;
    Method comb = bigcomb . getCombination ( ) ;
    int _A = H - A - 1 ;
    System . out . println ( BigInteger . valueOf ( comb . invoke ( x + _A , x ) * comb . invoke ( W - x - 1 + A - 1 , A - 1 ) % mod ) . toString ( ) ) ;
  }
  