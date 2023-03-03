def main ( args ) :
    import sys
    class Main ( object ) :
        def __init__ ( self ) :
            self.exec ( )
        def solve ( n , m , d , s ) :
            q = [ ]
            for i in range ( 3 ) :
                p = d [ i ]
                if used [ p ] or avail [ p ] :
                    continue
                self.score += c [ p ] [ 1 ]
                self.turn = True
            if q1 or self.q :
                break
        self.turn = 0
    def solve ( n , m , c , q1 , C ) :
        while True :
            n = cin.randint ( 1 , min ( n , m ) )
            for i in range ( n ) :
                if used [ i ] :
                    continue
                if c [ i ] [ 2 ] :
                    continue
                self.score += c [ i ] [ 1 ]
                self.turn += 1
                self.q [ i ] = True
        if q1 or self.q :
            raise Error ( "ERROR" )
        for i in range ( n ) :
            c [ i ] = [ ]
            for j in range ( n ) :
                if used [ i ] :
                    for k in range ( 3 ) :
                        c [ i ] [ j ] = cin.randint ( 1 , min ( n , m ) )
        self.c = [ ]
        for i in range ( n ) :
            for j in range ( n ) :
                c [ i ] [ j ] = ( d [ i ] [ 1 ] , d [ i ] [ 2 ] )
        self.s = [ ]
        for i in range ( n ) :
            for j in range ( 3 ) :
                c [ i ] [ j ] = ( d [ i ] [ 1 ] , d [ i ] [ 2 ] )
        self.s = [ ]
        for i in range ( n ) :
            if used [ i ] :
                self.s.append ( i )
                continue
        self.solve ( n , m , c , q1 , C )
    return self
