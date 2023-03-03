def world2015.round2 ( args ) :
    import os
    import sys
    import os
    import sys
    import os
    import sys
    class Pegman ( object ) :
        DIRECTIONS = [ [ 0 , 1 ] , [ 1 , 0 ] , [ 0 , - 1 ] , [ - 1 , 0 ] ]
        def __init__ ( self , input_path , args ) :
            self.input_path = input_path [ : self.input_path.rfind ( '.' ) ] + ".out"
            f = open ( self.input_path , 'w' )
            line = f.readline ( )
            self.num_problems = int ( line )
            for i in range ( self.num_problems ) :
                line = f.readline ( ).strip ( )
                tokens = line.split ( )
                R = int ( tokens [ 0 ] )
                C = int ( tokens [ 1 ] )
                cells = [ ]
                for r in range ( R ) :
                    cells.append ( r )
                res = Pegman ( ).solve ( R , C , cells )
                lines = [ ]
                if res >= 0 :
                    lines.append ( "Case #%d: %d" % ( i + 1 , res ) )
                else :
                    lines.append ( "Case #%d: IMPOSSIBLE" % ( i + 1 , res ) )
                print ( lines )
            f.close ( )
    def parse ( R , C , cells ) :
        cs = [ ]
        for r in range ( R ) :
            for c in range ( C ) :
                if cells [ r ] [ c ] == "." :
                    cs.append ( - 1 )
                elif cells [ r ] [ c ] == ">" :
                    cs.append ( 0 )
                elif cells [ r ] [ c ] == "v" :
                    cs.append ( 1 )
                elif cells [ r ] [ c ] == "<" :
                    cs.append ( 2 )
                elif cells [ r ] [ c ] == "^" :
                    cs.append ( 3 )
        return cs
    def parse ( R , C , cells ) :
        rr , cc = r + DIRECTIONS [ dir ]
        if rr <= cc :
        INDENT