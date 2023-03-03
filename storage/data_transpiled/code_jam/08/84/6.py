def _import ( ) : return
class Template ( object ) :
    def __init__ ( self ) :
        self.stdin = open ( self.name + '.stdin' , 'r' )
        self.stdout = open ( self.name + '.stdout' , 'w' )
        self.stdout.close ( )
    def solve ( self ) :
        tests = randint ( 1 , len ( self.stdin ) )
        for test in range ( 1 , tests + 1 ) :
            self.stdin.readline ( )
            if self.stdin is None :
                return
            self.stdin.readline ( )
        self.stdin.readline ( )
        self.stdout.readline ( )
        self.stdout.close ( )
    def main ( self ) :
        yield Template ( self.stdin )
    def run ( self ) :
        while not self.stdin.readline ( ).strip ( ) :
            line = self.stdin.readline ( )
            if not line :
                return
            self.stdin.readline ( )
        self.stdin.readline ( )
        self.stdout.close ( )
    def run ( self ) :
        self.stdin.readline ( )
    def run ( self ) :
        while not self.stdin.readline ( ).strip ( ) :
            line = self.stdin.readline ( )
            if not line :
                return
            self.stdin.readline ( )
    def run ( self ) :
        return eval ( self.stdin.readline ( ) )
    def run ( self ) :
        return eval ( self.stdin.readline ( ) )
    def run ( self ) :
        return run ( self )
    def run ( self ) :
        while not self.stdin.readline ( ).strip ( ) :
            line = self.stdin.readline ( )
            if not line :
                return
            self.stdin.readline ( )
            self.stdout.close ( )
    def run ( self ) :
        return run ( self )
