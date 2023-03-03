def import _main
class Main ( object ) :
    def __init__ ( self ) :
        self.ret = 0
    def __call__ ( self , now , parent , h , table ) :
        with open ( self.filename , 'r' ) as sc :
            n = sc.read ( )
            x = sc.read ( ) - 1
            h = [ sc.read ( ) ]
        table = [ [ ] for _ in range ( n ) ]
        for _ in range ( n - 1 ) :
            a = sc.read ( ) - 1
            b = sc.read ( ) - 1
            table [ a ].append ( b )
        dfs ( x , - 1 , h , table )
        print ( self.ret )
