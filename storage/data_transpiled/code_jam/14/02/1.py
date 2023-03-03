def _import ( ) : return
class cookieclicker ( object ) :
    def __init__ ( self ) :
        self.stdin = open ( '/dev/null' , 'r' )
        self.stdout = open ( '/dev/null' , 'w' )
        self.NAME = 'B-large'
    def main2 ( self ) :
        C , F , X = self._unpack ( '>d' , '<' )
        min = 1l << 60
        currate = 2
        ddays = 0
        while True :
            tr = ddays + X / currate
            if tr < min :
                min = tr
            if ddays > min :
                break
            ddays += C / currate
            currate += F
        self.stdout.write ( '%.7f\n' % min )
    def main ( self ) :
        self.stdin = open ( self.NAME + '.in' , 'r' )
        self.stdout = open ( self.NAME + '.out' , 'w' )
        self.num_cases = self.stdin.tell ( )
        for test in range ( 1 , num_cases + 1 ) :
            self.stdout.write ( 'Case #%d: ' % test )
            self.main2 ( self )
        self.stdout.close ( )
        sys.exit ( )
    def read ( self ) :
        self.BUFFER_SIZE = 1 << 16
        self.stdin = open ( self.NAME + '.in' , 'r' )
        self.buffer = open ( self.BUFFER_SIZE , 'r' )
        self.buffer_pointer = self.stdin.tell ( )
        self.stdin.read ( self.BUFFER_SIZE )
        self.buffer = open ( self.NAME + '.in' , 'r' )
        self.buffer_pointer = self.stdin.tell ( )
    def readline ( self ) :
        self.stdin.read ( self.BUFFER_SIZE )
        self.buffer = open ( self.NAME + '.in' , 'r' )
        self.buffer_pointer = self.stdin.tell ( )
    def read ( self ) :
        self.stdin.read ( self.BUFFER_SIZE )
        self.buffer = open ( self.NAME + '.in' , 'r' )
    