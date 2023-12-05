def import _sys , os , sys , dsu1 , dsu2 , n , rank , d , pw
class Main ( object ) :
    class FastScanner ( Scanner ) :
        def __init__ ( self ) :
            Scanner.__init__ ( self )
            try :
                sc = sys.stdin
            except :
                sc = open ( os.devnull , 'r' )
            st = sc.readline ( ).split ( )
            map = { }
            arr = [ ]
            for i in range ( 1 , n + 1 ) :
                a = dsu1.find ( i - 1 )
                b = dsu2.find ( i )
                arr.append ( a * long ( b ) )
                if arr.has_key ( arr [ arr.index ( b ) ] ) :
                    map [ arr [ arr.index ( b ) ] ] = map [ arr [ arr.index ( b ) ] ] + 1
                else :
                    map [ arr [ arr.index ( b ) ] ] = 1
            for i in range ( n ) :
                line = ''
                if st : line = st [ 0 ]
                else :
                    try : return os.popen ( line ).read ( )
                    except : pass
                while st : line += ' ' + st [ 0 ]
            return line
    class DSU ( object ) :
        def __init__ ( self , n ) :
            self.root = [ ]
            self.rank = [ ]
            for i in range ( n ) :
                self.root.append ( i )
        def find ( self , x ) :
            if self.root [ x ] == x :
                return x
            else :
                return self.find ( self.root [ x ] )
        def unite ( self , x , y ) :
            x , y = self.root [ x ] , self.rank [ y ]
            if x == y :
                return x
            if self.rank [ x ] < self.rank [ y ] :
                self.root [ x ] = y
            else :
                self.root [ y ] = x
                if self.rank [ x ] == self.rank [ y ] :
                    self.rank [ x ] += 1
