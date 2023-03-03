def _ _ main _ _ ( ) : return sys.stdin
class Main ( object ) :
    def __init__ ( self ) :
        self.N = int ( )
        self.M = int ( )
        self.E = [ ]
        for i in range ( M ) :
            self.E.append ( ( self.N - 1 , self.M - 1 ) )
        self.path = solve ( )
        f = open ( self.path [ 0 ] , 'w' )
        f.write ( str ( len ( path ) ) )
        j = [ ]
        for each in path :
            j.append ( str ( each + 1 ) )
        f.write ( j )
        f.flush ( )
    def __init__ ( self ) :
        self.a = None
        self.b = None
    def solve ( self ) :
        q = deque ( )
        rin = [ ]
        for e in self.E :
            if not rin [ e.a ] :
                rin [ e.a ] = [ ]
            rin [ e.b ].append ( e.b )
        if not rin [ e.b ] :
            rin [ e.b ] = [ ]
        rin [ e.b ].append ( e.a )
    def solve ( self ) :
        while True :
            self.q.append ( 0 )
    def readline ( self ) :
        while True :
            first = self.q.pop ( )
            for each in rin [ first ] :
                if each not in self.q :
                    self.q.append ( each )
                    self.q.add ( each )
                    continue
            break
        return q
    @ staticmethod
    def readline ( ) :
        while True :
            last = self.q.pop ( )
            for each in self.rin [ last ] :
                if each not in self.q :
                    self.q.append ( each )
                    continue
            break
        return readline
