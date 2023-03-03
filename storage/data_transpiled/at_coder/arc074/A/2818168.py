def _import ( ) :
    from sys import stdin
    from .hexversion import hexversion
    class Main ( object ) :
        @ always_comb
        def __next__ ( self ) :
            scanner = BetterScanner ( sys.stdin )
            h = scanner.read ( )
            w = scanner.read ( )
            res = min ( calc ( h , w ) , calc ( w , h ) )
            print ( res )
        def __next__ ( self ) :
            number = next ( self )
            if number >= int ( number ) :
                return int ( number )
            else :
                raise ValueError
        def isPrintableChar ( self ) :
            return self._number >= 33 and self._126
    return Main ( )
