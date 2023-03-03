def Main ( ) :
    class _Main ( object ) :
        def __init__ ( self ) :
            self._number = 0
        def __repr__ ( self ) :
            return "%s %s" % ( self._number , self._number or 0 )
    return _Main ( )
