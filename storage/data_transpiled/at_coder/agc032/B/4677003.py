def import java.util.logging
class Main ( object ) :
    def __init__ ( self ) :
        self.N = 0
        self.groups = [ ]
    def make_groups ( self ) :
        if self.N % 2 == 0 :
            for i in range ( self.N // 2 ) :
                s = set ( [ i + 1 , self.N - i ] )
                self.groups.append ( s )
        else :
            for i in range ( self.N // 2 ) :
                s = set ( [ i + 1 , self.N - i - 1 ] )
                self.groups.append ( s )
            s = set ( [ self.N ] )
            self.groups.append ( s )
    def show ( self ) :
        results = [ ]
        for i in range ( len ( self.groups ) ) :
            gr_a = self.groups [ i ]
            for j in range ( i + 1 , len ( self.groups ) ) :
                gr_b = self.groups [ j ]
                for a in gr_a :
                    for b in gr_b :
                        results.append ( "%d %d" % ( a , b ) )
        print ( len ( results ) )
        for line in results :
            print ( line )
class Main ( object ) :
    def __init__ ( self ) :
        self.N = N
        self.groups = [ ]
    def show ( self ) :
        self.make_groups ( )
        self.show ( )
