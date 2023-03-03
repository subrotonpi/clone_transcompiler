def _import ( ) : return int ( raw_input ( ) )
def _import ( ) : return int ( raw_input ( ) )
def _import ( ) : return float ( raw_input ( ) )
def _import ( ) : return sys.stdin.read ( )
class Main ( object ) :
    def __init__ ( self ) :
        self._import ContestScanner
        self._import Writer
        self._import ( )
        self.solve ( )
        self._import ( )
    def solve ( self ) :
        n , m = self._import ( )
        into = [ 0 ] * n
        for i in range ( m ) :
            a , b = self._import ( )
            into [ a ] += 1
            into [ b ] += 1
        for i in range ( n ) :
            if into [ i ] % 2 == 1 :
                print ( "NO" )
                return
        print ( "YES" )
class Writer ( object ) :
    def __init__ ( self , filename ) :
        self._import ( )
        self._file = open ( filename , "w" )
    def write ( self , file ) :
        self._file.write ( file.read ( ) )
    def readline ( self ) :
        while ( not self._file.readline ( ).strip ( ) ) :
            line = self._file.readline ( )
            if line and not line.startswith ( "#" ) :
                line = line.rstrip ( )
            if line and not line.startswith ( "#" ) :
                line = line [ 1 : ]
            if line and not line.startswith ( "#" ) :
                line = line.strip ( )
            if line and not line.startswith ( "#" ) :
                continue
            line = line.strip ( )
            if line and not line.startswith ( "#" ) :
                continue
            line = line.strip ( )
            if line and not line.startswith ( "#" ) :
                continue
            return line
return Writer ( )
