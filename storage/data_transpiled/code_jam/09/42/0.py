def _ _ main _ _ ( ) : return
class Solution ( object ) :
    def __init__ ( self ) :
        self.tokens = [ ]
        self.stdin = open ( '/dev/null' , 'w' )
        self.stdout.write ( 'Case #%d: ' % self.r1 )
        self.n = 1
        self.m = 1
        self.d = [ ]
        self.filename = 'B-large'
    def solve ( self , test ) :
        print ( test )
        self.stdout.write ( 'Case #%d: ' % self.r1 )
        self.n = randint ( 1 , r1 )
        self.m = randint ( 1 , r1 )
        self.d = [ ]
        self.f = [ ]
        for i in range ( self.n ) :
            self.f.append ( next ( ) )
        self.can_fand = [ ]
        self.fall = [ ]
        for i in range ( self.n ) :
            for j in range ( self.m ) :
                self.fall.append ( next ( ) )
        self.ans = int ( self.ans )
        for j in range ( self.n ) :
            for l in range ( self.n ) :
                for r in range ( self.n ) :
                    self.ans = min ( self.ans , self.d [ i ] [ j ] )
            self.out.write ( 'No' if ans == int ( self.ans ) else 'Yes %d' % ans )
    def run ( self ) :
        try :
            self.stdin = open ( self.filename + '.in' , 'r' )
            self.stdout = open ( self.filename + '.out' , 'w' )
            self.eat ( '' )
        except Exception as e :
            traceback.print_exc ( )
            return
        self.ans = int ( self.ans )
    def solve ( self ) :
        for i in range ( self.n ) :
            self.ans = int ( self.ans )
    def eat ( self ) :
        for s in self.tokens :
            self.eat ( s )
    return Solution
