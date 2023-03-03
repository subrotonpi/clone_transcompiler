def _import ( ) :
    from sys import stdin as sc
    import sys
    class Main ( object ) :
        def __init__ ( self ) :
            sc._import _sys
            self._sys = sys
            r = int ( sc._sys.stdout.read ( ) )
            g = int ( sc._sys.stdout.read ( ) )
            self._sys.stdout.write ( r * r - g )
            self._sys.stdout.flush ( )
