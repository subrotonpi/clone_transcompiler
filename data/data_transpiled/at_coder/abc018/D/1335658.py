def main ( ) :
    import sys
    class ValentinsDay ( object ) :
        def __init__ ( self ) :
            self.valentins = ValentinsDay ( )
            self.valentins.run ( )
    class ValentinsDay ( object ) :
        def __init__ ( self ) :
            self.valentins = ValentinsDay ( )
            self.valentins.run ( )
        def __init__ ( self ) :
            self.valentins.run ( )
        def cin ( self ) :
            with open ( "/proc/valentins/" ) as cin :
                self.valentins.run ( )
                self.valentins.N = self.valentins.N
                self.valentins.M = self.valentins.M
                self.valentins.P = self.valentins.P
                self.valentins.Q = self.valentins.Q
                self.valentins.R = self.valentins.R
                self.valentins.chocos = [ ]
                for i in range ( R ) :
                    from_ = cin.read ( ) - 1
                    to_ = cin.read ( ) - 1
                    happiness = cin.read ( )
                    self.chocos.append ( ( from_ , to_ , happiness ) )
        def run ( self ) :
            max_happiness = 0
            for i in range ( 1 << self.valentins.N ) :
                if flag_count ( i ) != self.valentins.P :
                    continue
                scores = [ ]
                for j in range ( self.valentins.N ) :
                    if ( i >> j & 1 ) == 1 :
                        self.getScores ( j , scores )
                scores.sort ( )
                tmp_max = self.getMaxScore ( scores )
                max_happiness = max ( max_happiness , tmp_max )
            print ( max_happiness )
        def getMaxScore ( self ) :
            max = 0
            for i in range ( self.valentins.N - 1 , self.valentins.M - 1 , self.valentins.P - 1 , self.valentins.Q - 1 ) :
                max += scores [