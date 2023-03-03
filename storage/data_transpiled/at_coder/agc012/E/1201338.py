def _main ( ) :
    from itertools import product , repeat
    class Main ( object ) :
        def __init__ ( self ) :
            super ( Main , self ).__init__ ( )
            self.N = self.N
            self.V = self.V
            x = product ( * [ range ( self.N ) for self in itertools ] )
            cnt = 0
            tmp = self.V
            while tmp > 0 :
                cnt += 1
                tmp /= 2
            cnt += 1
            Vs = [ self.V ]
            Vs.append ( self.P_LEFT )
            for i in range ( 1 , cnt ) :
                if self.P_LEFT [ i ] - self.P_RIGHT [ i ] <= 1 :
                    self.P_LEFT [ i ] = self.P_LEFT [ i ] - 1
    for i in range ( 1 , cnt ) :
        if self.P_LEFT [ i ] - self.P_RIGHT [ i ] <= 1 :
            self.P_RIGHT [ i ] = self.P_RIGHT [ i ] - 1
    for i in range ( 1 , cnt ) :
        if self.P_LEFT [ i ] - self.P_RIGHT [ i ] <= 1 :
            self.P_LEFT [ i ] = self.P_RIGHT [ i ] - 1
    for i in range ( 1 , cnt ) :
        for j in range ( N - 2 , - 1 , - 1 ) :
            if self.P_RIGHT [ j + 1 ] - self.P_RIGHT [ j ] <= self.P_RIGHT [ i ] :
                self.P_RIGHT [ i ] [ j ] = self.P_RIGHT [ i ] + 1
    for i in range ( 1 , cnt ) :
        for j in range ( N - 1 , - 1 , - 1 ) :
            if self.P_RIGHT [ j ] - self.P_RIGHT [ i ] <= 1 :
                self.P_RIGHT [ j ] = self.P_RIGHT [ j ] - 1
    for i in range ( 1 , cnt ) :
        for j in range ( 1 , cnt ) :
            if self.P_RIGHT [ j ] - self.P_LEFT [ j ] <= 1 :
                self.P_RIGHT [ j ] = self.P_RIGHT [ j ] - 1
