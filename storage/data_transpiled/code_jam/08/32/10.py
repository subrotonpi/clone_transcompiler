def __parse ( s ) :
    import math
    import string
    import math
    class B ( object ) :
        def parse ( self ) :
            integer = int ( s )
            integer = integer % ( 210 , integer )
            return integer
    def main ( ) :
        import sys
        sys.stdout.write ( "\n" )
        N = sys.stdin.readline ( ).rstrip ( )
        for case in range ( 1 , N + 1 ) :
            line = sys.stdin.readline ( )
            n = len ( line )
            partsTable = [ ]
            for begin in range ( n ) :
                for end in range ( begin + 1 , n + 1 ) :
                    partsTable.append ( __parse ( line [ begin : end ] ) )
            memo = [ 0 ] * ( n + 1 )
            memo [ 0 ] [ 0 ] += 1
            for endIndex in range ( 1 , n + 1 ) :
                for beginIndex in range ( endIndex ) :
                    for prevMod in range ( 210 ) :
                        nextMod = ( prevMod + partsTable [ beginIndex ] [ endIndex ] ) % 210
                        memo [ endIndex ] [ nextMod ] += memo [ beginIndex ] [ prevMod ]
                if beginIndex != 0 :
                    for prevMod in range ( 210 ) :
                        nextMod = ( prevMod - partsTable [ beginIndex ] [ endIndex ] + 210 ) % 210
                        memo [ endIndex ] [ nextMod ] += memo [ beginIndex ] [ prevMod ]
        answer = 0
        for mod in range ( 210 ) :
            if mod % 2 == 0 or mod % 3 == 0 or mod % 5 == 0 or mod % 7 == 0 :
                answer += memo [ n ] [ mod ]
        sys.stdout.write ( "Case #%d: %d\n" % ( case , answer ) )
