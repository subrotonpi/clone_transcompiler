static final Memoize < String , Integer > solve = new Memoize < String , Integer > ( ) {
  private final Memoize < String , Integer > f = new Memoize < String , Integer > ( ) {
    private final Memoize < String , Integer > memo = new Memoize < String , Integer > ( ) ;
    @ Override public Integer get ( String key ) {
      if ( ! key . equals ( key ) ) memo . put ( key , f . get ( key ) ) ;
      return memo . get ( key ) ;
    }
    @ Override public int solve ( int Ai , int Bi , int Aused , int Bused ) {
      if ( Ai >= Act . length || Bi >= Bct . length ) return 0 ;
      else if ( Act [ Ai ] . charAt ( 1 ) == Bct [ Bi ] . charAt ( 1 ) ) {
        int used = Math . min ( Act [ Ai ] . charAt ( 0 ) - Aused , Bct [ Bi ] . charAt ( 0 ) - Bused ) ;
        Aused += used ;
        Bused += used ;
        if ( Aused == Act [ Ai ] . charAt ( 0 ) ) {
          Ai ++ ;
          Aused = 0 ;
        }
        if ( Bused == Bct [ Bi ] . charAt ( 0 ) ) {
          Bi ++ ;
          Bused = 0 ;
        }
        return used + solve ( Ai , Bi , Aused , Bused ) ;
      }
      else return Math . max ( solve ( Ai + 1 , Bi , 0 , Bused ) , solve ( Ai , Bi + 1 , Aused , 0 ) ) ;
    }
  }
  ;
  int C = Integer . parseInt ( System . console ( ) . readLine ( ) ) ;
  Memoize < String , Integer > solve = new Memoize < String , Integer > ( ) {
    @ Override public Integer get ( String key ) {
      int N = Integer . parseInt ( key ) ;
      int M = Integer . parseInt ( key ) ;
      int [ ] A = Integer . parseInt ( key ) ;
      int [ ] Act = Ints . toArray ( A ) ;
      int [ ] B = Integer . parseInt ( key ) ;
      int [ ] Bct = Ints . toArray ( B ) ;
      solve . memo = new Memoize < String , Integer > ( ) ;
      int y = solve . solve ( 0 , 0 , 0 , 0 ) ;
      System . out . println ( "Case #" + ( c + 1 ) + " :