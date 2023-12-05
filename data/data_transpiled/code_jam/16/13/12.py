def year2016.round1a ( ) :
    import os
    import random
    import random
    import os
    import sys
    import os
    import random
    import random
    import itertools
    class BFFs ( object ) :
        def main ( self ) :
            input_file = open ( 'C-large.in' , 'r' )
            with open ( input_file , 'r' ) as f :
                output_file = open ( 'output.txt' , 'w' )
            self.pairs += [ ]
        self.circle = max ( self.pairs , self.max_circle )
        print ( 'Case #%d: %d' % ( t + 1 , answer ) , file = output_file )
    for t in range ( T ) :
        N = random.randint ( 1 , N )
        F = [ random.randint ( 1 , N ) - 1 for n in range ( N ) ]
        C = [ ]
        D = [ ]
        DD = [ ]
        for n in range ( N ) :
            pos = n
            for i in range ( N ) :
                pos = F [ pos ]
            min = pos
            for i in range ( N ) :
                pos = F [ pos ]
                min = min ( pos )
            if not C [ min ] :
                circle = set ( )
                start = pos
                while True :
                    circle.add ( pos )
                    pos = F [ pos ]
                pos = n
            C.append ( circle )
            dist = 0
            pos = n
            while not pos in circle :
                pos = F [ pos ]
                dist += 1
            D.append ( dist )
            DD.append ( pos )
        pairs = 0
        max_circle = 0
        for circle in C :
            if circle == [ ] : continue
            max_circle = max ( max_circle , len ( circle ) )
            if len ( circle ) == 2 :
                max_dist = - 1
            self.max_dist = 0
            self.neighbour = 0
    return BFFs ( )
