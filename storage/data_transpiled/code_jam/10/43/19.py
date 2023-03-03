def import code
class ProblemC ( CodeJammer ) :
    def print ( g , l ) :
        for i in range ( l ) :
            s = ""
            for j in range ( l ) :
                if g [ i ] [ j ] :
                    s += "1"
                else :
                    s += "0"
            print ( s )
    def process ( ) :
        r = reader.readInt ( )
        g = [ [ False for i in range ( 101 ) ] for j in range ( 101 ) ]
        for n in range ( r ) :
            data = reader.readArray ( )
            for i in range ( data [ 0 ] , data [ 2 ] + 1 ) :
                for j in range ( data [ 1 ] , data [ 3 ] + 1 ) :
                    g [ i ] [ j ] = True
        alive = 1
        turns = 0
        while alive > 0 :
            alive = 0
            for s in range ( 200 , - 1 , - 1 ) :
                for i in range ( 0 , s , 100 ) :
                    for j in range ( s - i , s + 1 ) :
                        if j >= 0 and j <= 100 :
                            neighs = 0
                            if i > 0 and g [ i - 1 ] [ j ] :
                                neighs += 1
                            if j > 0 and g [ i ] [ j - 1 ] :
                                neighs += 1
                            if neighs == 0 :
                                g [ i ] [ j ] = False
                            if neighs == 2 :
                                g [ i ] [ j ] = True
                            if g [ i ] [ j ] :
                                alive += 1
        turns += 1
    output ( turns )
class ProblemC ( CodeJammer ) :
    def __init__ ( self ) :
        self.p = ProblemC
        self.run ( )
