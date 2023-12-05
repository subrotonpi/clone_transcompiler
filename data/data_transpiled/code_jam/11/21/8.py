def round1b ( ) :
    import os
    import sys
    import qual2011
    from numpy.linalg import solve
    from qual2011.kattio import Kattio
    class A ( object ) :
        def __init__ ( self ) :
            self.io = Kattio ( open ( 'src/round1b/A-large-0.in' , 'rb' ) , open ( 'src/round1b/A-large-0.out' , 'wb' ) )
            self.cases = self.io.get_int ( )
            for i in range ( 1 , self.cases + 1 ) :
                self.io.write ( 'Case #%d: ' % i )
                solve ( self.io )
    def solve ( self ) :
        n = self.io.get_int ( )
        res = [ ]
        for i in range ( n ) :
            res.append ( self.io.get_word ( ) )
        wp , owp , oowp = [ ] , [ ] , [ ]
        wpe = [ ]
        matches = [ ]
        for i in range ( n ) :
            wins , m = 0 , 0
            for j in range ( n ) :
                if res [ j ] == '1' :
                    wins += 1
                if res [ j ] != '.' :
                    m += 1
            if m > 0 :
                wp.append ( wins / m )
            matches.append ( m )
            for j in range ( n ) :
                owins , omatches = wins , m
                if res [ j ] == '1' :
                    owins -= 1
                if res [ j ] != '.' :
                    omatches -= 1
                if omatches > 0 :
                    wpe.append ( owins / omatches )
        for i in range ( n ) :
            tot = 0
            for j in range ( n ) :
                if res [ j ] != '.' :
                    tot += wpe [ j ]
        return tot
    return solve
