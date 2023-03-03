static final void main ( String [ ] args ) {
  final PrintStream ps = System . out ;
  try {
    final PipedOutputStream pipeout = new PipedOutputStream ( ) ;
    PipedInputStream pipein = new PipedInputStream ( pipeout ) ;
    PipedOutputStream pipepipeout = new PipedOutputStream ( pipeout ) {
      @ Override public void write ( int b ) throws IOException {
        for ( int i = 0 ;
        i < pipeout . size ( ) ;
        i ++ ) {
          pipeout . write ( b ) ;
        }
      }
      @ Override public void flush ( ) throws IOException {
        for ( int i = 0 ;
        i < pipeout . size ( ) ;
        i ++ ) {
          pipeout . flush ( ) ;
        }
      }
      @ Override public void close ( ) throws IOException {
        pipeout . close ( ) ;
      }
    }
    ;
  }
  catch ( IOException e ) {
    e . printStackTrace ( ) ;
  }
  final PipedInputStream pipein = new PipedInputStream ( ) {
    @ Override public PipedInputStream open ( ) throws IOException {
      return pipein ;
    }
  }
  ;
  final PipedInputStream pipein = new PipedInputStream ( pipeout ) {
    @ Override public void close ( ) throws IOException {
      pipein . close ( ) ;
    }
  }
  ;
  final PipedInputStream pipein = new PipedInputStream ( pipein ) {
    @ Override public void close ( ) throws IOException {
      pipein . close ( ) ;
    }
  }
  ;
  final PipedInputStream pipein = new PipedInputStream ( pipein ) {
    @ Override public void close ( ) throws IOException {
      pipein . close ( ) ;
    }
  }
  ;
  final PipedOutputStream pipeout = new PipedOutputStream ( pipeout ) {
    @ Override public void close ( ) throws IOException {
      pipeout . close ( ) ;
    }
  }
  ;
  final PipedInputStream pipein = new PipedInputStream ( pipein ) {
    @ Override public void close ( ) throws IOException {
      pipein . close ( ) ;
    }
  }
  ;
  final PipedInputStream pipein = new PipedInputStream ( pipein ) {
    @ Override public void close ( ) throws IOException {
      pipein . close ( ) ;
    }
  }
  ;
  final PipedOutputStream pipeout = new PipedOutputStream ( pipeout ) {
    @ Override public void close ( ) throws IOException {
      pipeout . close ( ) ;
    }
  }
  ;
}
