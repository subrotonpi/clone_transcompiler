def _import ( ) :
    import re
    import locale
    import sys
    class B ( object ) :
        def __init__ ( self , fname ) :
            self.fname = re.sub ( '_.*' , '' , fname ).lower ( )
        def input_fname ( self ) :
            self.fname = fname + '.in'
        def output_fname ( self ) :
            self.fname = fname + '.out'
        def open ( self , mode ) :
            self.fname = os.path.join ( self.fname , mode )
        def solve ( self ) :
            h = self.fname.split ( '.' ) [ - 1 ]
            hei = self.fname.split ( '.' ) [ - 1 ]
            wid = self.fname.split ( '.' ) [ - 1 ]
            ceil = [ [ i , j ] for i in range ( hei ) for j in range ( wid ) ]
            floor = [ [ i , j ] for i in range ( hei ) for j in range ( wid ) ]
            if not floor :
                raise RuntimeError ( )
            return min ( dist , 100 )
        def solve ( self ) :
            h = self.fname.split ( '.' ) [ - 1 ]
            hei = self.fname.split ( '.' ) [ - 1 ]
            wid = self.fname.split ( '.' ) [ - 1 ]
            h = self.fname.split ( '.' ) [ - 1 ]
            h = self.fname.split ( '.' ) [ - 1 ]
            h = self.fname.split ( '.' ) [ - 1 ]
            h = self.fname.split ( '.' ) [ - 1 ]
            h = self.fname.split ( '.' ) [ - 1 ]
            h = self.fname.split ( '.' ) [ - 1 ]
            h = self.fname.split ( '.' ) [ - 1 ]
            h = self.fname.split ( '.' ) [ - 1 ]
            h = self.fname.split ( '.' ) [ - 1 ]
            h = self.fname.split ( '.' ) [ - 1 ]
            h = self.fname.split ( '.' ) [ - 1 ]
    