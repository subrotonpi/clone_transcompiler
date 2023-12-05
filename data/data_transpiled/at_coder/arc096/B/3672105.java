public static int [ ] solve ( int N , int C ) {
  int x , v ;
  int [ ] xs = new int [ N + 1 ] ;
  int [ ] vs = new int [ N + 1 ] ;
  for ( int i = 0 ;
  i < N ;
  i ++ ) {
    x = Integer . parseInt ( input . nextLine ( ) ) ;
    v = Integer . parseInt ( input . nextLine ( ) ) ;
    xs [ i ] = x ;
    vs [ i ] = v ;
  }
  int [ ] costOAs = new int [ N + 1 ] ;
  Arrays . fill ( costOAs , 0 ) ;
  int [ ] costOBs = new int [ N + 1 ] ;
  for ( int i = 0 ;
  i < N ;
  i ++ ) {
    costOBs [ i ] = 0 ;
  }
  for ( int i = 0 ;
  i < N ;
  i ++ ) {
    costOBs [ i ] = C - x ;
  }
  int accV = 0 ;
  int [ ] eneOAs = new int [ N + 1 ] ;
  int [ ] maxOAs = new int [ N + 1 ] ;
  for ( int i = 0 ;
  i < N ;
  i ++ ) {
    int A = vs [ i ] ;
    accV += v ;
    eneOAs [ A ] = accV - costOAs [ A ] ;
    maxOAs [ A ] = Math . max ( maxOAs [ A - 1 ] , eneOAs [ A ] ) ;
  }
  accV = 0 ;
  int [ ] eneOBs = new int [ N + 1 ] ;
  int [ ] maxOBs = new int [ N + 1 ] ;
  for ( int i = 0 ;
  i < N + 1 ;
  i ++ ) {
    int B = vs [ i ] ;
    accV += v ;
    eneOBs [ B ] = accV - costOBs [ B ] ;
    maxOBs [ B ] = Math . max ( maxOBs [ B - 1 ] , eneOBs [ B ] ) ;
  }
  int ans = 0 ;
  for ( int B = 0 ;
  B < N + 1 ;
  B ++ ) {
    int ene = eneOBs [ B ] + Math . max ( 0 , - costOBs [ B ] + maxOAs [ N - B ] ) ;
    ans = Math . max ( ans , ene ) ;
  }
  System . out . println ( ans ) ;
  return ans ;
}
