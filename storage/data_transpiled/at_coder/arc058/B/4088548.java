public static int mod = 10 * * 9 + 7 ;
int H = Integer . parseInt ( input . readLine ( ) ) ;
int W = Integer . parseInt ( input . readLine ( ) ) ;
int A = Integer . parseInt ( input . readLine ( ) ) ;
int B = Integer . parseInt ( input . readLine ( ) ) ;
class Fact implements Fact {
  int [ ] facts = new int [ H + W - 1 ] ;
  public int [ ] fact ( int i ) {
    int mod = 10 * * 9 + 7 ;
    facts [ i ] = 1 ;
    for ( int j = 1 ;
    j <= H ;
    j ++ ) facts [ j ] = facts [ j - 1 ] * i % mod ;
    i = Arrays . copyOf ( facts , facts . length + 1 ) ;
    for ( int j = 1 ;
    j <= H ;
    j ++ ) i [ j ] = Math . pow ( facts [ j - 1 ] , mod - 2 , mod ) ;
    for ( int j = 1 ;
    j <= H ;
    j ++ ) i [ j ] = Math . pow ( facts [ j ] , mod - 2 , mod ) ;
    return i ;
  }
  public int [ ] comb ( int n , int r ) {
    int ret = facts [ n ] * facts [ n ] ;
    return ret ;
  }
  public void printFact ( Fact fact ) {
    System . out . println ( fact ) ;
  }
}
