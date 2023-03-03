def _readline ( ) : return next ( )
class Main ( object ) :
    def __init__ ( self ) :
        self.stdin = sys.stdin
        self.stdout = sys.stdout
        self.n = self.__next__ ( )
        self.graph = self.build_graph ( self.stdin , self.n , self.n - 1 )
        self.stdout.write ( '\n' if self.isSpaceChar ( self.next ) else '' )
        self.next ( )
        self.next ( )
        self.sgn = - 1
        self.next ( )
        self.graph = self.build_graph ( self.graph , self.n , self.n - 1 )
        self.stdout.write ( '' if self.dfs ( 0 , - 1 ) == 0 else 'Bob' if self.isSpaceChar ( self.next ) else 'Alice' )
        self.stdout.flush ( )
    def dfs ( self , now ) :
        self.next ( )
        self.next ( )
    def dfs ( self , par ) :
        self.next ( )
        self.next ( )
        self.next ( )
        self.next ( )
    def dfs ( self , par ) :
        self.next ( )
        self.next ( )
        self.next ( )
        self.next ( )
    def dfs ( self , par ) :
        self.next ( )
        self.next ( )
        self.next ( )
    def dfs ( self , par ) :
        self.next ( )
        self.next ( )
        self.next ( )
    def dfs ( self , par ) :
        self.next ( )
        self.next ( )
    def dfs ( self , par ) :
        self.next ( )
        self.next ( )
    def dfs ( self , par ) :
        self.next ( )
    def dfs ( self , par ) :
        self.next ( )
    def dfs ( self , par ) :
        self.next ( )
    def debug ( self , * args ) :
        print ( "".join ( [ str ( x ) for x in args ] ) , file = sys.stderr )
