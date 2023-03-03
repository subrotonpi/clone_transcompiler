static final public int rl ( int T ) {
  return Collections . nCopies ( T , input ( ) ) ;
  /* solve the first element in the list */
  if ( T == 0 ) return 0 ;
  if ( T == 1 ) return 1 ;
  if ( T + T <= X ) return 1 + solve ( T , T , 1 , T - 1 ) ;
  if ( T - 1 <= X ) return 1 + solve ( T , T , 0 , T - 1 ) ;
  throw new IllegalStateException ( ) ;
}
