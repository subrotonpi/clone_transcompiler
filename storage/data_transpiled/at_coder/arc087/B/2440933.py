def import _main
class Main ( object ) :
    def __init__ ( self ) :
        self.s = raw_input ( )
    def g_int ( self ) :
        return int ( self.s )
    def main ( self ) :
        v = self.s.split ( )
        x , y = g_int ( ) , g_int ( )
        dx , dy = [ ] , [ ]
        dir = True
        d = 0
        for c in v :
            if c == 'T' :
                ( dir , dx , dy ) = [ d ] , [ ]
                d = 0
                dir ^= True
            else :
                d += 1
        ( dir , dx , dy ) = [ d ] , [ ]
        x -= dx.pop ( 0 )
        print ( 'Yes' if dp ( dx , x ) and dp ( dy , y ) else 'No' )
    def dp ( self , goal ) :
        self.set , buf = set ( ) , set ( )
        for v in self.list :
            buf = [ ]
            for base in self.set :
                buf.append ( base + v )
                buf.append ( base - v )
            self.set = self.set ( buf )
        return goal in self.set
