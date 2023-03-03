def import readline , sys , maxsize , filename
class Solution ( object ) :
    def __init__ ( self ) :
        self.tokens = sys.stdin.readline ( ).split ( )
        self.stdin = sys.stdout.readline ( ).split ( )
        self.stdout = sys.stdout.write ( 'A-large\n' )
    def readline ( self ) :
        return int ( self.readline ( ) )
    def readline ( self ) :
        return float ( self.readline ( ) )
    def main ( self ) :
        return readline ( )
    def readline ( self ) :
        return int ( self.readline ( ) )
    def eval ( self , set ) :
        if isinstance ( set , set ) :
            set = set ( set ( ) )
        return p * ( set ( set ( ) ) if set ( ) else r ).eval ( set )
    def solve ( self , test ) :
        print ( 'Case #%d: ' % test , file = sys.stderr )
        lines = randint ( 1 , 10000 )
        lines = [ line.rstrip ( ) for line in open ( self.stdin ).readlines ( ) ]
        s = ''.join ( lines ).replace ( '(' , ' ( ' ).replace ( ')' , ' ) ' )
        s = s.split ( )
        t = Tree ( s )
        n = randint ( 1 , 10000 )
        for i in range ( n ) :
            next ( t )
            k = randint ( 1 , 10000 )
            seen = set ( )
            for j in range ( k ) :
                seen.add ( next ( t ) )
            print ( t.eval ( seen ) )
    def eat ( self ) :
        x = [ ]
        while True :
            x.append ( [ 0 ] * 100000 )
        return x
    def solve ( self ) :
        try :
            f = open ( self.filename + '.in' , 'r' )
            f.close ( )
            f = open ( self.filename + '.out' , 'w' )
            eat ( '' )
            f.close ( )
        except :
            sys.exit ( - 1 )
        return x
