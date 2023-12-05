def _main ( ) :
    import sys
    import os
    import sys
    import os
    import sys
    import sys
    import os
    import sys
    import sys
    class Main ( object ) :
        NEEDS = ( 2 , 5 , 5 , 4 , 5 , 6 , 3 , 7 , 6 )
        cache = { }
        def __init__ ( self ) :
            Scanner = sys.stdin
            N , M = Scanner.input ( )
            inlist = [ ]
            for i in range ( M ) :
                inlist.append ( sc.next ( ) )
            Scanner.close ( )
            isUsables = ( False , False , False , False , False , False , False , False )
            for inp in inlist :
                isUsables.append ( inp - 1 )
            cache [ 0 ] = 0
            for i in range ( N ) :
                self._getMaxFigure ( i , isUsables )
            maxFigure = self._getMaxFigure ( N , isUsables )
            ret = [ ]
            restMatch = N
            for i in range ( maxFigure , 0 , - 1 ) :
                for j in NEEDS [ : : - 1 ] :
                    if not isUsables [ j ] :
                        continue
                    need = NEEDS [ j ]
                    if restMatch - need not in cache :
                        continue
                    if cache [ restMatch - need ] == i - 1 :
                        ret.append ( j + 1 )
                        restMatch -= need
                        break
            for i in ret :
                sys.stdout.write ( i )
        def _getMaxFigure ( matchnum , isUsables ) :
            if matchnum in cache :
                return cache [ matchnum ]
            if matchnum < 0 :
                return 0
            if matchnum == 0 :
                return 0
            max = sys.maxint
            for i in range ( len ( isUsables ) ) :
                if isUsables [ i ] :
                    max = maxFigure + 1
            return max
    return Main
