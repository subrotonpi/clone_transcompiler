public static int T = Integer . parseInt ( Scanner in ) {
  int T = in . nextInt ( ) ;
  if ( T == 0 ) return 0 ;
  boolean notFlip = true ;
  boolean flip = true ;
  List < Pair < String , String >> nfgr = new ArrayList < Pair < String , String >> ( ) ;
  List < Pair < String , String >> fgr = new ArrayList < Pair < String , String >> ( ) ;
  for ( Iterator < Pair < String , String >> outs = groups . iterator ( ) ;
  outs . hasNext ( ) ;
  ) {
    Pair < String , String > targs = outs . next ( ) ;
    String targ1 = targs . next ( ) ;
    String targ0 = targs . next ( ) ;
    String outs0 = outs . next ( ) ;
    String outs1 = outs . next ( ) ;
    if ( outs0 . length ( ) != targ0 . length ( ) ) notFlip = false ;
    else {
      if ( outs0 . length ( ) > 0 ) nfgr . add ( new Pair < String , String > ( outs0 , targ0 ) ) ;
      if ( outs1 . length ( ) > 0 ) nfgr . add ( new Pair < String , String > ( outs1 , targ1 ) ) ;
    }
    if ( outs1 . length ( ) != targ0 . length ( ) ) flip = false ;
    else {
      if ( outs1 . length ( ) > 0 ) fgr . add ( new Pair < String , String > ( outs1 , targ0 ) ) ;
      if ( outs0 . length ( ) > 0 ) fgr . add ( new Pair < String , String > ( outs0 , targ1 ) ) ;
    }
  }
  int resp = 1000000 ;
  if ( notFlip ) resp = Math . min ( resp , flipTheFlip ( nfgr , T - 1 ) ) ;
  if ( flip ) resp = Math . min ( resp , 1 + flipTheFlip ( fgr , T - 1 ) ) ;
  return resp ;
}
