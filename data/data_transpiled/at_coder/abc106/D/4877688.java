static final Queue < Integer > solve = new LinkedList < Integer > ( ) {
  final double INF = Double . POSITIVE_INFINITY ;
  class Bit {
    int [ ] size = {
      n , m }
      ;
      int [ ] [ ] tree = new int [ n + 1 ] [ m + 1 ] ;
      @ Override public int sum ( int i , int j ) {
        int s = 0 ;
        while ( i > 0 ) {
          int jj = j ;
          while ( jj > 0 ) {
            s += tree [ i ] [ jj ] ;
            jj -= jj & - jj ;
          }
          i -= i & - i ;
        }
        return s ;
      }
      @ Override public void add ( int i , int j , int x ) {
        while ( i <= size [ 0 ] ) {
          int jj = j ;
          while ( jj <= size [ 1 ] ) {
            tree [ i ] [ jj ] += x ;
            jj += jj & - jj ;
          }
          i += i & - i ;
        }
      }
    }
    @ Override public void solve ( int N , int M , int Q , List < Integer > L , List < Integer > R , List < Integer > p , List < Integer > q ) {
      Bit b = new Bit ( N , N ) ;
      for ( int l = 0 , r = L . size ( ) ;
      l < r ;
      l ++ ) b . add ( N - l + 1 , r , 1 ) ;
      for ( int pp = 0 , qq = p . size ( ) ;
      pp < qq ;
      pp ++ ) {
        int qq = q . get ( pp ) ;
        System . out . println ( b . sum ( N - pp + 1 , qq ) ) ;
      }
      return ;
    }
    @ Override public void main ( String [ ] args ) {
      for ( String line : args ) {
        for ( String word : line . split ( " " ) ) {
          this . queue . add ( word ) ;
        }
      }
    }
  }
  