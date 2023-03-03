def Main ( ) :
    class _Main ( object ) :
        def __init__ ( self ) :
            self._exit = 0
        def __call__ ( self , * args ) :
            r = self._exit ( )
            print ( 'ABC' if r < 1200 else 'ARC' if r < 2800 else 'AGC' )
    return _Main
