static final ForkJoinPool < Integer > getPool ( ) {
  final int skip = 0 ;
  ForkJoinTask < Integer > task = new ForkJoinTask < Integer > ( ) {
    @ Override protected Integer doInBackground ( ) throws Exception {
      Map < Integer , Integer > se = new HashMap < > ( ) ;
      return super . get ( ) ;
    }
    @ Override protected Integer doInBackground ( ) throws Exception {
      if ( se . containsKey ( ) ) {
        return se . get ( ) ;
      }
      Integer x = super . doInBackground ( ) ;
      se . put ( ) ;
      return x ;
    }
    @ Override protected Integer doInBackground ( ) throws Exception {
      int cn = 0 ;
      for ( Integer i : parseInput ( ) ) {
        if ( cn < skip ) {
          cn ++ ;
          continue ;
        }
        Integer ans = solveCase ( i ) ;
        System . out . println ( ans ) ;
        return ans ;
      }
      return 0 ;
    }
    @ Override protected boolean doInBackground ( int D , List < Integer > vines ) throws Exception {
      return true ;
    }
    @ Override protected Integer doInBackground ( ) throws Exception {
      return 0 ;
    }
    @ Override protected boolean doInBackground ( ) throws Exception {
      return true ;
    }
  }
  ;
  if ( getClass ( ) . isClass ( ) ) {
    main ( ) ;
  }
  else {
    return true ;
  }
}
