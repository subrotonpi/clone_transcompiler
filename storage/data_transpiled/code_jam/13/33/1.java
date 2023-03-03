public static Interval < Integer > getInterval ( int w , int e ) {
  int [ ] tmp ;
  int w_ = w ;
  int e_ = e ;
  {
    this . w_ = w ;
    this . e_ = e ;
  }
  public String toString ( ) {
    return "[" + w_ + " " + e_ + "]" ;
  }
  public int move ( int p ) {
    return Interval . getAttack ( p ) ;
  }
  public int move ( int p ) {
    return Interval . getAttack ( p ) ;
  }
  public int move ( int p ) {
    return Interval . getAttack ( p ) ;
  }
  public int move ( int p ) {
    return Interval . getAttack ( p ) ;
  }
  public int move ( int p ) {
    return Interval . getAttack ( p ) ;
  }
  public int move ( int p ) {
    int wb = 0 ;
    for ( int i = 0 ;
    i < N ;
    i ++ ) {
      if ( tribe [ i ] . dp_ < 0 ) {
        wb = min ( tribe [ i ] . getPosition ( tribe [ i ] . n_ ) . w_ , wb ) ;
        eb = max ( tribe [ i ] . iv_ . e_ , wb ) ;
      }
      else {
        eb = max ( tribe [ i ] . getPosition ( tribe [ i ] . n_ ) . e_ , wb ) ;
        wb = min ( tribe [ i ] . iv_ . w_ , wb ) ;
      }
    }
    int ans = 0 ;
    for ( int i = 0 ;
    i < N ;
    i ++ ) {
      attack [ i ] . d_ = Integer . parseInt ( d ) ;
      attack [ i ] . s_ = Integer . parseInt ( s ) ;
      attack [ i ] . iv_ = iv ;
    }
    return attack ;
  }
  public int attack_cmp ( Attack x , Attack y ) {
    if ( x . d_ > y . d_ ) return 1 ;
    else if ( x . d_ == y . d_ ) {
      if ( x . s_ > y . s_ ) return 1 ;
      else return - 1 ;
    }
    else {
      return - 1 ;
    }
  }
  public Tribe < Integer > [ ] clone ( ) {
    int [ ] tmp = new int [ N ] ;
    for ( int i = 0 ;
    i <= N ;
    i ++ ) tmp [ i ] = Integer . parseInt ( input . nextLine ( ) ) ;
    tribe = new Tribe < Integer > ( tmp ) ;
  }
  public int T ( ) {
    return T ;
    