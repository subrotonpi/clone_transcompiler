def Main ( ) :
    class _Main ( object ) :
        def __init__ ( self ) :
            self._input = sys.stdin
            self._output = sys.stdout
            count , ans = 0 , 0
            for c in self._input :
                if c == 'B' :
                    count += 1
                else :
                    ans += count
            print ( ans )
    return _Main
