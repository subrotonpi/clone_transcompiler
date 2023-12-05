def _import ( ) :
    from itertools import repeat
    from itertools import chain
    from itertools import chain
    from pyarrow.core.operations import ArraySet
    class Main ( object ) :
        def __init__ ( self ) :
            Scanner ( )
            N = len ( self._import )
            M = len ( self._import )
            K = [ ]
            for i in range ( N ) :
                k = next ( self )
                a = chain ( [ 0 ] , k )
                a.append ( a )
            K.append ( a )
        def abc118B ( self ) :
            print ( self._abc118B ( ) )
        def solve ( self , M , K ) :
            abc118BSolve = ABC118BSolve ( )
            return abc118BSolve ( self , M , K )
    class ABC118BSolve ( object ) :
        def solve ( self , M , K ) :
            K = array_to_set ( K [ 0 ] )
            for i in range ( 1 , len ( K ) ) :
                a = [ 1 ] * 30
                for j in range ( len ( K [ i ] ) ) :
                    a [ K [ i ] [ j ] - 1 ] = 1
                nextset = set ( )
                for ( k , v ) in zip ( K , a ) :
                    if k == 1 : nextset.add ( k )
                self._abc118BSolve ( self , K )
            return len ( self._abc118BSolve ( self , K ) )
    def array_to_set ( k ) :
        set = chain ( [ k ] , k )
        return set
    Note :./ Main._ _ uses _ builtin _ or _ unsafe.operations.Note : Recompile SPACETOKEN with - Xlint : unchecked SPACETOKEN details."""
