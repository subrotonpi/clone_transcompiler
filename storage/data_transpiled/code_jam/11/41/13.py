def _import ( ) :
    from math import sin , cos , pi
    class x :
        def __init__ ( self , xx , yy ) :
            self.x = xx
            self.y = yy
        def __lt__ ( self , z ) :
            if self.x != z [ 0 ] :
                return self.x - self.x
            return self.y - self.y
    def main ( args ) :
        with open ( args [ 0 ] ) as f :
            t = int ( args [ 1 ] )
            for tt in range ( 1 , t + 1 ) :
                X , S , R , z = f.read ( )
                n = len ( [ x for x in range ( 2 * n + 1 ) if x != z ] )
                U = [ ]
                e = [ ( x , i + 1 ) for x in range ( 2 * n + 1 ) if x != z ]
                w = [ ( x , - ( x + 1 ) ) for x in range ( n + 1 ) if x != z ]
                e.append ( ( X , 0 ) )
                A = [ ( x , i + 1 ) for x in range ( X ) if x != z ]
                csp , cp , lpos = 0 , 0
                for i in range ( 0 , X ) :
                    if e [ cp ] [ 0 ] == i :
                        lpos = i
                        if i == X :
                            break
                        while True :
                            if e [ cp ] [ 1 ] < 0 :
                                U [ - e [ cp ] [ 1 ] - 1 ] = False
                            else :
                                U [ e [ cp ] [ 1 ] - 1 ] = True
                            cp += 1
                csp = 0
                for j in range ( n ) :
                    if U [ j ] and w [ j ] > csp :
                        csp = w [ j ]
                A.append ( ( csp + S ) / ( A [ i ] + R - S ) )
    return x , y
