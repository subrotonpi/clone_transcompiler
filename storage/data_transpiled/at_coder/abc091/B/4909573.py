def import sys
class Main ( object ) :
    def __init__ ( self ) :
        self.sc = sys.stdin
        self.call = [ ]
        self.blue = [ ]
        self.n = len ( self.sc )
        for s in self.sc :
            if s not in self.blue :
                self.call.append ( s )
            self.blue.append ( s )
        self.m = len ( self.sc )
        for s in self.sc :
            self.blue.remove ( s )
        self.max = 0
        for i in self.call :
            cnt = 0
            for j in self.blue :
                if i == j :
                    cnt += 1
            self.max = max ( self.max , cnt )
        print ( self.max )
